package com.emtec.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.emtec.demo.dao.HomeDao;

public class HomeServiceImpl implements HomeService{

	@Autowired
	HomeDao homeDao;
	
	@Override
	public String getCurrentDateTime() {
		// TODO Auto-generated method stub
		return homeDao.getCurrentDateTime();
	}

}
