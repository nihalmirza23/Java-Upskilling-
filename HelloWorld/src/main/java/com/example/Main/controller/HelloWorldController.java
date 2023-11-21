package com.example.Main.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Main.Data.Data;
import com.example.Main.models.Info;
import com.example.Main.models.User;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

	@GetMapping("/hello")
	public ResponseEntity<?> helloWorld(){
		return new ResponseEntity<> ("Hello World",HttpStatus.OK);
	}
	
	@PostMapping("/auth")
	public ResponseEntity<?> authentication(@RequestBody User user){
		Data d = new Data();
		List<User> list = d.getUser();
	
		for(User u:list) {
			
			boolean cheak =u.getUserName().equals(user.getUserName()) && u.getPassWord().equals(user.getPassWord());
			
			if(cheak) {
				return new ResponseEntity<>("Valid User",HttpStatus.OK);
			}
			
		}
		
		return new ResponseEntity<>("User us not valid",HttpStatus.UNAUTHORIZED);
		
		
		
	}
	
	@GetMapping("/cheak/{pincode}")
	public ResponseEntity<?> authentication(@PathVariable Integer pincode ){
		System.out.println(pincode);
		Data d = new Data();
		List<Info> listt = d.getInfo();
		
		for(Info i:listt) {
			
			if(i.getPinCode().equals(pincode)) {
				return new ResponseEntity<>(i,HttpStatus.OK);
			}
			
			
		}
		
		return new ResponseEntity<>("User us not valid",HttpStatus.UNAUTHORIZED);
		
	}
	
	
	
	
	
}
