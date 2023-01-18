package com.innoventes.test.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.innoventes.test.app.entity.Company1;
import com.innoventes.test.app.repository.Comapany1repository;

@Service
public class Comapny1service {
	
@Autowired	
private Comapany1repository com1repo;
	 
public Company1 savecomapny1(Company1 com)	{
	return com1repo.save(com);
	
}
public boolean deletebycid(Integer cid) {
	com1repo.deleteById(cid);
	return true;
}
public List<Company1> getall(){
	return com1repo.findAll();
}


}
