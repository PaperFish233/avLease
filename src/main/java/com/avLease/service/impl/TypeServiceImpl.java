package com.avLease.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avLease.dao.TypeMapper;
import com.avLease.pojo.Type;
import com.avLease.service.TypeService;

@Service
public class TypeServiceImpl implements TypeService {
	
	@Autowired
	private TypeMapper typeDao;

	@Override
	public List<Type> findAllTypes() {
		// TODO Auto-generated method stub
		return typeDao.findAllTypes();
	}

	@Override
	public List<Type> findTypeById(String ttname) {
		// TODO Auto-generated method stub
		return typeDao.findTypeById(ttname);
	}

	@Override
	public Type addType(String ttname) {
		// TODO Auto-generated method stub
		return typeDao.addType(ttname);
	}

	@Override
	public Type delTypeById(int ttno) {
		// TODO Auto-generated method stub
		return typeDao.delTypeById(ttno);
	}

	@Override
	public Type upTypeById(int ttno, String ttname) {
		// TODO Auto-generated method stub
		return typeDao.upTypeById(ttno,ttname);
	}

}
