package com.labs247.jsf.rest;

import org.apache.http.Header;
import org.apache.http.HttpEntity;

import org.apache.http.HttpResponse;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;

import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

//import org.jboss.logging.Logger;

public class NamenodeWioRestClient {

//	static Logger logger = Logger.getLogger(UGMRestClient.class);

//	String DEFAULT_USER = "admin";
//	String DEFAULT_PASS = "admin";
//	String DEFAUT_SERVICE =  "MAPREDUCE2";
	String CLUSTER = "YAVA30";// "H2SO4";
	String HOSTNAME = "192.168.3.132";// 192.168.3.132 192.168.3.221 192.168.3.164

	public NamenodeWioRestClient(String hostname, String cluster) {
		this.HOSTNAME = hostname;
		this.CLUSTER = cluster;
	}

	// curl http://192.168.3.132:50075/jmx

	public String ambari_jmx_client(String host, String port) throws Exception {
		host = "192.168.3.132";
		port = "50075";

		String json = null;
		String URL_JMX_BASIC = "http://" + host + ":" + port
				+ "/jmx?qry=Hadoop:service=DataNode,name=DataNodeVolume-/hadoop/hdfs/data";

		// final HttpClientContext context = HttpClientContext.create();
		HttpClient client = HttpClientBuilder.create().build();

		HttpResponse response = client.execute(new HttpGet(URL_JMX_BASIC));

		HttpEntity entity = response.getEntity();

		System.out.println(response.getStatusLine());

		Header[] headers = response.getAllHeaders();

		for (int i = 0; i < headers.length; i++) {
			System.out.println(headers[i]);
		}

		if (entity != null) {

			json = EntityUtils.toString(entity);

		}

		System.out.println("----------------------------------------");

		return json;
	}

	public String ambari_plain_client(String url) throws Exception {

		String json = null;
		String URL_JMX_BASIC = url;

		// final HttpClientContext context = HttpClientContext.create();
		HttpClient client = HttpClientBuilder.create().build();

		HttpResponse response = client.execute(new HttpGet(URL_JMX_BASIC));

		HttpEntity entity = response.getEntity();

		System.out.println(response.getStatusLine());

		Header[] headers = response.getAllHeaders();

		for (int i = 0; i < headers.length; i++) {
			System.out.println(headers[i]);
		}

		if (entity != null) {

			json = EntityUtils.toString(entity);

		}

		System.out.println("----------------------------------------");

		return json;
	}

}
