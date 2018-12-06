package com.zero.example.demo.dao;

import com.zero.example.demo.domain.CommodityDto;
import com.zero.example.demo.domain.ResponseDto;

public interface ISearchDao {

    public ResponseDto insertCommodity(CommodityDto cd);
}
