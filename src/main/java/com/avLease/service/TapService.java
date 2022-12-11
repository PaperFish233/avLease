package com.avLease.service;

import java.util.List;

import com.avLease.pojo.Tap;

public interface TapService {
	
	public List<Tap> findAllTaps();
	
	public List<Tap> findTapById(String name);

	public Tap addTap(String name, String tno);
	
	public Tap delTapById(int no);
	
	public Tap upTapById(int no, String name, String tno, String state);
	
	public Tap stateLease(String name);
	
	public Tap leaseState(String name);
	
	
	
	
	public List<Tap> findAllTapsUser();
	
	public List<Tap> findTapByIdUser(String name);
}
