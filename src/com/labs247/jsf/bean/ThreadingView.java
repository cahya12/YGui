package com.labs247.jsf.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.jboss.logging.Logger;
import com.labs247.jsf.ejb.ThreadingAmbariJMXUtil;
import com.labs247.jsf.rest.ThreadingRestClient;
import com.labs247.jsf.model.ThreadingDataState;

@ManagedBean
@RequestScoped
public class ThreadingView implements Serializable {

	static final long serialVersionUID = 1237l;
	
	String _percentage;

	static Logger logger = Logger.getLogger(ThreadingView.class);

	static String host = "192.168.3.132";
	static String port = "50075";
	static String qry_name = "java.lang:type=Threading";

	private List<ThreadingDataState> _bbs_;

	ThreadingRestClient _client = new ThreadingRestClient(host, port);

	ThreadingDataState _fs = new ThreadingDataState();

	@PostConstruct
	public void init() {
		getJSON();
	}

	public void getJSON() {

		try {

			String qry_name = "java.lang:type=Threading";

//			  UGMRestClient _client  =  new UGMRestClient(host,port);

			String _url = "http://" + host + ":" + port + "/jmx?qry=" + qry_name;

			String json = _client.ambari_plain_client(_url);

			_bbs_ = ThreadingAmbariJMXUtil.json2Threading(json);

			_bbs_.size();

			for (ThreadingDataState i : _bbs_) {
//				i.getCapacity();
//				i.getDfsUsed();
//				i.getRemaining();

				_fs = i;

			}

//			while (json.length() != 0) {
//				_bbs_.add(_fs);
//			}

//			_bbs_.add(_fs);

		} catch (Exception e) {
			logger.error(e);
		}

	}

	

	public List<ThreadingDataState> get_bbs_() {
		return _bbs_;
	}

	public void set_bbs_(List<ThreadingDataState> _bbs_) {
		this._bbs_ = _bbs_;
	}

}
