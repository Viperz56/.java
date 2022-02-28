import java.util.*;
import java.io.*;
public class demo
{

public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);

    System.out.println("Enter 1 for domestic and 2 for commercial: ");
    int type=scanner.nextInt();
    System.out.println("Enter ammount of units: ");
    int units=scanner.nextInt();

    if(type==1)
    {
        if(units<100)
        {
            System.out.println("Your total charges is $"+250);
        }

        if(units>100)
        {
            System.out.println("Your total charges is $"+((units-100)*8)+250);
        }

    }

    if(type==2)
    {
        if(units<300)
        {
            System.out.println("Your total charges is $"+1000);
        }

        if(units>300)
        {
            System.out.println("Your total charges is $"+((units-300)*15)+1000);
        }

    }



}


}