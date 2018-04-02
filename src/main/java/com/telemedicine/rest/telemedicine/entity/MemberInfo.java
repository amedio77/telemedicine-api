package com.telemedicine.rest.telemedicine.entity;


import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public  class MemberInfo {

	@Id
    private String userId;
    private String 	pass;
	private String 	name;
	private String 	Birth;
    private int 	gender;
	private String 	area;
	private String 	phone;
	private String 	email;
	private String 	height;
	private String 	weight;
	private String 	diss;
	private String 	hospital;
	//private String 	depMedi1;
	//private String 	depMedi2;
	//private String 	depMedi3;
	private String 	delYn;
	private String 	sleepStartTime;
	private String 	sleepEndTime;
	private String 	regDt;
	private String 	token;
	private int 	roleType;

}
