public class CmdCalc{
    
    public static void main(String args[]){
        
        System.out.println("Welcome to the Cmd calculator application");

        System.out.println("type add for addition \n subtract for subtraction \n multiply for multoplication");
        System.out.println("division for division \n and exit toexit the app");

        //String operation = args[0];
        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        if (args[0].equals("add")){
                System.out.println("The sum of the two number is " + add(x,y));
        }
            
        else if (args[0].equals("subtract")) {
            System.out.println("The difference of two numbers is " + subtract(x,y));
        }

        else if (args[0].equals("multiply")){
            System.out.println("The product of two numbers is " + multiply(x,y));
        }
    }

    public static int add(int x, int y){
        
        int sum = x + y;
        return sum;
    }
    
    public static int subtract(int x, int y){
      
      int diff = x - y;
      return diff;
    }
    
    public static int multiply(int x, int y){
      
      int mult = x * y;
      return mult;
    }

    
}
