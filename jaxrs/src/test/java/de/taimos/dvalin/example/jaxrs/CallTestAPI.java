/*
 * Copyright (c) 2017. Taimos GmbH http://www.taimos.de
 */

package de.taimos.dvalin.example.jaxrs;

import org.apache.http.HttpResponse;
import org.junit.Assert;
import org.junit.Test;

import de.taimos.daemon.log4j.Log4jLoggingConfigurer;
import de.taimos.daemon.spring.SpringDaemonTestRunner;
import de.taimos.dvalin.test.jaxrs.APITest;
import de.taimos.httputils.WS;

@SpringDaemonTestRunner.RunnerConfiguration(svc = "dvalin-example-jaxrs", config = TestConfig.class, loggingConfigurer = Log4jLoggingConfigurer.class)
public class CallTestAPI extends APITest {
	
	@Test
	public void callHelloAPI() throws Exception {
		HttpResponse response = this.request("/hello").accept("text/plain").get();
		this.assertOK(response);
		Assert.assertEquals("Hello, World!", WS.getResponseAsString(response));
	}
}
