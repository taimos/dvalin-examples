/*
 * Copyright (c) 2017. Taimos GmbH http://www.taimos.de
 */

package de.taimos.dvalin.example.jaxrs;

import de.taimos.daemon.spring.SpringDaemonTestRunner.RunnerConfig;
import de.taimos.dvalin.daemon.DvalinTestRunnerConfig;

public class TestConfig extends DvalinTestRunnerConfig {
	
	public TestConfig() {
		Integer port = RunnerConfig.randomPort();
		this.addProperty("svc.port", Integer.toString(port));
		this.addProperty("server.url", "http://127.0.0.1:" + port);
	}
	
	@Override
	public String getServicePackage() {
		return "de.taimos.dvalin.example.jaxrs";
	}
	
}
