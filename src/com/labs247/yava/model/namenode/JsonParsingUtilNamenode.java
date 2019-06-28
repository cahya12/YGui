package com.labs247.yava.model.namenode;

//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Set;

import com.google.gson.Gson;
//import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.labs247.yava.model.namenode.Namenode;

/*
 * parsing work
 * json to POJO
 * 
 */
public class JsonParsingUtilNamenode {
	
	public static Namenode json2Namenode(String json) {

		JsonParser parser = new JsonParser();
		
		Namenode _namenode =  null;

		JsonElement jsonTree = parser.parse(json);
		

		if (jsonTree.isJsonObject()) {
			
			

			JsonObject jsonObject = jsonTree.getAsJsonObject();

			Gson gson = new Gson();
			
			_namenode = gson.fromJson(jsonObject, Namenode.class);
			
			System.out.println("....................Parsing JSON to POJO....................");
			
		}

		return _namenode ;
	}
}
