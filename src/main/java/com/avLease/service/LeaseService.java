package com.avLease.service;

import java.util.List;

import com.avLease.pojo.Lease;

public interface LeaseService {
	
	public List<Lease> findAllLeases();
	
	public List<Lease> findLeaseById(String name);

	public Lease addLease(String name, String tap, String time);
	
	public Lease delLeaseById(int no,String tap);
	
	public Lease upLeaseById(int no, String name, String tap, String time);
	
	
	
	
	
	public List<Lease> findLeaseByIdUser(String name);
	
	public List<Lease> findLeaseByIdUser2(String tap,String name);
	
	public Lease delLeaseByIdUser(int no,String tap);
}
