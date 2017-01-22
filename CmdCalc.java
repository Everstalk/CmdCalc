public class CmdCalc{
    
    public static void main(String []args){
        
        System.out.println("Welcome to the Cmd calculator application");

        System.out.println("type add for addition \n subtract for subtraction \n multiply for multoplication");
        System.out.println("division for division \n and exit toexit the app");

        String operation = args[0];
        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        switch(operation.toLowerCase()){
            
            case "add":
                System.out.println("The sum of the two number is " + add(x,y));
            break;

        }
    }

    public static int add(int x, int y){
        
        int sum = x + y;
        return sum;
    }

    
}
