package com.avLease.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.avLease.pojo.Type;


public interface TypeMapper {
	
	public List<Type> findAllTypes();
	
	public List<Type> findTypeById(@Param("ttname") String ttname);
	
	public Type addType(@Param("ttname") String ttname);

	public Type delTypeById(@Param("ttno") int ttno);
	
	public Type upTypeById(@Param("ttno") int ttno,@Param("ttname") String ttname);
}
