package FactoryPattern;

abstract class PlanAbstarct {
	protected double rate;
	abstract void getRate();
	
	public void calculateBill(int units) {
		System.out.println(units*rate);
	}
	

}
