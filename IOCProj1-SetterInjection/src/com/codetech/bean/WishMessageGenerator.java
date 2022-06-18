package com.codetech.bean;

import java.util.Date;

public class WishMessageGenerator {
	public WishMessageGenerator() {
		// TODO Auto-generated constructor stub
	}
	Date date;

    public void setDate(Date date) {
        this.date = date;
    }

    public String generateWishMessage(String user){
        int hours=date.getHours();
        if (hours<12)
            return "Good Morning "+user;
        else if (hours<16)
            return "Good Afternoon "+user;
        else if (hours<20)
            return "Good Evening "+user;
        else
            return "Good Night "+user;

        }

	

}
