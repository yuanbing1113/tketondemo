package com.demo.tekton.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.tekton.model.RspModel;

@RestController
public class ApiController {
	
	@RequestMapping(value="/hello", method = RequestMethod.GET)
	public ResponseEntity<RspModel> getEttc() {

		RspModel rsp = new RspModel();
		rsp.setCode(200);
		rsp.setMsg("ok");
		rsp.setData("hello world");

		return new ResponseEntity<RspModel>(rsp, HttpStatus.OK);
	}

}
