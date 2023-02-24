package BuilderDesignPattern1;

import java.io.IOException;

public class BuilderDemo {
	public static void main(String[] args) throws IOException {  
        // TODO code application logic here  
          
        OrderedBuilder builder=new OrderedBuilder();  
          
        OrderedItems orderedItems=builder.preparePizza();  
          
        orderedItems.showItems();   
        System.out.println("\n");  
        System.out.println("Total Cost : "+ orderedItems.getCost());  
	}   

}
