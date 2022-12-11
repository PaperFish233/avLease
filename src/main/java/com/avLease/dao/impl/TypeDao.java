package com.avLease.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.avLease.dao.TypeMapper;
import com.avLease.pojo.Type;

@Repository
public class TypeDao implements TypeMapper {
	
	private SqlSessionTemplate sqlSession;
	
	@Autowired
	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<Type> findAllTypes() {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(TypeMapper.class).findAllTypes();
	}

	@Override
	public List<Type> findTypeById(String ttname) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(TypeMapper.class).findTypeById(ttname);
	}

	@Override
	public Type addType(String ttname) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(TypeMapper.class).addType(ttname);
	}

	@Override
	public Type delTypeById(int ttno) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(TypeMapper.class).delTypeById(ttno);
	}

	@Override
	public Type upTypeById(int ttno, String ttname) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(TypeMapper.class).upTypeById(ttno,ttname);
	}

}
