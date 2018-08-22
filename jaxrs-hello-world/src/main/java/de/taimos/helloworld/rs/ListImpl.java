/*
 * Copyright (c) 2018. Taimos GmbH http://www.taimos.de
 */

package de.taimos.helloworld.rs;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.NotFoundException;

import de.taimos.dvalin.jaxrs.JaxRsComponent;

@JaxRsComponent
public class ListImpl implements IList {

	private final List<String> list = new ArrayList<>();

	public ListImpl() {
		this.list.add("ID1");
		this.list.add("ID2");
		this.list.add("ID3");
		this.list.add("ID4");
	}

	@Override
	public List<String> getList() {
		return this.list;
	}

	@Override
	public String getItem(String id) {
		if (this.list.contains(id)) {
			return id;
		}
		throw new NotFoundException();
	}
}
