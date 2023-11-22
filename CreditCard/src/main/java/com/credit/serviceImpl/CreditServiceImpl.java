package com.credit.serviceImpl;

import org.springframework.stereotype.Service;

import com.credit.service.Creditservice;

@Service
public class CreditServiceImpl implements Creditservice{

	@Override
	public String validateCreditcard(String cardnumber) {
		// TODO Auto-generated method stub
		
		int num=cardnumber.length();
		for(char c:cardnumber.toCharArray()) {
			
			if(!(c>='0' && c<='9')) {
				return ("Card Number should contains only numbers");
			}
			
			if(num<15) {
				return ("length is small");
			}
			
			if(num>19) {
				return ("length is large");
			}
			
			if(num==15) {
				
				
				int x=(cardnumber.charAt(0)-'0')*1000 +(cardnumber.charAt(1)-'0')*100 + (cardnumber.charAt(2)-'0')*10 +(cardnumber.charAt(3)-'0');
				if(x==2014 || x==2149) {
					return "card marchant:enRoute";
				}
				
			}
			if(num>=16 && num<=19) {
				if(cardnumber.charAt(0)==4) {
					return "visa";
							
				}
			}
			
			int x=(cardnumber.charAt(0)-'0')*1000 +(cardnumber.charAt(1)-'0')*100 + (cardnumber.charAt(2)-'0')*10 +(cardnumber.charAt(3)-'0');
			if(x>=3528 && x<3589) {
				return "JCB";
			}
			
			
			
			
			
			
		}
		return "Not valid";
	}

	
	
}
