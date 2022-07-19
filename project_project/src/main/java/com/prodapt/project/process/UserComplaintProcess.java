package com.prodapt.project.process;

public class UserComplaintProcess {
	static int staticComplaintNumber = 1000;
	public int RandomGenerateComplaintNumber() {
		 int min = 10000000;
	     int max = 99999999;
	      //System.out.println("Random value in int from "+min+" to "+max+ ":");
	      int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
	      //System.out.println(random_int);
	      return random_int;
	}
	
	public int staticComplaintNumberMethod() {
		this.staticComplaintNumber = this.staticComplaintNumber + 1;
		return this.staticComplaintNumber;
	}

}