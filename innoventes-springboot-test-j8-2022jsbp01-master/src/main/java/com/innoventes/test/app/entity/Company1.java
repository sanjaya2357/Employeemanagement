package com.innoventes.test.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Company1 {
private String ename;
private String cname;
@Id
private Integer cid;
private Long phnum;
private Double esal;

 Company1(){
	System.out.println("I am default Constructor");
}

public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public Integer getCid() {
	return cid;
}
public void setCid(Integer cid) {
	this.cid = cid;
}
public Long getPhnum() {
	return phnum;
}
public void setPhnum(Long phnum) {
	this.phnum = phnum;
}
public Double getEsal() {
	return esal;
}
public void setEsal(Double esal) {
	this.esal = esal;
}
public Company1(String ename, String cname, Integer cid, Long phnum, Double esal) {
	super();
	this.ename = ename;
	this.cname = cname;
	this.cid = cid;
	this.phnum = phnum;
	this.esal = esal;
}


}
