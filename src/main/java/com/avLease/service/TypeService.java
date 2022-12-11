package com.avLease.service;

import java.util.List;

import com.avLease.pojo.Type;

public interface TypeService {
	
	public List<Type> findAllTypes();
	
	public List<Type> findTypeById(String ttname);

	public Type addType(String ttname);
	
	public Type delTypeById(int ttno);
	
	public Type upTypeById(int ttno, String ttname);
}
