/**
 * 
 */
package com.labs247.yava.bean;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.RequestScoped;
import javax.inject.Named;

import org.primefaces.model.chart.DonutChartModel;
import org.primefaces.model.charts.ChartData;
import org.primefaces.model.charts.donut.DonutChartDataSet;

import com.labs247.yava.ejb.NamenodeClientyava;

//@ManagedBean
@RequestScoped
@Named
public class HdfsDiskFree implements Serializable {
	private static final long serialVersionUID = 1237l;

	private DonutChartModel donutModel;

	String Percen;

	@EJB
	NamenodeClientyava data;

	@PostConstruct
	public void init() {

		createDonutModel();
//		DonutChartModel donutModel = new DonutChartModel();
//
//		Map<String, Number> circle1 = new LinkedHashMap<String, Number>();
//		circle1.put("Disk Used GB", data.getMetrics().getDfs().getFSNamesystem().getCapacityTotalGB());
//		donutModel.addCircle(circle1);
//
//		Map<String, Number> circle2 = new LinkedHashMap<String, Number>();
//		circle2.put("Disk Remaining", data.getMetrics().getDfs().getFSNamesystem().getCapacityRemainingGB());
//		donutModel.addCircle(circle2);

	}

	public void createDonutModel() {
		donutModel = new DonutChartModel();
		ChartData data_chart = new ChartData();
		
		DonutChartDataSet dataSet = new DonutChartDataSet();
		List<Number> values = new ArrayList<>();

		Double Total_Disk = data.getMetrics().getDfs().getFSNamesystem().getCapacityTotalGB();
		DecimalFormat dfC = new DecimalFormat("#.##");
		Total_Disk = Double.valueOf(dfC.format(Total_Disk));

		System.out.println(Total_Disk);

		Double Disk_Remaining = data.getMetrics().getDfs().getFSNamesystem().getCapacityRemainingGB();
		DecimalFormat dfD = new DecimalFormat("#.##");
		Disk_Remaining = Double.valueOf(dfD.format(Disk_Remaining));

		System.out.println(Disk_Remaining);

		Double _percentage = (Total_Disk - Disk_Remaining) * 100;
		DecimalFormat dfp = new DecimalFormat("#");
		_percentage = Double.valueOf(dfp.format(_percentage));
		Percen = String.valueOf(_percentage) + "%";

		System.out.println(_percentage);

		values.add(Total_Disk);
		values.add(Disk_Remaining);
		dataSet.setData(values);

		List<String> bgColors = new ArrayList<>();
		bgColors.add("rgb(1, 155, 0)");
		bgColors.add("rgb(191, 191, 191)");
		dataSet.setBackgroundColor(bgColors);

		data_chart.addChartDataSet(dataSet);
		List<String> labels = new ArrayList<>();
		labels.add("Disk Used GB");
		labels.add("Remaining GB");
		data_chart.setLabels(labels);

		donutModel.setData((List<Map<String, Number>>) data_chart);

	}

	public DonutChartModel getDonutModel() {
		return donutModel;
	}

	public void setDonutModel(DonutChartModel donutModel) {
		this.donutModel = donutModel;
	}

}
