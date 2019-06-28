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
import com.labs247.jsf.ejb.NamenodeAmbariJMXUtil;
import com.labs247.jsf.rest.NamenodeRestClient;
import com.labs247.jsf.model.NamenodeDatasetState;

@ManagedBean
@RequestScoped
public class NamenodeView implements Serializable {

	static final long serialVersionUID = 1237l;
	
	private DonutChartModel donutModel;
	
	String _percentageJvmMetrics;

	static Logger logger = Logger.getLogger(NamenodeView.class);

	static String host = "192.168.3.132";
	static String port = "50075";
	static String qry_name = "Hadoop:name=JvmMetrics,service=DataNode";

	private List<NamenodeDatasetState> _bbs_;

	NamenodeRestClient _client = new NamenodeRestClient(host, port);

	NamenodeDatasetState _jvm = new NamenodeDatasetState();

	@PostConstruct
	public void init() {
		getJSON();
		createDonutModel();
	}

	public void getJSON() {

		try {

			String qry_name = "Hadoop:name=JvmMetrics,service=DataNode";

			String _url = "http://" + host + ":" + port + "/jmx?qry=" + qry_name;

			String json = _client.ambari_plain_client(_url);

			_bbs_ = NamenodeAmbariJMXUtil.json2JvmMetrics(json);

			_bbs_.size();

			for (NamenodeDatasetState i : _bbs_) {
				_jvm = i;

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

		Double heapUsed = _jvm.getMemHeapUsedM();

		Double heapMax = _jvm.getMemHeapMaxM();
		
		Double heapNonUsed = heapMax - heapUsed;
		
		Double percentageJvm = (heapUsed / heapMax) * 100;
		DecimalFormat dfP = new DecimalFormat("#");
		percentageJvm = Double.valueOf(dfP.format(percentageJvm));
		_percentageJvmMetrics = percentageJvm.toString() + "%";

		values.add(heapUsed);
		values.add(heapNonUsed);
		dataSet.setData(values);

		List<String> bgColors = new ArrayList<>();
		bgColors.add("rgb(1, 155, 0)");
		bgColors.add("rgb(191, 191, 191)");
		dataSet.setBackgroundColor(bgColors);

		data.addChartDataSet(dataSet);
		List<String> labels = new ArrayList<>();
		labels.add("Heap Used");
		labels.add("Heap Free");
		data.setLabels(labels);

		donutModel.setData(data);
	}
	
	public String get_percentageJvmMetrics() {
		return _percentageJvmMetrics;
	}

	public void set_percentageJvmMetrics(String _percentageJvmMetrics) {
		this._percentageJvmMetrics = _percentageJvmMetrics;
	}
	
	public DonutChartModel getDonutModel() {
		return donutModel;
	}

	public void setDonutModel(DonutChartModel donutModel) {
		this.donutModel = donutModel;
	}

	public List<NamenodeDatasetState> get_bbs_() {
		return _bbs_;
	}

	public void set_bbs_(List<NamenodeDatasetState> _bbs_) {
		this._bbs_ = _bbs_;
	}

}
