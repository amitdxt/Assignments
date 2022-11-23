package com.yash.oops.program;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class test {

	public static void main(String[] args) {
		Department_Q1 d1[]= new Department_Q1[10];
		d1[0]= new Department_Q1(1122,"java");
		d1[1]= new Department_Q1(1124,"c+");
		d1[2]= new Department_Q1(1125,"python");
                     
                      
                      Employee_Q1 e1= new Employee_Q1(678, "akash" ,"Hyd","06/07/1995");
                      e1.setDepobj(d1[0]);
                      e1.setDate_of_joining("20/22/2022");
                      
                      
                      e1.setBase_location("pune");
                      e1.setContactno(678578658);
                     
                      e1.setEmailid("def@gmail.com");
                      e1.setSalary(30000);
                      
//                      System.out.println(e1.getDob());
//                      System.out.println(e1);
                      List<Integer> al= new ArrayList<>();
                      al.add(10); al.add(110); al.add(170); al.add(120); al.add(810); al.add(150);
                      System.out.println(al);
                    Iterator it = al.iterator();
                    int count=0;
                    while(it.hasNext()) {
                    	System.out.println(it.next());
                    	count++;
                    	if(count==3) {
                    		break;
                    	}
                    }
                    
                    
                    //al  3 elements
                    //filter works n each ele
               for(Integer i:al) {
            	   
            	   
               }
                    
                   
                      
                     
                    
	}

}
