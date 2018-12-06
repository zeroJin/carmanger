package com.zero.example.demo.dao.impl;

import com.zero.example.demo.dao.ISearchDao;
import com.zero.example.demo.domain.CommodityDto;
import com.zero.example.demo.domain.ResponseDto;
import org.apache.ibatis.annotations.Insert;

public class SearchDao implements ISearchDao{

    @Override
    @Insert("inert into ")
    public ResponseDto insertCommodity(CommodityDto cd) {

        return null;
    }
}
