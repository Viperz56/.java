import java.io.*;
import java.util.Scanner;


public class q2{
public static void main(String[] args){

Scanner scanner=new Scanner(System.in);


System.out.println("Enter the weight of the package: ");
double weight=scanner.nextDouble();
System.out.println("Enter the distance to be traveled");
double distance=scanner.nextDouble();

if (weight<=0||weight>20||distance<10||distance>3000) {
    System.out.println("Invalid input ");
    
}
 else if (weight<=2) {
     System.out.println("Your charges are $"+((distance/500)*1.10));
     
 }
else if (weight>=2&&weight<=6) {
    System.out.println("Your charges are $"+((distance/500)*2.20));
    
}
else if (weight>=6&&weight<=10) {
    System.out.println("Your charges are $"+((distance/500)*3.70));
    
}
else if (weight>=10&&weight<=20) {
    System.out.println("Your charges are $"+((distance/500)*4.80));
    
}




}


}