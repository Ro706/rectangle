//Program to find the area of a rectangle
// Using scanner class
 
import java.util.*;
 //Made by rohit
 class number
 {
   public static void main(String args[])
   { 
     Scanner sc = new Scanner(System.in);
     
     
     // accept a lenght 
    System.out.println("Enter Lenght Of a Rectangle:");
    int l = sc.nextInt(); 
    
    // accept a breadth
    System.out.println("Enter Breadth of a Rectangle:");
    int b = sc.nextInt() ;
    
    // print area using formula
    System.out.println("Parimeter of a Rectangle:"+ 2*(l+b));
    
    // Area of rectangle 
    System.out.println("Area of a Rectangle:"+(l*b));
    
   }
 }
 
