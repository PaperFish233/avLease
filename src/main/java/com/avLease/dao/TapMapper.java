package com.avLease.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.avLease.pojo.Tap;


public interface TapMapper {
	
	public List<Tap> findAllTaps();
	
	public List<Tap> findTapById(@Param("name") String name);
	
	public Tap addTap(@Param("name") String name,@Param("tno") String tno);

	public Tap delTapById(@Param("no") int no);
	
	public Tap upTapById(@Param("no") int no,@Param("name") String name,@Param("tno") String tno,@Param("state") String state);

	public Tap stateLease(@Param("name") String name);
	
	public Tap leaseState(@Param("name") String name);
	
	
	
	
	
	public List<Tap> findAllTapsUser();
	
	public List<Tap> findTapByIdUser(@Param("name") String name);
}
