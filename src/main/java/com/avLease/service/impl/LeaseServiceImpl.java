package com.avLease.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avLease.dao.LeaseMapper;
import com.avLease.pojo.Lease;
import com.avLease.service.LeaseService;

@Service
public class LeaseServiceImpl implements LeaseService {
	
	@Autowired
	private LeaseMapper leaseDao;

	@Override
	public List<Lease> findAllLeases() {
		// TODO Auto-generated method stub
		return leaseDao.findAllLeases();
	}

	@Override
	public List<Lease> findLeaseById(String name) {
		// TODO Auto-generated method stub
		return leaseDao.findLeaseById(name);
	}

	@Override
	public Lease addLease(String name, String tap, String time) {
		// TODO Auto-generated method stub
		return leaseDao.addLease(name,tap,time);
	}

	@Override
	public Lease delLeaseById(int no,String tap) {
		// TODO Auto-generated method stub
		return leaseDao.delLeaseById(no,tap);
	}

	@Override
	public Lease upLeaseById(int no, String name, String tap, String time) {
		// TODO Auto-generated method stub
		return leaseDao.upLeaseById(no,name,tap,time);
	}
	
	
	
	


	@Override
	public List<Lease> findLeaseByIdUser(String name) {
		// TODO Auto-generated method stub
		return leaseDao.findLeaseByIdUser(name);
	}
	
	@Override
	public List<Lease> findLeaseByIdUser2(String tap,String name) {
		// TODO Auto-generated method stub
		return leaseDao.findLeaseByIdUser2(tap,name);
	}
	
	@Override
	public Lease delLeaseByIdUser(int no,String tap) {
		// TODO Auto-generated method stub
		return leaseDao.delLeaseByIdUser(no,tap);
	}

}
