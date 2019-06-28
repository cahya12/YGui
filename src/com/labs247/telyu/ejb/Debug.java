package com.labs247.telyu.ejb;

import com.labs247.telyu.ejb.ZookeeperClient;

public class Debug {

	public static void main(String[] args) {
		ZookeeperClient x = new ZookeeperClient();
		x.get_de_data();
//		System.out.println(x.getConfigurationKafkaBroker());
		System.out.println(x.getPropertiesZooKeeperCfg().getTickTime());
	}

}
