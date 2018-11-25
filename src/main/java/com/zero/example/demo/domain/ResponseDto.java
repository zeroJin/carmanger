package com.zero.example.demo.domain;

public class ResponseDto {

	private int code;
	private String msg;
	private String data;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "ResponseDto [code=" + code + ", msg=" + msg + ", data=" + data + "]";
	}
}
