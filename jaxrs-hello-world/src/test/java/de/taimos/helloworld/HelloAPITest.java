package de.taimos.helloworld;

import org.apache.http.HttpResponse;
import org.junit.Assert;
import org.junit.Test;

import de.taimos.daemon.log4j.Log4jLoggingConfigurer;
import de.taimos.daemon.spring.SpringDaemonTestRunner;
import de.taimos.dvalin.test.jaxrs.APITest;
import de.taimos.httputils.WS;

@SpringDaemonTestRunner.RunnerConfiguration(svc = "helloworld", config = TestConfig.class, loggingConfigurer = Log4jLoggingConfigurer.class)
public class HelloAPITest extends APITest {
    
    @Test
    public void shouldSayHello() {
        HttpResponse httpResponse = this.request("/hello").accept("text/plain").get();
        this.assertOK(httpResponse);
        Assert.assertEquals("Hello, world!", WS.getResponseAsString(httpResponse));
    }
    
}
