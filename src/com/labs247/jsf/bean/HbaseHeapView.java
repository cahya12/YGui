package com.labs247.jsf.bean;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.jboss.logging.Logger;
import org.primefaces.model.charts.ChartData;
import org.primefaces.model.charts.donut.DonutChartDataSet;
import org.primefaces.model.charts.donut.DonutChartModel;
import com.labs247.jsf.ejb.HbaseHeapJMXUtil;
import com.labs247.jsf.rest.HbaseDataRestClient;
import com.labs247.jsf.model.HbaseHeapDataState;

@ManagedBean
@RequestScoped

public class HbaseHeapView implements Serializable {

	static final long serialVersionUID = 1237l;
	private DonutChartModel donutModel;
	
	String _percentageHBASE;

	static Logger logger = Logger.getLogger(HbaseHeapView.class);

	static String host = "192.168.3.132";
	static String port = "16010";

	private List<HbaseHeapDataState> _bbs_;

	HbaseDataRestClient _client = new HbaseDataRestClient(host, port);

	HbaseHeapDataState _fs = new HbaseHeapDataState();

	@PostConstruct
	public void init() {
		getJSON();
		createDonutModel();
	}

	public void getJSON() {

		try {

			String _url = "http://192.168.3.132:16010/jmx?qry=Hadoop:name=JvmMetrics,service=HBase";

			String json = _client.ambari_plain_client(_url);

			_bbs_ = HbaseHeapJMXUtil.json2FSDatasetState(json);

			_bbs_.size();

			for (HbaseHeapDataState i : _bbs_) {
				_fs = i;

			}

		} catch (Exception e) {
			logger.error(e);
		}

	}

	public void createDonutModel() {
		donutModel = new DonutChartModel();
		ChartData data = new ChartData();

		DonutChartDataSet dataSet = new DonutChartDataSet();
		List<Number> values = new ArrayList<>();
		
		Double heapUsed = _fs.getMemHeapUsedM();
		Double heapMax = _fs.getMemHeapMaxM();
		Double heapNonUsed = heapMax - heapUsed;
		
		
		Double percentageJvm = (heapUsed / heapMax) * 100;
		DecimalFormat dfP = new DecimalFormat("#");
		percentageJvm = Double.valueOf(dfP.format(percentageJvm));
		_percentageHBASE = percentageJvm.toString() + "%";
		
		values.add(heapUsed);
		values.add(heapNonUsed);
		dataSet.setData(values);
		
		List<String> bgColors = new ArrayList<>();
		bgColors.add("rgb(1, 155, 0)");
		bgColors.add("rgb(191, 191, 191)");
		dataSet.setBackgroundColor(bgColors);

		data.addChartDataSet(dataSet);
		List<String> labels = new ArrayList<>();
		labels.add("Memory Used");
		labels.add("Memory Free");
		data.setLabels(labels);

		donutModel.setData(data);
	}

	public String get_percentageHBASE() {
		return _percentageHBASE;
	}

	public void set_percentageHBASE(String _percentageHBASE) {
		this._percentageHBASE = _percentageHBASE;
	}

	public DonutChartModel getDonutModel() {
		return donutModel;
	}

	public void setDonutModel(DonutChartModel donutModel) {
		this.donutModel = donutModel;
	}

	public List<HbaseHeapDataState> get_bbs_() {
		return _bbs_;
	}

	public void set_bbs_(List<HbaseHeapDataState> _bbs_) {
		this._bbs_ = _bbs_;
	}

}