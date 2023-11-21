package com.example.Main.Data;

import java.util.ArrayList;
import java.util.List;

import com.example.Main.models.Info;
import com.example.Main.models.User;

public class Data {

	List<User> list;
	List<Info> listt;
	
	public List<User> getUser(){
		
		list=new ArrayList<>();
		list.add(new User("nihal","mirza"));
		
		return list;
	}
	
	public List<Info> getInfo(){
		
		listt=new ArrayList<>();
		listt.add(new Info(99501,"AK","ANCHORAGE","US"));
		
		return listt;
	}
}
