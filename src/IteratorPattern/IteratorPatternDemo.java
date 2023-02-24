package IteratorPattern;

public class IteratorPatternDemo {
	public static void main(String[] args) {
		CollectionOfName sr = new CollectionOfName();
		
		for(Iterator iter = sr.getIerator();iter.hasNext();){
			
			String name = (String)iter.next(); 
			System.out.println("Name:"+name);

		}
	}

}
