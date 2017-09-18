/*
 * Copyright (c) 2017. Taimos GmbH http://www.taimos.de
 */

package de.taimos.dvalin.example.jaxrs;

import de.taimos.dvalin.daemon.DvalinLifecycleAdapter;

public class ServerStarter extends DvalinLifecycleAdapter {
	
	public static void main(String[] args) {
		DvalinLifecycleAdapter.start("dvalin-example-jaxrs", new ServerStarter());
	}
	
}
