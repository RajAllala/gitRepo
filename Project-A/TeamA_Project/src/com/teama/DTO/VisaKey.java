package com.teama.DTO;

import java.util.List;

import com.teama.Bean.Stat;

public class VisaKey {
	
	 private String key="Cumulative Return";
	private List<Stat> values;
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public List<Stat> getValues() {
		return values;
	}
	public void setValues(List<Stat> values) {
		this.values = values;
	}
	
	

}
