package com.demo.tekton.model;

public class RspModel {
	
	private Integer code;
	private String msg;
	private String data;
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
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
	public RspModel(Integer code, String msg, String data) {
		super();
		this.code = code;
		this.msg = msg;
		this.data = data;
	}
	public RspModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
