package de.taimos.helloworld;

import org.junit.Assert;
import org.junit.Test;

import de.taimos.daemon.log4j.Log4jLoggingConfigurer;
import de.taimos.daemon.spring.SpringDaemonTestRunner;
import de.taimos.dvalin.test.jaxrs.APITest;
import de.taimos.httputils.HTTPResponse;

@SpringDaemonTestRunner.RunnerConfiguration(svc = "helloworld", config = TestConfig.class, loggingConfigurer = Log4jLoggingConfigurer.class)
public class HelloAPITest extends APITest {
    
    @Test
    public void shouldSayHello() {
        HTTPResponse httpResponse = this.request("/hello").accept("text/plain").get();
        this.assertOK(httpResponse);
        Assert.assertEquals("Hello, you!", httpResponse.getResponseAsString());
    }
    
    @Test
    public void shouldSayHelloWorld() {
        HTTPResponse httpResponse = this.request("/hello/world").accept("text/plain").get();
        this.assertOK(httpResponse);
        Assert.assertEquals("Hello, world!", httpResponse.getResponseAsString());
    }

}
