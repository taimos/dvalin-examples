package de.taimos.helloworld;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import de.taimos.daemon.log4j.Log4jLoggingConfigurer;
import de.taimos.daemon.spring.SpringDaemonTestRunner;
import de.taimos.helloworld.rs.IHello;

@RunWith(SpringDaemonTestRunner.class)
@SpringDaemonTestRunner.RunnerConfiguration(svc = "helloworld", config = TestConfig.class, loggingConfigurer = Log4jLoggingConfigurer.class)
public class HelloTest {
    
    @Autowired
    private IHello hello;
    
    @Test
    public void shouldSayHello() {
        Assert.assertEquals("Hello, world!", this.hello.sayHello());
    }
    
}
