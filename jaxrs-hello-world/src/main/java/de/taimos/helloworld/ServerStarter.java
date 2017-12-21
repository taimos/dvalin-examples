package de.taimos.helloworld;

import de.taimos.dvalin.daemon.DvalinLifecycleAdapter;

public class ServerStarter extends DvalinLifecycleAdapter {
    
    public static void main(String[] args) {
        DvalinLifecycleAdapter.start("helloworld", new ServerStarter());
    }
    
}
