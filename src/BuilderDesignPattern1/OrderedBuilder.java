package BuilderDesignPattern1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderedBuilder {
	public OrderedItems preparePizza() throws IOException{
		OrderedItems itemsOrdered =new OrderedItems();
		 
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		
	     
        System.out.println(" Enter the choice of Pizza ");  
        System.out.println("============================");  
        System.out.println("        1. Veg-Pizza       ");  
        System.out.println("        2. Non-Veg Pizza   ");  
        System.out.println("        3. Exit            ");  
        System.out.println("============================");  
          
        int pizzaandcolddrinkchoice=Integer.parseInt(br.readLine());  
        switch(pizzaandcolddrinkchoice)  
        {  
           case 1:{  
                       
                     System.out.println("You ordered Veg Pizza");  
                     System.out.println("\n\n");  
                     System.out.println(" Enter the types of Veg-Pizza ");  
                     System.out.println("------------------------------");  
                     System.out.println("        1.Cheeze Pizza        ");  
                     System.out.println("        2.Onion Pizza        ");   
                     System.out.println("        4.Exit            ");  
                     System.out.println("------------------------------");  
                                  int vegpizzachoice=Integer.parseInt(br.readLine());  
                     switch(vegpizzachoice)  
                     {  
                          case 1:  
                                {  
                                    System.out.println("You ordered Cheeze Pizza");  
                                      
                                    System.out.println("Enter the cheeze pizza size");  
                                    System.out.println("------------------------------------");  
                                    System.out.println("    1. Small Cheeze Pizza ");  
                                    System.out.println("    2. Medium Cheeze Pizza ");  
                                    System.out.println("    3. Large Cheeze Pizza ");  
                                    System.out.println("    4. Extra-Large Cheeze Pizza ");  
                                    System.out.println("------------------------------------");  
                                    int cheezepizzasize=Integer.parseInt(br.readLine());  
                     switch(cheezepizzasize) {  
                                       
                                                  
                          case 2:  
                                {  
                                    System.out.println("You ordered Onion Pizza");  
                                    System.out.println("Enter the Onion pizza size");  
                                    System.out.println("----------------------------------");  
                                    System.out.println("    1. Small Onion Pizza ");  
                                    System.out.println("    2. Medium Onion Pizza ");  
                                   
                                    System.out.println("----------------------------------");  
                                    int onionpizzasize=Integer.parseInt(br.readLine());  
                                    switch(onionpizzasize)  
                                              {  
                                                  case 1:  
                                                   itemsOrdered.addItems(new SmallOnionPizza());  
                                                   break;  
                                                      
                                                  case 2:  
                                                   itemsOrdered.addItems(new MediumOnionPizza());  
                                                   break;    
                                                     
                                                        
                                                        
                                              }       
                                   }  
                                break;  
                           
                           
                     }      
                  
                   }  
                   break;  // Veg- pizza choice completed.  
                  
            case 2:  
                   {  
                       System.out.println("You ordered Non-Veg Pizza");  
                       System.out.println("\n\n");  
                         
                                    System.out.println("Enter the Non-Veg pizza size");  
                                    System.out.println("------------------------------------");  
                                    System.out.println("    1. Small Non-Veg  Pizza ");  
                                    System.out.println("    2. Medium Non-Veg  Pizza ");  
                                   
                                    System.out.println("------------------------------------");  
                                      
                         
                       int nonvegpizzasize=Integer.parseInt(br.readLine());   
                        
                        switch(nonvegpizzasize)  
                             {  
                                 
                                  case 1:  
                                      itemsOrdered.addItems(new SmallNonVegPizza());  
                                      break;  
                                                      
                                  case 2:  
                                      itemsOrdered.addItems(new MediumNonVegPizza());  
                                      break;    
                                                     
                                 
                              }  
                                      
                       }    
                        break;  
            default:  
            {  
                  break;  
                  
            }  
                  
 }		
		
		
		System.out.println(" Enter the choice of ColdDrink ");  
        System.out.println("============================");  
        System.out.println("        1. Pepsi            ");  
        System.out.println("        2. Coke             ");  
        System.out.println("        3. Exit             ");  
        System.out.println("============================");    
                    int coldDrink=Integer.parseInt(br.readLine());  
        switch (coldDrink)   
            {  
               case 1:  
                                {  
                                    System.out.println("You ordered Pepsi ");  
                                    System.out.println("Enter the  Pepsi Size ");  
                                    System.out.println("------------------------");  
                                    System.out.println("    1. Small Pepsi ");  
                                    System.out.println("    2. Medium Pepsi ");  
                                   
                                    System.out.println("------------------------");  
                                              int pepsisize=Integer.parseInt(br.readLine());  
                                    switch(pepsisize)  
                                              {  
                                                  case 1:  
                                                   itemsOrdered.addItems(new SmallPepsi());  
                                                   break;  
                                                      
                                                  case 2:  
                                                   itemsOrdered.addItems(new MediumPepsi());  
                                                   break;    
                                                     
                                                 
                                                }  
                                 }    
                                break;  
                         case 2:  
                                {  
                                    System.out.println("You ordered Coke");  
                                    System.out.println("Enter the Coke Size");  
                                    System.out.println("------------------------");  
                                    System.out.println("    1. Small Coke ");  
                                    System.out.println("    2. Medium Coke  ");  
                                    
                                    System.out.println("------------------------");  
                                      
                                    int cokesize=Integer.parseInt(br.readLine());  
                                    switch(cokesize)  
                                              {  
                                                  case 1:  
                                                   itemsOrdered.addItems(new SmallCoke());  
                                                   break;  
                                                      
                                                  case 2:  
                                                   itemsOrdered.addItems(new MediumCoke());  
                                                   break;    
                                                     
                                                     
                                                        
                                                    
                                              }       
                                   
                                }  
                                break;  
                     default:  
                                      {  
                                                   break;  
                  
                                      }          
                           
                               }
		return itemsOrdered;
}
	
		
        }
		return itemsOrdered;
	}
		
}
