package com.yash.oops.program;
class Function1{
	  int maxNum(int a,int b, int c){
		  
		  return 0;
		 
	 }
	  int maxNum(int a,int b, int c,int d){
		  return 0;
		 
	 }
	
}
class Function2 extends Function1{
	int maxNum(int a,int b, int c){
		if(a>b && a>c)
		  return a;
		else if(b>a &&b>c)
			return b;
		 return  c;
	 }
	  int maxNum(int a,int b, int c,int d){
		  if(a>b && a>c &&a>d )
			  return a;
			else if(b>a &&b>c && b>d)
				return b;
			else if(c>a && c>b && c>d)
				return c;
		  return d;
		 
	 }
	  
	  int maxNum(int[] a) {
		  int temp = 0;
		  for(int i=0;i<a.length;i++) {
			  for(int j=i+1;j<a.length;j++) {
				  if(a[i]>a[j]) {
					  temp=a[i];
					  a[i] = a[j];
					  a[j] = temp;
				  }
			  }
		  }
		  return temp;
	  }
	
}

public class max_of_three {
	
	public static void main(String[] args) {
		Fun2 f1 = new Fun2();
		System.out.println(f1.maxNum(6,7, 8, 3));
		int p =f1.maxNum(new int[]{34,90,56,2,1});
		System.out.println(p);
	}
	

}
