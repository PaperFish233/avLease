package com.avLease.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.avLease.dao.LeaseMapper;
import com.avLease.pojo.Lease;

@Repository
public class LeaseDao implements LeaseMapper {
	
	private SqlSessionTemplate sqlSession;
	
	@Autowired
	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<Lease> findAllLeases() {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(LeaseMapper.class).findAllLeases();
	}

	@Override
	public List<Lease> findLeaseById(String name) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(LeaseMapper.class).findLeaseById(name);
	}

	@Override
	public Lease addLease(String name, String tap, String time) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(LeaseMapper.class).addLease(name,tap,time);
	}

	@Override
	public Lease delLeaseById(int no,String tap) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(LeaseMapper.class).delLeaseById(no,tap);
	}

	@Override
	public Lease upLeaseById(int no, String name, String tap, String time) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(LeaseMapper.class).upLeaseById(no,name,tap,time);
	}
	
	
	
	
	

	@Override
	public List<Lease> findLeaseByIdUser(String name) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(LeaseMapper.class).findLeaseByIdUser(name);
	}
	
	@Override
	public List<Lease> findLeaseByIdUser2(String tap,String name) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(LeaseMapper.class).findLeaseByIdUser2(tap,name);
	}
	
	@Override
	public Lease delLeaseByIdUser(int no,String tap) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(LeaseMapper.class).delLeaseByIdUser(no,tap);
	}

}
