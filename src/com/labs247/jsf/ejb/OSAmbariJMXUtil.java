package com.labs247.jsf.ejb;

import java.io.Serializable;
import java.util.ArrayList;

import java.util.List;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.labs247.jsf.model.OSDatasetState;


@ManagedBean
@RequestScoped
public class OSAmbariJMXUtil implements Serializable{

	private static final long serialVersionUID = 1L;
	
	OSDatasetState _fs = new OSDatasetState();

	public static List<OSDatasetState> json2OperatingSystem(String json) throws Exception {

		List<OSDatasetState> _beans_ = new ArrayList<OSDatasetState>();
		
		JsonParser parser = new JsonParser();

		JsonElement jsonTree = parser.parse(json);

		if (jsonTree.isJsonObject()) {
			/*
			 * { "beans" : [ { "name" : "java.lang:type=OperatingSystem", "modelerType" :
			 * "sun.management.OperatingSystemImpl", "OpenFileDescriptorCount" : 483,
			 * "MaxFileDescriptorCount" : 128000, "CommittedVirtualMemorySize" : 3017277440,
			 * "TotalSwapSpaceSize" : 5368705024, "FreeSwapSpaceSize" : 4620333056,
			 * "ProcessCpuTime" : 234230000000, "FreePhysicalMemorySize" : 125702144,
			 * "TotalPhysicalMemorySize" : 3975688192, "SystemCpuLoad" :
			 * 0.28306844398872083, "ProcessCpuLoad" : 0.01800820302486542,
			 * "AvailableProcessors" : 1, "Arch" : "amd64", "Version" :
			 * "3.10.0-327.el7.x86_64", "SystemLoadAverage" : 3.7, "Name" : "Linux",
			 * "ObjectName" : "java.lang:type=OperatingSystem" } ] }
			 */

			JsonObject jsonObject = jsonTree.getAsJsonObject();

			JsonArray beans = (JsonArray) parser.parse(jsonObject.get("beans").toString());

			for (JsonElement bean : beans) {

				OSDatasetState _u = new OSDatasetState();

				JsonObject _bean = (JsonObject) bean;
				

				_u.setName(_bean.get("name").getAsString());

				_u.setModelerType(_bean.get("modelerType").getAsString());

				_u.setOpenFileDescriptorCount(_bean.get("OpenFileDescriptorCount").getAsInt());
				
				_u.setMaxFileDescriptorCount(_bean.get("MaxFileDescriptorCount").getAsInt());

				_u.setCommittedVirtualMemorySize(_bean.get("CommittedVirtualMemorySize").getAsDouble());

				_u.setTotalSwapSpaceSize(_bean.get("TotalSwapSpaceSize").getAsDouble());

				_u.setFreeSwapSpaceSize(_bean.get("FreeSwapSpaceSize").getAsDouble());

				_u.setProcessCpuTime(_bean.get("ProcessCpuTime").getAsDouble());

				_u.setFreePhysicalMemorySize(_bean.get("FreePhysicalMemorySize").getAsDouble());

				_u.setTotalPhysicalMemorySize(_bean.get("TotalPhysicalMemorySize").getAsDouble());
				
				_u.setSystemCpuLoad(_bean.get("SystemCpuLoad").getAsDouble());
				
				_u.setProcessCpuLoad(_bean.get("ProcessCpuLoad").getAsDouble());
				
				_u.setAvailableProcessors(_bean.get("AvailableProcessors").getAsInt());
				
				_u.setArch(_bean.get("Arch").getAsString());
				
				_u.setVersion(_bean.get("Version").getAsString());
				
				_u.setSystemLoadAverage(_bean.get("SystemLoadAverage").getAsDouble());
				
				_u.setOsName(_bean.get("Name").getAsString());
				
				_u.setObjectName(_bean.get("ObjectName").getAsString());

				_beans_.add(_u);

			}
			
		}

		return _beans_;
	}
	
}