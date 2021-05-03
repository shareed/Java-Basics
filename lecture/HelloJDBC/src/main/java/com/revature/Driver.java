package com.revature;

import java.util.List;

import com.revature.models.Avenger;
import com.revature.models.Home;
import com.revature.services.AvengerService;
import com.revature.services.HomeService;

public class Driver {

		private static HomeService homeService = new HomeService();
		
		private static AvengerService avengerService = new AvengerService();
		
		public static void main(String[] args) {
			List<Home> list = homeService.getAllHomes();
			
			for(Home h: list) {
				System.out.println(h);
			}
			
			System.out.println("**************************************************");
			System.out.println("***************Find Home By Home Name*************");
			Home h = homeService.findHomeByName("Stark Tower");
			System.out.println(h);
			
			
//			System.out.println("**************************************************");
//			System.out.println("***************Add Home***************************");
//			
//			Home h2 = new Home("Cap's Apartment", "5468", "3rd Street", "10521", "Brooklyn", "NY",  "USA");
//			homeService.createHome(h2);
//			h = homeService.findHomeByName("Cap's Apartment");
//			System.out.println(h);
			
			System.out.println("**************************************************");
			System.out.println("***************Avengers***************************");
			
			//List<Avenger> aList = aService.avenger
			
			List<Avenger> aList = avengerService.avengerAssemble();
			System.out.println(aList);
		}
}
