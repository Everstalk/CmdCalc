/**
* This class models a simple calculator that can perform the four major math 
* operations including addition, subtraction, multiplication and division
* @author Leon Ampah
* @author Michael Saneke
**/

public class CmdCalc{
    
    public static void main(String []args){
        
        System.out.println("Welcome to the Cmd calculator application");

        System.out.println("type add for addition \n subtract for subtraction \n multiply for multiplication");

        System.out.println("divide for division \n and exit to exit to app");

        String operation = args[0];
        
        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        switch(operation.toLowerCase()){
            
            case "divide":
                System.out.println("The quotient of the division is " + divide(x,y));
            break;

        }
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
