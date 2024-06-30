package com.kurtulussahin.java.ibtechproject.task1.bag;

import java.util.HashMap;
import java.util.Map;

public class Bag {

	private Map<BagKey, Object> map = new HashMap<BagKey, Object>();

	public Map<BagKey, Object> getMap() {
		return map;
	}

	public void setMap(Map<BagKey, Object> map) {
		this.map = map;
	}

	public Object getValue(BagKey key) {
		return map.get(key);
	}

	public void put(BagKey key, Object value) {
		map.put(key, value);
	}

}
