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

import com.labs247.jsf.ejb.ResourceManagerHeapJMXUtil;
import com.labs247.jsf.rest.ResourceManagerRestClient;
import com.labs247.jsf.model.ResourceManagerHeapDatasetState;

@ManagedBean
@RequestScoped
public class ResourceManagerHeapView implements Serializable {
	
	static final long serialVersionUID = 1237l;
	private DonutChartModel donutModel;
	
	String _percentage;

	static Logger logger = Logger.getLogger(ResourceManagerHeapView.class);

	static String host = "192.168.3.132";
	static String port = "8088";

	private List<ResourceManagerHeapDatasetState> _bbs_;

	ResourceManagerRestClient client = new ResourceManagerRestClient(host, port);

	ResourceManagerHeapDatasetState object = new ResourceManagerHeapDatasetState();

	@PostConstruct
	public void init() {
		getJSON();
		createDonutModel();
	}

	public void getJSON() {

		try {

			String _url = "http://192.168.3.132:8088/jmx?qry=Hadoop:name=JvmMetrics,service=ResourceManager";

			String json = client.ambari_plain_client(_url);

			_bbs_ = ResourceManagerHeapJMXUtil.jsonResourceManagerHeap(json);

			_bbs_.size();

			for (ResourceManagerHeapDatasetState i : _bbs_) {

				object = i;

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
		
		Double heapMax = object.getMemHeapMaxM();
		
		
		Double heapUsed = object.getMemHeapUsedM();
		
		
		
		Double freeSpace = heapMax-heapUsed;
		
		Double persentaseHeap = (heapUsed/heapMax)*100;
		DecimalFormat decimalFormatPercentage = new DecimalFormat("#");
		persentaseHeap = Double.valueOf(decimalFormatPercentage.format(persentaseHeap));
		_percentage = persentaseHeap.toString()+"%";
		
		values.add(heapUsed);
		values.add(freeSpace);
		dataSet.setData(values);

		List<String> bgColors = new ArrayList<>();
		bgColors.add("rgb(1, 155, 0)");
		bgColors.add("rgb(191, 191, 191)");
		dataSet.setBackgroundColor(bgColors);

		data.addChartDataSet(dataSet);
		List<String> labels = new ArrayList<>();
		labels.add("Disk Used");
		labels.add("Free Space");
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

	public List<ResourceManagerHeapDatasetState> get_bbs_() {
		return _bbs_;
	}

	public void set_bbs_(List<ResourceManagerHeapDatasetState> _bbs_) {
		this._bbs_ = _bbs_;
	}

}
