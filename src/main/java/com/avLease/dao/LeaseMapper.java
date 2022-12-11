package com.avLease.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.avLease.pojo.Lease;


public interface LeaseMapper {
	
	public List<Lease> findAllLeases();
	
	public List<Lease> findLeaseById(@Param("name") String name);
	
	public Lease addLease(@Param("name") String name,@Param("tap") String tap,@Param("time") String time);

	public Lease delLeaseById(@Param("no") int no,@Param("tap") String tap);
	
	public Lease upLeaseById(@Param("no") int no,@Param("name") String name,@Param("tap") String tap,@Param("time") String time);

	
	
	
	
	public List<Lease> findLeaseByIdUser(@Param("name") String name);
	
	public List<Lease> findLeaseByIdUser2(@Param("tap") String tap,@Param("name") String name);
	
	public Lease delLeaseByIdUser(@Param("no") int no,@Param("tap") String tap);
}
