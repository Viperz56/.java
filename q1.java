import java.util.Scanner;
import java.io.*;
import java.util.*;

public class q1 {
public static void main(String[] args) {

    Scanner scanner=new Scanner(System.in);

float[] students=new float[3];
System.out.println("Enter your three different marks followed by space: ");

for(int i=0;i<3;i++)
{
    students[i]=scanner.nextFloat();
}
float marks1;
float marks2;
if ((students[0]>students[1])&&(students[0]>students[2])) {
    marks1=students[0];
    if(students[1]>students[2])
    marks2=students[1];
    else
    marks2=students[2];
    System.out.println("The average of the two highest marks is: "+((marks1+marks2)/2));
}

else if ((students[1]>students[0])&&(students[1]>students[2])) {
    marks1=students[1];
    if(students[0]>students[2])
    marks2=students[0];
    else
    marks2=students[2];
    System.out.println("The average of the two highest marks is: "+((marks1+marks2)/2));
}
else
{
    marks1=students[2];
    if(students[0]>students[1])
    marks2=students[0];
    else
    marks2=students[1];
    System.out.println("The average of the two highest marks is: "+((marks1+marks2)/2));
}
}
}