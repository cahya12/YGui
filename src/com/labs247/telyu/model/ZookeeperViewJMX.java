package com.labs247.telyu.model;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
//import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
//import javax.inject.Named;
import javax.inject.Named;

//import org.jboss.logging.Logger;

import com.labs247.telyu.ejb.ZookeeperClient;

@Named
@ViewScoped
public class ZookeeperViewJMX implements Serializable{
	static final long serialVersionUID = 1237l;
	private String autoCreateTopicsEnable="alif",autoLeaderRebalanceEnable="nugroho";
	private String Href, ClusterName, StackID, zk_log_dir, zk_pid_dir, zk_server_heapsize, env_template;
	private String maxBackupSize, numberBackupSize, logTemplate;
	private String purgeInterval, snapRetainCount, clientPort, dataDir, initLimit, syncLimit, tickTime;
	ZookeeperClient data;
	
//	static Logger logger = Logger.getLogger(KafkaView.class);
	
	@PostConstruct
	public void init() {
//		logger.info(".......................Kafka Dimulai..................................");
		System.out.println(".......................Kafka Dimulai..................................");
//		data = new KafkaClient();
		data = new ZookeeperClient();
		data.get_de_data();
		isiData();
	}
	public void isiData() {
//		data = new ZookeeperClient();
//		autoCreateTopicsEnable =  data.getPropertiesData().getAutoCreateTopicsEnable();
//		autoLeaderRebalanceEnable = data.getPropertiesData().getAutoLeaderRebalanceEnable();
		autoLeaderRebalanceEnable = "NUG";
		autoCreateTopicsEnable = data.getHref();
		Href = data.getHref();
		ClusterName = data.getConfig().getClusterName();
		StackID = data.getConfig().getStackId();
		zk_log_dir = data.getPropertiesZooKeeperEnv().getZkLogDir();
		zk_pid_dir = data.getPropertiesZooKeeperEnv().getZkPidDir();
		zk_server_heapsize = data.getPropertiesZooKeeperEnv().getZkServerHeapsize();
		env_template = data.getPropertiesZooKeeperEnv().getContent();
		maxBackupSize = data.getPropertiesZooKeeperLog4j().getZookeeperLogMaxBackupSize();
		numberBackupSize = data.getPropertiesZooKeeperLog4j().getZookeeperLogNumberOfBackupFiles();
		logTemplate = data.getPropertiesZooKeeperLog4j().getContent();
		purgeInterval = data.getPropertiesZooKeeperCfg().getAutopurgePurgeInterval();
		snapRetainCount = data.getPropertiesZooKeeperCfg().getAutopurgeSnapRetainCount();
		clientPort = data.getPropertiesZooKeeperCfg().getClientPort();
		dataDir = data.getPropertiesZooKeeperCfg().getDataDir();
		initLimit = data.getPropertiesZooKeeperCfg().getInitLimit();
		syncLimit = data.getPropertiesZooKeeperCfg().getSyncLimit();
		tickTime = data.getPropertiesZooKeeperCfg().getTickTime();
	 
	}
	
	public String getpurgeInterval() {
		return purgeInterval;
	}
	
	public String getsnapRetainCount() {
		return snapRetainCount;
	}
	
	public String getclientPort() {
		return clientPort;
	}
	
	public String getdataDir() {
		return dataDir;
	}
	
	public String getinitLimit() {
		return initLimit;
	}
	
	public String getsyncLimit() {
		return syncLimit;
	}
	
	public String gettickTime() {
		return tickTime;
	}
	
	public String getmaxBackupSize() {
		return maxBackupSize;
	}
	
	public String getnumberBackupSize() {
		return numberBackupSize;
	}
	
	public String getlogTemplate() {
		return logTemplate;
	}
	
	public String getHref() {
		return Href;
	}
	
	public String getClusterName() {
		return ClusterName;
	}
	
	public String getStackID() {
		return StackID;
	}
	
	public String getzk_log_dir() {
		return zk_log_dir;
	}
	
	public String getzk_pid_dir() {
		return zk_pid_dir;
	}
	
	public String getzk_server_heapsize() {
		return zk_server_heapsize;
	}
	
	public String getenv_template() {
		return env_template;
	}
	

	public String getAutoCreateTopicsEnable() {
		return autoCreateTopicsEnable;
	}

	public String getAutoLeaderRebalanceEnable() {
		return autoLeaderRebalanceEnable;
	}
	
	
}