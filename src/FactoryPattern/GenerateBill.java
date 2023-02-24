package FactoryPattern;

import java.io.*;

public class GenerateBill {
	public static void main(String[] args)throws IOException {
		GetPlanFactory planFactory = new GetPlanFactory();
		System.out.println("CommercialPlan,DomesticPlan,Institutonal");
		System.out.println("enter the name of Plan bill be generated:");
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    
	    String planName = br.readLine();
	    
	    System.out.println("Enter the of uits for bill will be calculated");
	    int units = Integer.parseInt(br.readLine());
	    
	    PlanAbstarct p =planFactory.getPlan(planName);
	    p.getRate();
	    p.calculateBill(units);
	    
	  }

}
