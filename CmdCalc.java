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

    public static int add(int x, int y){
        
        int sum = x + y;
        return sum;
    }

    public static double divide(int x, int y){
        
        double quotient = x / y;
        return quotient;
    }
}
