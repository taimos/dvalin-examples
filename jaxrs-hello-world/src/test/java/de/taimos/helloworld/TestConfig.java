package de.taimos.helloworld;

import de.taimos.daemon.spring.SpringDaemonTestRunner.RunnerConfig;
import de.taimos.dvalin.daemon.DvalinTestRunnerConfig;

public class TestConfig extends DvalinTestRunnerConfig {
    
    public TestConfig() {
        Integer port = RunnerConfig.randomPort();
        
        // JAX-RS Config
        this.addProperty("svc.port", Integer.toString(port));
        this.addProperty("server.url", "http://127.0.0.1:" + port);
    }
    
    @Override
    public String getServicePackage() {
        return "de.taimos.helloworld";
    }
    
}
