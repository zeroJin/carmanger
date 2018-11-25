package com.zero.example.demo.service.impl;

import com.zero.example.demo.dao.ISearchDao;
import com.zero.example.demo.dao.impl.SearchDao;
import com.zero.example.demo.service.ISearch;

public class Search implements ISearch{

	ISearchDao search = new SearchDao();
	
	@Override
	public String getCommodity(String start, String end) {
		
		
		return null;
	}
}
