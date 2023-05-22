import java.util.ArrayList;
import java.text.NumberFormat;

import java.util.Locale;

public class CafeUtil{
    public  int getStreakGoal(int numWeeks ){
        int sum = 0;
        for ( int i=0; i<=numWeeks; i++){
             sum = sum +i;
        }
        return  sum;
        
    }

    public double getOrderTotal( double[] lineItems){
       
        double total = 0;
        for (int i= 0; i<lineItems.length; i++){
            total = total + lineItems[i];
        }
        return total;
    }
    
    public void displayMenu( ArrayList<String>  menu){
        
        for( int i=0 ; i<menu.size(); i++){
            System.out.println(i + " "+ menu.get(i));
        }
            
        
    }

    public void addCustomer(ArrayList<String> customers){
   
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        
        System.out.println("Hello," + " " + userName);
        
        
        for(int i=0; i<=customers.size(); i++) {
            System.out.println(String.format("There are  %s  people in front of you", (i)));
            
            
        }
            customers.add(userName);
           
       
        
        System.out.println(customers);
        
              

    }

        // Bonus - First Exercise

    // public void printPriceChart(String product, double price, int maxQuantity){

    //     System.out.println(product);
    //     for( int i =1; i<maxQuantity; i++){
    //        double result = (price*i);
    //         NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
    //         String formattedString = franceFormat.format(result);
    //         System.out.println( i + " " + formattedString);
    //     } 
        
    // }


}

