import java.util.Scanner;


public class greater{

   
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter 2 numbers");

        int a = myObj.nextInt();
        int a1= myObj.nextInt();
        int w=a+a1;

       
        System.out.println("addition of two numbers " + w);
    }
}