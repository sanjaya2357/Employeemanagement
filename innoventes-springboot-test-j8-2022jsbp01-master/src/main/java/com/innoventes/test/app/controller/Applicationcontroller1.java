package com.innoventes.test.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.innoventes.test.app.entity.Company1;
import com.innoventes.test.app.service.Comapny1service;

@Controller
public class Applicationcontroller1 {

	@Autowired
	
	private Comapny1service comser;
	
	Applicationcontroller1(){
		System.out.println("I AM company1 controller");
	}
	
	@PutMapping("save")
	public ResponseEntity<Company1> savecompany1(@RequestBody Company1 com){
		
		Company1 res=comser.savecomapny1(com);
	if(res!=null) {
		return ResponseEntity.status(200).body(com);
	}
	else {
		
		return ResponseEntity.status(400).body(null);
	}
}
	@DeleteMapping("deletebycid/{cid}")
	public ResponseEntity <String> deletebycid(@PathVariable("cid") Integer cid){
	
		boolean res=comser.deletebycid(cid);
		if(cid!=null) {
			return ResponseEntity.status(200).body("Delete Success");
		}
		return ResponseEntity.status(400).body("Delete Failed");
	}
	
	@GetMapping("getall")
	public ResponseEntity <List<Company1>> getall1(@RequestBody Company1 com){
		
		List<Company1> res=comser.getall();
	if(res!=null) {
		return ResponseEntity.ok(res);
	}
	else {
		
		return ResponseEntity.status(400).body(null);
	}
}
}
