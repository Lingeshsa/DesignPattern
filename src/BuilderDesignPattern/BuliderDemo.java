package BuilderDesignPattern;

public class BuliderDemo {
	public static void main(String[] args) {
		CDBulider cdbulider =  new CDBulider();
		
		CDType cdtype1 = cdbulider.buildSonyCD();
		cdtype1.showItems();
		
		
		CDType cdtype2 = cdbulider.buildSamsungCD();
		cdtype2.showItems();
		
		
	}

}
