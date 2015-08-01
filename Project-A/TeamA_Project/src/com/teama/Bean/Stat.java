package com.teama.Bean;

import java.math.BigInteger;


public class Stat implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8662733136067598410L;
	
	
	private String key;
	
	private long value;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public long getValue() {
		return value;
	}

	public void setValue(long value) {
		this.value = value;
	}
	
	public Stat(){
	}
	
	
	public Stat(String key, BigInteger value){
		this.key= key;
		if(null!= value)
		this.value = value.longValue();
	}
	
	

}
