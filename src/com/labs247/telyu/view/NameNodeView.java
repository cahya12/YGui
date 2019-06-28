package com.labs247.telyu.view;



import com.labs247.telyu.ejb.NamenodeClient;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateful;
import javax.inject.Named;

import org.primefaces.model.charts.ChartData;
import org.primefaces.model.charts.donut.DonutChartDataSet;
import org.primefaces.model.charts.donut.DonutChartModel;
import org.primefaces.model.charts.pie.PieChartDataSet;
import org.primefaces.model.charts.pie.PieChartModel;

@Stateful 
@Named
public class NameNodeView {
//    private PieChartModel model;
    private DonutChartModel model;
    String _percentageJvmMetrics;
    
    @EJB NamenodeClient namenode;
    //private DatanodeView data = new DatanodeView();

    @PostConstruct
    public void init() {
    	
    	try {
    		model = new DonutChartModel();
            ChartData data = new ChartData();
             
            DonutChartDataSet dataSet = new DonutChartDataSet();
            List<Number> values = new ArrayList<>();
            
            Double heapUsed = namenode.getServiceComponentInfo().getHeapMemoryUsed();

    		Double heapMax = namenode.getServiceComponentInfo().getHeapMemoryMax();
    		
    		Double heapNonUsed = heapMax - heapUsed;
    		
    		Double percentageJvm = (heapUsed / heapMax) * 100;
    		DecimalFormat dfP = new DecimalFormat("#");
    		percentageJvm = Double.valueOf(dfP.format(percentageJvm));
    		_percentageJvmMetrics = percentageJvm.toString() + "%";
            
            values.add(heapUsed);
            values.add(heapNonUsed);         
            dataSet.setData(values);
             
            List<String> bgColors = new ArrayList<>();
            bgColors.add("rgb(46, 204, 113)");
            bgColors.add("rgb(189, 195, 199)");
            dataSet.setBackgroundColor(bgColors);
             
            data.addChartDataSet(dataSet);
            List<String> labels = new ArrayList<>();
            labels.add("Heap Used");
            labels.add("Heap Free");
            data.setLabels(labels);
             
            model.setData(data);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error.");
		}
    	
    	
    	
    	
    //	data = new DatanodeView();
//    	PIEEE BISAAA
//        model = new PieChartModel();
//        ChartData datachart = new ChartData();
//        
//        PieChartDataSet dataSet = new PieChartDataSet();
//        List<Number> values = new ArrayList<>();
//        
//        values.add(data.getMemory().getMemFree());
//        values.add(data.getMemory().getMemFreeAvg());
//        values.add(data.getMemory().getMemFreeMax());
//        values.add(data.getMemory().getMemFreeMin());
//        
//        values.add(data.getMemory().getSwapFree());
//        values.add(data.getMemory().getSwapFreeAvg());
//        values.add(data.getMemory().getSwapFreeMax());
//        values.add(data.getMemory().getSwapFreeMin());
//        
//        dataSet.setData(values);
//        
//        List<String> bgColors = new ArrayList<>();
//        bgColors.add("rgb(237, 76, 103)");
//        bgColors.add("rgb(181, 52, 113)");
//        bgColors.add("rgb(131, 52, 113)");
//        bgColors.add("rgb(111, 30, 81)");
//        
//        bgColors.add("rgb(18, 203, 196)");
//        bgColors.add("rgb(18, 137, 167)");
//        bgColors.add("rgb(6, 82, 221)");
//        bgColors.add("rgb(27, 20, 100)");
//        
//        dataSet.setBackgroundColor(bgColors);
//         
//        datachart.addChartDataSet(dataSet);
//        List<String> labels = new ArrayList<>();
//        labels.add("Mem Free");
//        labels.add("Mem Free AVG");
//        labels.add("Mem Free MAX");
//        labels.add("Mem Free MIN");
//        
//        labels.add("Swap Free");
//        labels.add("Swap Free AVG");
//        labels.add("Swap Free MAX");
//        labels.add("Swap Free MIN");
//        datachart.setLabels(labels);
//         
//        model.setData(datachart);
        
//        BATAS PIE BISAA
        
//        model.set("MemoryFree", data.getMemory().getMemFree());//jobs in thousands
//        model.set("MemoryFreeAvg", data.getMemory().getMemFreeAvg() );
//        model.set("MemoryFreeMax", data.getMemory().getMemFreeMax());
//        model.set("MemoryFreeMin", data.getMemory().getMemFreeMin() );
//        
//        model.set("SwapFree", data.getMemory().getSwapFree());//jobs in thousands
//        model.set("SwapFreeAvg", data.getMemory().getSwapFreeAvg() );
//        model.set("SwapFreeMax", data.getMemory().getSwapFreeMax());
//        model.set("SwapFreeMin", data.getMemory().getSwapFreeMin() );
//  
//        //followings are some optional customizations:
//        //set title
//        model.setTitle("Memory free");
//        //set legend position to 'e' (east), other values are 'w', 's' and 'n'
//        model.setLegendPosition("e");
//        //enable tooltips
//        model.setShowDatatip(true);
//        //show labels inside pie chart
//        model.setShowDataLabels(true);
//        //show label text  as 'value' (numeric) , others are 'label', 'percent' (default). Only one can be used.
//        model.setDataFormat("value");
//        //format: %d for 'value', %s for 'label', %d%% for 'percent'
//        model.setDataLabelFormatString("%dK");
//        //pie sector colors
//        model.setSeriesColors("aaf,afa,faa,ffa,aff,faf,ddd");
    }
    
    public String get_percentageJvmMetrics() {
		return _percentageJvmMetrics;
	}

	public void set_percentageJvmMetrics(String _percentageJvmMetrics) {
		this._percentageJvmMetrics = _percentageJvmMetrics;
	}
    
    public DonutChartModel getDonutModel1() {
        return model;
    }
    

//    public PieChartModel getModel() {
//        return model;
//    }
}