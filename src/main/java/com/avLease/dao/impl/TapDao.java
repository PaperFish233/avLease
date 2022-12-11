package com.avLease.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.avLease.dao.TapMapper;
import com.avLease.pojo.Tap;

@Repository
public class TapDao implements TapMapper {
	
	private SqlSessionTemplate sqlSession;
	
	@Autowired
	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<Tap> findAllTaps() {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(TapMapper.class).findAllTaps();
	}

	@Override
	public List<Tap> findTapById(String name) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(TapMapper.class).findTapById(name);
	}

	@Override
	public Tap addTap(String name, String tno) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(TapMapper.class).addTap(name,tno);
	}

	@Override
	public Tap delTapById(int no) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(TapMapper.class).delTapById(no);
	}

	@Override
	public Tap upTapById(int no, String name, String tno, String state) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(TapMapper.class).upTapById(no,name,tno,state);
	}

	@Override
	public Tap stateLease(String name) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(TapMapper.class).stateLease(name);
	}
	
	@Override
	public Tap leaseState(String name) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(TapMapper.class).leaseState(name);
	}
	
	
	
	
	@Override
	public List<Tap> findAllTapsUser() {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(TapMapper.class).findAllTapsUser();
	}

	@Override
	public List<Tap> findTapByIdUser(String name) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(TapMapper.class).findTapByIdUser(name);
	}

}
