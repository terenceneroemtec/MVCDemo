package com.emtec.demo.dao;

import java.text.DateFormat;
import java.util.Date;

public class HomeDaoImpl implements HomeDao{

	@Override
	public String getCurrentDateTime() {
		// TODO Auto-generated method stub
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		
		String formattedDate = dateFormat.format(date);
		
		return formattedDate;
	}

}
