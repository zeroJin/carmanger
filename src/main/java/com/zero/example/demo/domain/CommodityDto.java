package com.zero.example.demo.domain;


/**
 * @author Zero J
 * 商品DTO
 */
public class CommodityDto {

	//商品分类
	private String commoditySort;
	//商品品牌
	private String commodityBrand;
	//商品数量
	private int commodityNum;
	//商品价格
	private double commodityMoney;
	//商品备注
	private String commodityremark;
	public String getCommoditySort() {
		return commoditySort;
	}
	public void setCommoditySort(String commoditySort) {
		this.commoditySort = commoditySort;
	}
	public String getCommodityBrand() {
		return commodityBrand;
	}
	public void setCommodityBrand(String commodityBrand) {
		this.commodityBrand = commodityBrand;
	}
	public int getCommodityNum() {
		return commodityNum;
	}
	public void setCommodityNum(int commodityNum) {
		this.commodityNum = commodityNum;
	}
	public double getCommodityMoney() {
		return commodityMoney;
	}
	public void setCommodityMoney(double commodityMoney) {
		this.commodityMoney = commodityMoney;
	}
	public String getCommodityremark() {
		return commodityremark;
	}
	public void setCommodityremark(String commodityremark) {
		this.commodityremark = commodityremark;
	}
	@Override
	public String toString() {
		return "CommodityDto [commoditySort=" + commoditySort + ", commodityBrand=" + commodityBrand + ", commodityNum="
				+ commodityNum + ", commodityMoney=" + commodityMoney + ", commodityremark=" + commodityremark + "]";
	}
}
