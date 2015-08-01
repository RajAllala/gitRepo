package com.allala.simpleSoap.ws.cache;

import java.util.ArrayList;
import java.util.List;

import com.allala.simpleSoap.ws.beans.Person;

public class DataCache {
	
	private static DataCache INSTANCE = new DataCache();
	private List<Person> PersonCache =  new ArrayList<>();
	
	protected DataCache(){
	}	
	public void addPerson(Person person){
		getPersonCache().add(person);		
	}
	public List<Person> getAllperons(){
		return getPersonCache();
	}
	public static DataCache getINSTANCE() {
		return INSTANCE;
	}
	public List<Person> getPersonCache() {
		return PersonCache;
	}
	public void setPersonCache(List<Person> personCache) {
		PersonCache = personCache;
	}
}
