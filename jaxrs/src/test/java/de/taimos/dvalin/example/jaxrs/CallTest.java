/*
 * Copyright (c) 2017. Taimos GmbH http://www.taimos.de
 */

package de.taimos.dvalin.example.jaxrs;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CallTest extends SpringTest {
	
	@Autowired
	private TestEndpoint ep;
	
	@Test
	public void callHello() throws Exception {
		Assert.assertEquals("Hello, World!", this.ep.sayHello());
	}
	
}
