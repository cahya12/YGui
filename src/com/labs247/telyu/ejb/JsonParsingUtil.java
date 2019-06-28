package com.labs247.telyu.ejb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.labs247.telyu.model.Zookeeper;
//import com.verzinen.ugm.model.datanode.Datanode;
//import com.verzinen.ugm.model.jmx.Jmx;

/*
 * parsing work
 * json to POJO
 * 
 */
public class JsonParsingUtil {
	
	
//	public static Jmx json2JMX(String json) {
//
//		JsonParser parser = new JsonParser();
//		
//	//	Bean _bean =  null;
//		Jmx _jmx = null;
//		
//		JsonElement jsonTree = parser.parse(json);
//		
//
//		if (jsonTree.isJsonObject()) {
//
//			JsonObject jsonObject = jsonTree.getAsJsonObject();
//
//			Gson gson = new Gson();
//			
//			_jmx  = gson.fromJson(jsonObject, Jmx.class);
//			
//		}
//
//		return _jmx ;
//	}
	
	
	public static Zookeeper json2DataNode(String json) {

		JsonParser parser = new JsonParser();
		
		Zookeeper _datanode =  null;

		JsonElement jsonTree = parser.parse(json);
		

		if (jsonTree.isJsonObject()) {

			JsonObject jsonObject = jsonTree.getAsJsonObject();

			Gson gson = new Gson();
			
			_datanode = gson.fromJson(jsonObject, Zookeeper.class);
			
		}

		return _datanode ;
	}
	
	public static String json2DataNodeInfo(String json) {

		JsonParser parser = new JsonParser();

		JsonElement jsonTree = parser.parse(json);

		if (jsonTree.isJsonObject()) {

			JsonObject jsonObject = jsonTree.getAsJsonObject();

			// TimelineMetricStoreWatcher
			// System.out.println("timeline_metric_store_watcher:
			// "+jsonObject.get("timeline_metric_store_watcher"));

			// Datanode
			// System.out.println("datanode: "+jsonObject.get("datanode"));

			// Hbase
			// System.out.println("hbase: "+jsonObject.get("hbase"));

			// Host
			// System.out.println("host: "+ jsonObject.get("host"));

			// KafkaBroker.java
			// System.out.println("kafka_broker: "+ jsonObject.get("kafka_broker"));

			JsonArray ja = (JsonArray) parser.parse(jsonObject.get("datanode").toString());

			System.out.println("kafka_broker size = " + ja.size());

			for (JsonElement jo : ja) {
				JsonObject j = (JsonObject) jo;

				// System.out.println(j);

				String _metric_name = j.get("metricname").getAsString();
				String _uuid = j.get("uuid").getAsString();

				if (_metric_name.startsWith("dfs.datanode.")) {
					System.out.println(_metric_name);
					System.out.println(_uuid);
				}

			}

			// Hiveserver2.java
			// System.out.println("hiveserver2: "+ jsonObject.get("hiveserver2"));

			// Namenode.java
			// System.out.println("namenode: "+ jsonObject.get("namenode"));

			// Nodemanager.java
			// System.out.println("nodemanager: "+ jsonObject.get("nodemanager"));

			// Resourcemanager.java
			// System.out.println("resourcemanager: "+ jsonObject.get("resourcemanager"));

			// JsonArray beans = (JsonArray)
			// parser.parse(jsonObject.get("beans").toString());

			// System.out.println(beans);

		}

		return "";
	}


	public static Map<String, Object> toMap(JsonObject object) throws Exception {

		Map<String, Object> map = new HashMap<String, Object>();

		Set<String> keysItr = object.keySet();

		//   while(keysItr.) {

		for (String key : keysItr) {
			//String key = keysItr.next();

			Object value = object.get(key);

			if(value instanceof JsonArray) {
				value = toList((JsonArray) value);
			}

			else if(value instanceof JsonObject) {
				value = toMap((JsonObject) value);
			}
			map.put(key, value);
		}
		return map;
	}


	public static List<Object> toList(JsonArray array) throws Exception {
		List<Object> list = new ArrayList<Object>();
		for(int i = 0; i < array.size(); i++) {
			Object value = array.get(i);
			if(value instanceof JsonArray) {
				value = toList((JsonArray) value);
			}

			else if(value instanceof JsonObject) {
				value = toMap((JsonObject) value);
			}
			list.add(value);
		}
		return list;
	}
}
