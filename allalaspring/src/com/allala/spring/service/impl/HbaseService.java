package com.allala.spring.service.impl;

import com.allala.spring.service.DemoService;

public class HbaseService implements DemoService {

	@Override
	public long getCount() {
		// TODO Auto-generated method stub
		System.out.println("In HBASE get the nosql java obj count");
		return 100L;
	}

	@Override
	public String getDataObject() {
		// TODO Auto-generated method stub
		System.out.println("In Hbase get the Data Obj");
		return "Java Obj by Hbase Api's";
	}

}
