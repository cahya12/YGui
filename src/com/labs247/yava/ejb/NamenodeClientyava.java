package com.labs247.yava.ejb;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import com.labs247.yava.model.namenode.JsonParsingUtilNamenode;
import com.labs247.yava.rest.UGMRestClient;
import com.labs247.yava.model.namenode.*;

@Singleton
@Startup
public class NamenodeClientyava {
	public enum States {
		BEFORESTARTED, STARTED, PAUSED, SHUTTINGDOWN
	};

	private States state;

	static String host = "192.168.3.132";
	static String port = "8080";
	static Namenode _namenode = null;
	static long fire_time = System.currentTimeMillis();

	public NamenodeClientyava() {

		System.out.println("HdfsClient init ...");

		System.out.println("DfsClient init ... done");
	}

	public Namenode getNamenode() {
		// System.out.println("getDatanode invoke ...");
		System.out.println("getNamenode invoked ...");

		return _namenode;
	}

	@PostConstruct
	public void initialize() {
		state = States.BEFORESTARTED;
		// Perform intialization
		get_de_data();
		state = States.STARTED;
		System.out.println("Service Started");
	}

	// @Schedule(second = "*/5", minute = "*", hour = "*", persistent = false)
	@Schedule(minute = "*/5", hour = "*", persistent = false)
	public void atSchedule() throws InterruptedException {

		get_de_data();

		System.out.println("DeclarativeScheduler:: In atSchedule() fired get_de_data()");

	}

	public void get_de_data() {
		// TODO Auto-generated method stub
		try {

			// curl -u admin:admin -H "X-Requested-By: ambari" -X GET
			// http://192.168.3.132:8080/api/v1/clusters/C10H16/services/HDFS/components/NAMENODE
			String qry_name = "/api/v1/clusters/C10H16/services/HDFS/components/NAMENODE";

			System.out.println("get_de_data qry " + qry_name);

			

			String _url = "http://" + host + ":" + port + qry_name;

			fire_time = System.currentTimeMillis();
			UGMRestClient _client = new UGMRestClient(host, port);
			String json = _client.basic_auth_client(_url);
			
			System.out.println(json);

			_namenode = JsonParsingUtilNamenode.json2Namenode(json);
//
			System.out.println("=======================================================================");
			System.out.println(_namenode);
			System.out.println("=======================================================================");
//
//			System.out.println(getServiceComponentInfo().getCategory());
//			System.out.println(getServiceComponentInfo().getCapacityRemaining());
////			System.out.println(getMetrics().getBoottime());
//			System.out.println(getMetrics().getDfs().getFSNamesystem().getCapacityTotal());
			System.out.println(getMetrics().getDfs().getFSNamesystem().getCapacityTotalGB());
			System.out.println(getMetrics().getDfs().getFSNamesystem().getCapacityRemainingGB());
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	@PreDestroy
	public void terminate() {
		state = States.SHUTTINGDOWN;
		// Perform termination
		System.out.println("DatanodeClient shutdown in progress");
	}

	

	public States getState() {
		return state;
	}

	public void setState(States state) {
		this.state = state;
	}

	public long getFiretime() {
		return fire_time;
	}

	public String getHref() {

		return _namenode.getHref();

	}

	public ServiceComponentInfo getServiceComponentInfo() {

		return _namenode.getServiceComponentInfo();

	}

	public Metrics getMetrics() {

		return _namenode.getMetrics();

	}
	

    public Disk getDisk() {
    	return _namenode.getMetrics().getDisk();
    }
//    
//    public Dfs getDfs() {
//    	return _namenode.getMetrics().getDfs();
//    }
}
