package com.labs247.telyu.ejb;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Schedule;


import javax.ejb.Singleton;
import javax.ejb.Startup;

import org.jboss.logging.Logger;

import com.labs247.telyu.model.Config;
import com.labs247.telyu.model.Configuration;
import com.labs247.telyu.model.Item;
import com.labs247.telyu.model.Zookeeper;
import com.labs247.telyu.rest.RestClient;
import com.labs247.telyu.model.Properties;
import com.labs247.telyu.ejb.ZookeeperClient;

@Singleton
@Startup
public class ZookeeperClient {

	public enum States {
		BEFORESTARTED, STARTED, PAUSED, SHUTTINGDOWN
	};

	private States state;
	private Configuration configuration;

	static String host = "192.168.3.132";
	static String port = "8080";
	static Zookeeper zookeeper = null;
	static long fire_time = System.currentTimeMillis();
	static Logger logger = Logger.getLogger(ZookeeperClient.class);

	public ZookeeperClient() {

	}

	@PostConstruct
	public void initialize() {
		logger.info(".......................Rest Dimulai ..................................");
		System.out.println(".......................Rest Dimulai ..................................");
		state = States.BEFORESTARTED;
		// Perform intialization
		get_de_data();
		state = States.STARTED;
	}

	// fire every 5 minut

	// @Schedule(second = "*/5", minute = "*", hour = "*", persistent = false)
	@Schedule(minute = "*/5", hour = "*", persistent = false)
	public void atSchedule() throws InterruptedException {

		get_de_data();

		System.out.println("DeclarativeScheduler:: In atSchedule() fired get_jmxdata()");

	}

	public void get_de_data() {

		try {
			System.out.println(".......................Rest Dimulai ..................................");
			RestClient _client = new RestClient(host, port);
			String URL = "http://192.168.3.132:8080/api/v1/clusters/C10H16/configurations/service_config_versions/?service_name=ZOOKEEPER";

			fire_time = System.currentTimeMillis();
			String json = _client.basic_auth_client(URL);

			zookeeper = JsonParsingUtil.json2DataNode(json);
			
			System.out.println("..........................Kafka Data : ...................");
//			System.out.println(kafka);
//			System.out.println(getPropertiesData().getAutoCreateTopicsEnable());
//			System.out.println(getConfigurationKafkaBroker().getTag());
//			System.out.println(getPropertiesData());
			System.out.println(getHref());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@PreDestroy
	public void terminate() {
		state = States.SHUTTINGDOWN;
		// Perform termination
		System.out.println("JMXRestClient shutdown in progress");
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
		return zookeeper.getHref();
	}

	public Item getItemData() {

		// i.e java.lang:type=OperatingSystem

		Item _de_bean = zookeeper.getItems().stream().filter(item -> "C10H16".equals(item.getClusterName())).findAny()
				.orElse(null);
		return _de_bean;
	}

	public Configuration getConfigurationZooKeeper() {

		// i.e java.lang:type=OperatingSystem

		Item _de_bean = zookeeper.getItems().stream().filter(item -> "C10H16".equals(item.getClusterName())).findAny()
				.orElse(null);

		configuration = _de_bean.getConfigurations().stream()
				.filter(configurationku -> "zoo.cfg".equals(configurationku.getType())).findAny().orElse(null);
		return configuration;
	}
	
	public Config getConfig() {
		Item _de_bean = zookeeper.getItems().stream().filter(item -> "C10H16".equals(item.getClusterName())).findAny()
				.orElse(null);

		configuration = _de_bean.getConfigurations().stream()
				.filter(configurationku -> "zoo.cfg".equals(configurationku.getType())).findAny().orElse(null);
		
		return configuration.getConfig();
	}

	public Properties getPropertiesZooKeeperCfg() {
		Item _de_bean = zookeeper.getItems().stream().filter(item -> "C10H16".equals(item.getClusterName())).findAny()
				.orElse(null);

		configuration = _de_bean.getConfigurations().stream()
				.filter(configurationku -> "zoo.cfg".equals(configurationku.getType())).findAny().orElse(null);
		
		return configuration.getProperties();
	}
	
	public Properties getPropertiesZooKeeperEnv() {
		Item _de_bean = zookeeper.getItems().stream().filter(item -> "C10H16".equals(item.getClusterName())).findAny()
				.orElse(null);

		configuration = _de_bean.getConfigurations().stream()
				.filter(configurationku -> "zookeeper-env".equals(configurationku.getType())).findAny().orElse(null);
		
		return configuration.getProperties();
	}
	
	public Properties getPropertiesZooKeeperLog4j() {
		Item _de_bean = zookeeper.getItems().stream().filter(item -> "C10H16".equals(item.getClusterName())).findAny()
				.orElse(null);

		configuration = _de_bean.getConfigurations().stream()
				.filter(configurationku -> "zookeeper-log4j".equals(configurationku.getType())).findAny().orElse(null);
		
		return configuration.getProperties();
	}

}
