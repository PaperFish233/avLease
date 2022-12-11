package com.avLease.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avLease.dao.TapMapper;
import com.avLease.pojo.Tap;
import com.avLease.service.TapService;

@Service
public class TapServiceImpl implements TapService {
	
	@Autowired
	private TapMapper tapDao;

	@Override
	public List<Tap> findAllTaps() {
		// TODO Auto-generated method stub
		return tapDao.findAllTaps();
	}

	@Override
	public List<Tap> findTapById(String name) {
		// TODO Auto-generated method stub
		return tapDao.findTapById(name);
	}

	@Override
	public Tap addTap(String name, String tno) {
		// TODO Auto-generated method stub
		return tapDao.addTap(name, tno);
	}

	@Override
	public Tap delTapById(int no) {
		// TODO Auto-generated method stub
		return tapDao.delTapById(no);
	}

	@Override
	public Tap upTapById(int no, String name, String tno, String state) {
		// TODO Auto-generated method stub
		return tapDao.upTapById(no,name,tno,state);
	}

	@Override
	public Tap stateLease(String name) {
		// TODO Auto-generated method stub
		return tapDao.stateLease(name);
	}
	
	@Override
	public Tap leaseState(String name) {
		// TODO Auto-generated method stub
		return tapDao.leaseState(name);
	}
	
	
	
	
	@Override
	public List<Tap> findAllTapsUser() {
		// TODO Auto-generated method stub
		return tapDao.findAllTapsUser();
	}

	@Override
	public List<Tap> findTapByIdUser(String name) {
		// TODO Auto-generated method stub
		return tapDao.findTapByIdUser(name);
	}

}
