// if else Statements

// import java.util.*;
// public class if_else {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the age: ");
//         int age = sc.nextInt();
//         if(age>=18){
//             System.out.println("Adult : drive, vote");
//         }
//         if(age>13&&age<=18){
//             System.out.println("Teenager");
//         }
//         else{
//             System.out.println("Not Adult");
//         }
//         sc.close();


//     }
    
// }

// Print largest of two 
// import java.util.*;
// public class if_else {

//     public static void main(String args[]){
//         Scanner at = new Scanner(System.in);
//         System.out.print("Enter the Value of A: ");
//         int A = at.nextInt();
//         System.out.print("Enter the value of B: ");
//         int B = at.nextInt();
//         if(A>B){
//             System.out.println(A);
//         }
//         if(B>A){
//             System.out.println(B);
//         }
//         else{
//             System.out.println("Both the numbers are same ");
//         }
//         at.close();
//     }
// }



// //  Print the number is even or odd
// import java.util.*;
// public class if_else {

//     public static void main(String args[]){
//         Scanner at = new Scanner(System.in);
//         System.out.print("Enter the Value of A: ");
//         int A = at.nextInt();
//         if(A%2==0){
//             System.out.println("Entered number is even");
//         }
//         else{
//             System.out.println("Entered number is odd");
//         }
//         at.close();
//     }
// }

//  else if Statements

// import java.util.*;
// public class conditional_stt{
//     public static void main(String[] args) {
//         Scanner at = new Scanner(System.in);
//         System.out.print("Enter the age: ");
//         int age = at.nextInt();
//         if(age>=18){
//             System.out.println("Adult");
//         }
//         else if (age>=13&&age<18){
//             System.out.println("Teenager");
//         }
//         else{
//             System.out.println("Child");
//         }
//         at.close();
//     }
// }

// Income taX CALCULATOR 

// import java.util.*;
// public class conditional_stt {
//         public static void main(String[] args) {
//         Scanner at = new Scanner(System.in);
//         System.out.print("Enter the Amount of Income: ");
//         int income = at.nextInt();
//         int tax;
//         if(income<500000){
//             tax=0;
//         }
//         else if(income>=500000 && income<1000000){
//             tax = (int)(income*0.2);
//         }
//         else{
//             tax=(int)(income*0.3);
//         }
//         System.out.println("Your tax is :"+ tax);
//         at.close();
        
//     }
// }

// // Largest of 3 operators 
// import java.util.*;
// public class conditional_stt {

//     public static void main(String[] args) {
//         Scanner at = new Scanner(System.in);
//         System.out.print("Enter the value of A: ");
//         int A = at.nextInt();
//         System.out.print("Enter the value of B: ");
//         int B = at.nextInt();
//         System.out.print("Enter the value of C: ");
//         int C = at.nextInt();
//         if((A>=B)&&(A>=C)){
//             System.out.println(A);
//         }
//         else if ((B>=C)){
//             System.out.println(B);
//         }
//         else{
//             System.out.println(C);
//         }
//         at.close();
//     }
// }



import java.util.Scanner;
public class conditional_stt {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int number;
int choice;
int evenSum = 0;
int oddSum = 0;
do {
System.out.print("Enter the number ");
number = sc.nextInt();
if( number % 2 == 0) {
evenSum += number;
} else {
oddSum += number;
}
System.out.print("Do you want to continue? Press 1 for yes or 0 for no");
choice = sc.nextInt();
} 
while(choice==1);
System.out.println("Sum of even numbers: " + evenSum);
System.out.println("Sum of odd numbers: " + oddSum);
sc.close();
}
}