package BuilderDesignPattern1;

public class SmallNonVegPizza extends NonVegPizza{

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Nonveg";
	}

	@Override
	public String size() {
		// TODO Auto-generated method stub
		return "Small";
	}

}
