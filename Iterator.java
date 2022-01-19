package com.sel;

import java.util.ArrayList;

public class Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> cityNames = new ArrayList<String>();
		
		cityNames.add("Dhaka");
		cityNames.add("Chittagong");
		cityNames.add("Khulna");
		cityNames.add("Rajshahi");
		cityNames.add("Sylhet");
		
		
        /*java.util.Iterator<String> iterator = cityNames.iterator();  

		
		while(((java.util.Iterator<String>) iterator).hasNext()) {
            System.out.print(((java.util.Iterator<String>) iterator).next() + " ");  

			
		}*/
		
		for(String name: cityNames) {
			System.out.println(name);
		}
		




	}

}
