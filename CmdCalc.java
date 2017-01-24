/**
* This class models a simple calculator that can perform the four major math 
* operations including addition, subtraction, multiplication and division
* @author Leon Ampah
* @author Michael Saneke
**/

public class CmdCalc{
    
    public static void main(String args[]){
        
        System.out.println("Welcome to the Cmd calculator application \n");


     
        System.out.println("type add for addition \n subtract for subtraction \n multiply for multiplication \n");

        System.out.println("divide for division \n and exit to exit to app \n");

          

        String operation = args[0];
        
        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        switch(operation.toLowerCase()){
            
            case "divide":
                System.out.println("The quotient of the division is " + divide(x,y));
                 System.out.println("\n");
            break;
            
            case "add":
                System.out.println("The sum of the addition is " + add(x,y));
                System.out.println("\n");
            break;

            case "subtract":
                System.out.println("The difference of the subtraction is " + subtract(x,y));
                System.out.println("\n");
            break;

            case "multiply":
                System.out.println("The product of the multiplication is " + multiply(x,y));
                System.out.println("\n");
            break;

            case "exit":
                System.out.println("The app is exiting ...");
                System.out.println("\n");
                break;
        }

        System.out.println("Bye-Bye :)");
    }

    /**
    * This method finds the additive sum of two numbers
    * @param x first operand
    * @param y second operand
    * @return sum result of addition
    **/
    public static int add(int x, int y){
        
        int sum = x + y;
        return sum;
    }
    

    /**
    * This method returns the different if two numbers
    * @param x first operand
    * @param y second operand
    * @return diff the result of subtraction
    **/
    public static int subtract(int x, int y){
      
      int diff = x - y;
      return diff;
    }
    
    /**
    * This method returns the products of multiplication
    * @param x first operand
    * @param y second operand
    * @return product the result of multiplication
    **/
    public static int multiply(int x, int y){
      
      int product = x * y;
      return product;
    }

    /**
    * This method returns the result of a division of two numbers
    * @param x first operand 
    * @param y second operand
    * @return quotient result of the dividde operation
    **/
    public static double divide(int x, int y){
        
        double quotient = x / y;
        return quotient;
    }

}
