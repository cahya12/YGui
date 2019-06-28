package com.labs247.yava.bean;

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
import com.labs247.jsf.ejb.HdfsDatasetAmbariJMXUtil; //class parsing json using gson
import com.labs247.jsf.rest.FSDatasetRestClient; //
import com.labs247.jsf.model.HdfsDatasetState;

@ManagedBean
@RequestScoped
public class HdfsDiskView implements Serializable {
	
	static final long serialVersionUID = 1237l;
	private DonutChartModel donutModel;
	
	String _percentage;

	static Logger logger = Logger.getLogger(HdfsDiskView.class);

	static String host = "192.168.3.132";
	static String port = "50075";
	static String qry_name = "Hadoop:name=FSDatasetState,service=DataNode";

	private List<HdfsDatasetState> _bbs_;

	FSDatasetRestClient _client = new FSDatasetRestClient(host, port);

	HdfsDatasetState _fs = new HdfsDatasetState();

	@PostConstruct
	public void init() {
		getJSON();
		createDonutModel();
	}

	public void getJSON() {
		System.out.println("Ini yang load terus lo");

		try {

			String qry_name = "Hadoop:name=FSDatasetState,service=DataNode";
			String _url = "http://" + host + ":" + port + "/jmx?qry=" + qry_name;
			String json = _client.ambari_plain_client(_url);
			_bbs_ = HdfsDatasetAmbariJMXUtil.json2FSDatasetState(json);
			_bbs_.size();

			for (HdfsDatasetState i : _bbs_) {
				_fs = i;

			}

		} catch (Exception e) {
			logger.error(e);
		}

	}

	/**
	 * 
	 */
	public void createDonutModel() {
		donutModel = new DonutChartModel();
		ChartData data = new ChartData();
		
		System.out.println("................................ Chart Data ...............................");
		System.out.println(data);
		System.out.println("................................ End Chart Data ...........................");

		DonutChartDataSet dataSet = new DonutChartDataSet();
		
		System.out.println(".................... DataSet ...........................");
		System.out.println(dataSet);
		System.out.println("..................... End DataSet ......................");
		
		List<Number> values = new ArrayList<>();
		
		System.out.println("......................... Values Data .................");
		System.out.println(values);
		System.out.println("........................... End Values Data.............");

		Double op1 = 1073741824.0;
		Double c = _fs.getCapacity() / op1;
		DecimalFormat dfC = new DecimalFormat("#.##");
		c = Double.valueOf(dfC.format(c));

		Double d = _fs.getDfsUsed() / op1;
		DecimalFormat dfD = new DecimalFormat("#.##");
		d = Double.valueOf(dfD.format(d));

		Double r = _fs.getRemaining() / op1;
		DecimalFormat dfR = new DecimalFormat("#.##");
		r = Double.valueOf(dfR.format(r));

		Double n = c - d - r;
		Double total = d + n;
		DecimalFormat dfT = new DecimalFormat("#.##");
		total = Double.valueOf(dfT.format(total));
		
		Double percentage = (total / c) * 100;
		DecimalFormat dfP = new DecimalFormat("#");
		percentage = Double.valueOf(dfP.format(percentage));
		_percentage = percentage.toString() + "%";

		values.add(total);
		values.add(r);
		dataSet.setData(values);

		List<String> bgColors = new ArrayList<>();
		bgColors.add("rgb(1, 155, 0)");
		bgColors.add("rgb(191, 191, 191)");
		dataSet.setBackgroundColor(bgColors);

		data.addChartDataSet(dataSet);
		List<String> labels = new ArrayList<>();
		labels.add("Disk Used");
		labels.add("Remaining");
		data.setLabels(labels);

		donutModel.setData(data);
	}

	public String get_percentage() {
		return _percentage;
	}

	public void set_percentage(String _percentage) {
		this._percentage = _percentage;
	}

	public DonutChartModel getDonutModel() {
		return donutModel;
	}

	public void setDonutModel(DonutChartModel donutModel) {
		this.donutModel = donutModel;
	}

	public List<HdfsDatasetState> get_bbs_() {
		return _bbs_;
	}

	public void set_bbs_(List<HdfsDatasetState> _bbs_) {
		this._bbs_ = _bbs_;
	}

}
