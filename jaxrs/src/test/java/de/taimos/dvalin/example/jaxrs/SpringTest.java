/*
 * Copyright (c) 2017. Taimos GmbH http://www.taimos.de
 */

package de.taimos.dvalin.example.jaxrs;

import org.junit.runner.RunWith;

import de.taimos.daemon.log4j.Log4jLoggingConfigurer;
import de.taimos.daemon.spring.SpringDaemonTestRunner;

@RunWith(SpringDaemonTestRunner.class)
@SpringDaemonTestRunner.RunnerConfiguration(svc = "dvalin-example-jaxrs", config = TestConfig.class, loggingConfigurer = Log4jLoggingConfigurer.class)
public abstract class SpringTest {
	//
}
