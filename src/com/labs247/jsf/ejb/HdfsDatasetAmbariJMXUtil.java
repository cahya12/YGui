package com.labs247.jsf.ejb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.labs247.jsf.model.HdfsDatasetState;

@ManagedBean
@RequestScoped
public class HdfsDatasetAmbariJMXUtil implements Serializable{

	private static final long serialVersionUID = 1L;
	
	//private static DonutChartModel donutModel;
	
	HdfsDatasetState _fs = new HdfsDatasetState();

	public static List<HdfsDatasetState> json2FSDatasetState(String json) throws Exception {

		List<HdfsDatasetState> _beans_ = new ArrayList<HdfsDatasetState>();
		
		JsonParser parser = new JsonParser();

		JsonElement jsonTree = parser.parse(json);

		if (jsonTree.isJsonObject()) {
			/*
			 * "beans" : [ { "name" : "Hadoop:service=DataNode,name=FSDatasetState",
			 * "modelerType" : "FSDatasetState", "tag.Context" : "FSDatasetState",
			 * "tag.StorageInfo" : "FSDataset{dirpath='[/hadoop/hdfs/data]'}",
			 * "tag.Hostname" : "yava3-132.labs247.com", "Capacity" : 41005880832, "DfsUsed"
			 * : 3565147311, "Remaining" : 4939434385, "NumFailedVolumes" : 0,
			 * "LastVolumeFailureDate" : 0, "EstimatedCapacityLostTotal" : 0, "CacheUsed" :
			 * 0, "CacheCapacity" : 0, "NumBlocksCached" : 0, "NumBlocksFailedToCache" : 0,
			 * "NumBlocksFailedToUnCache" : 3586 } ]
			 */

			JsonObject jsonObject = jsonTree.getAsJsonObject();

			JsonArray beans = (JsonArray) parser.parse(jsonObject.get("beans").toString());

			for (JsonElement bean : beans) {

				HdfsDatasetState _u = new HdfsDatasetState();

				JsonObject _bean = (JsonObject) bean;
				
				Long _timeServer = System.currentTimeMillis();
				
				Date _serverTime = new Date(_timeServer);
				
//				Double _operation = 1073741824.0;
				

				_u.setName(_bean.get("name").getAsString());

				_u.setModelerType(_bean.get("modelerType").getAsString());

				_u.setTagContext(_bean.get("tag.Context").getAsString());
				
				_u.setTagStorageInfo(_bean.get("tag.StorageInfo").getAsString());

				_u.setTagHostname(_bean.get("tag.Hostname").getAsString());

				_u.setCapacity((_bean.get("Capacity").getAsDouble()));
				
//				_u.setCapacity(String.format("%.1f GB", (_bean.get("Capacity").getAsDouble())/_capacity));

				_u.setDfsUsed((_bean.get("DfsUsed").getAsDouble()));
				
//				_u.setDfsUsed(String.format("%.1f GB", (_bean.get("DfsUsed").getAsDouble())/_dfsUsed));

				_u.setRemaining((_bean.get("Remaining").getAsDouble()));
				
//				_u.setRemaining(String.format("%.1f GB", (_bean.get("Remaining").getAsDouble())/_remaining));

				_u.setNumFailedVolumes(_bean.get("NumFailedVolumes").getAsInt());

				_u.setLastVolumeFailureDate(_bean.get("LastVolumeFailureDate").getAsInt());
				
				_u.setEstimatedCapacityLostTotal(_bean.get("EstimatedCapacityLostTotal").getAsInt());
				
				_u.setCacheUsed(_bean.get("CacheUsed").getAsInt());
				
				_u.setCacheCapacity(_bean.get("CacheCapacity").getAsInt());
				
				_u.setNumBlocksCached(_bean.get("NumBlocksCached").getAsInt());
				
				_u.setNumBlocksFailedToCache(_bean.get("NumBlocksFailedToCache").getAsInt());
				
				_u.setNumBlocksFailedToUnCache(_bean.get("NumBlocksFailedToUnCache").getAsInt());
				
				_u.setServerTime(_serverTime);

				_beans_.add(_u);
				
//				List<Number> _values = new ArrayList<>();
//				
////				_values.add(_beans_.add(_u.getCapacity()));
//				
//				_values.add(_u.getCapacity());

			}
			
		}

		return _beans_;
	}
	
}