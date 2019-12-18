/**
 * 
 */
package com.vd.springbootrabbitmq.configurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Vivek Deshmukh
 *
 */
@Configuration
@PropertySource("classpath:application.properties")
public class ApplicationConfigReader {

	@Value("${app1.exchange.name}")
	private String app1Exchange;

	@Value("${app1.queue.name}")
	private String app1Queue;

	@Value("${app1.routing.key}")
	private String app1RoutingKey;

	@Value("${app2.exchange.name}")
	private String app2Exchange;

	@Value("${app2.queue.name}")
	private String app2Queue;

	@Value("${app2.routing.key}")
	private String app2RoutingKey;

	/**
	 * @return the app1Exchange
	 */
	public String getApp1Exchange() {
		return app1Exchange;
	}

	/**
	 * @param app1Exchange the app1Exchange to set
	 */
	public void setApp1Exchange(String app1Exchange) {
		this.app1Exchange = app1Exchange;
	}

	/**
	 * @return the app1Queue
	 */
	public String getApp1Queue() {
		return app1Queue;
	}

	/**
	 * @param app1Queue the app1Queue to set
	 */
	public void setApp1Queue(String app1Queue) {
		this.app1Queue = app1Queue;
	}

	/**
	 * @return the app1RoutingKey
	 */
	public String getApp1RoutingKey() {
		return app1RoutingKey;
	}

	/**
	 * @param app1RoutingKey the app1RoutingKey to set
	 */
	public void setApp1RoutingKey(String app1RoutingKey) {
		this.app1RoutingKey = app1RoutingKey;
	}

	/**
	 * @return the app2Exchange
	 */
	public String getApp2Exchange() {
		return app2Exchange;
	}

	/**
	 * @param app2Exchange the app2Exchange to set
	 */
	public void setApp2Exchange(String app2Exchange) {
		this.app2Exchange = app2Exchange;
	}

	/**
	 * @return the app2Queue
	 */
	public String getApp2Queue() {
		return app2Queue;
	}

	/**
	 * @param app2Queue the app2Queue to set
	 */
	public void setApp2Queue(String app2Queue) {
		this.app2Queue = app2Queue;
	}

	/**
	 * @return the app2RoutingKey
	 */
	public String getApp2RoutingKey() {
		return app2RoutingKey;
	}

	/**
	 * @param app2RoutingKey the app2RoutingKey to set
	 */
	public void setApp2RoutingKey(String app2RoutingKey) {
		this.app2RoutingKey = app2RoutingKey;
	}


}
