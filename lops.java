// While loop

// public class lops {
//     public static void main(String[] args) {
//         int counter = 0;
//         while(counter<10){
//             System.out.println("Hello World ");
//             counter++;
//         }
//         System.out.println("Printed Hello World 10 times");
//     }
    
// }
 
// // Print numbers from 1 to 10 
// public class lops {
// public static void main(String[] args) {
//     int counter = 1;
//     while (counter<=10) {
//         System.out.print(counter+" ");
//         counter++;
//     }
// }
// }


// Print numbers from 1 to n 

// import java.util.*;
// public class lops {
// public static void main(String[] args) {
//     Scanner at = new Scanner(System.in);
//     System.out.print("Enter the value of range: ");
//     int range = at.nextInt();
//     int counter = 1;
//     while (counter<=range) {
//         System.out.println(counter);
//         counter++;
//     }
//     at.close();
// }
// }

//  Print the sum of n numbers 
// import java.util.*;
// public class lops {
// public static void main(String[] args) {
//     Scanner at = new Scanner(System.in);
//     System.out.print("Enter the Range(n): ");
//     int n = at.nextInt();
//     int i = 1;
//     int sum = 0;
//     while (i<=n) {
//         sum+=i;
//         i++;
//     }
//     System.out.println("sum of entered range(n) is : "+ sum);
//     at.close();
// }
// }

// // For loop 
// public class lops {
// public static void main(String[] args) {
//     int i;
//     for(i=1;i<=10;i++){
//         System.out.println("Hello World");
//     }
    
// }
// }

// square pattern 

// public class lops {
// public static void main(String[] args) {
//     int line;
//     for(line=1;line<=4;line++){
//         System.out.println(" * * * * ");
//     }
    
// }
// }

// // Print Reverse of a number (10899)
// import java.util.*;
// public class lops {
// public static void main(String[] args) {
//     Scanner at = new Scanner(System.in);
//     System.out.print("Enter the number: ");
//     int n = at.nextInt();
//     while (n>0) {
//         int lastdigit = n%10;
//         System.out.print(lastdigit+" ");
//         n/=10; //n=n/10
//     }
//     System.out.println();
//     at.close();
// }
// }

// import java.util.*;
// public class lops {
// public static void main(String[] args) {
//     Scanner at = new Scanner(System.in);
//     System.out.print("Enter the number: ");
//     int n = at.nextInt();
//     int rev=0;
//     while(n>0){
//         int lastdigit = n%10;
//         rev = (rev*10)+lastdigit;
//         n/=10;
//     }
//     System.out.println(rev);
//     at.close();
     
// }
// }

// public class lops {
//     public static void main(String[] args) {
//         int i = 10;
//         do {
//             System.out.println(i);
//             i--;
//         } while (i>0);
//     }
// }

// public class lops {
//     public static void main(String[] args) {
//         int i = 10;
//         do {
//             System.out.println(i);
//             i--;
//         } while (i>10);
//     }
// }

// public class lops {
//     public static void main(String[] args) {
//         int i;
//         int j;
//         for(i=1;i<=3;i++){
//             if (i%2==0) {
//                 continue;
//             }
//             for(j=1;j<=3;j++){
//                 if(j%2==0){
//                     continue;
//                 }
//                 System.out.println(i+"*"+j+"="+i*j);
//             }
//             System.out.println( );
//         }
    
//     }
// }




// import java.util.*;
// public class lops {
//        public static void main(String[] args) {
//         Scanner at = new Scanner(System.in);
//         do{
//             System.out.print("Enter the number: ");
//             int num = at.nextInt();
//             if(num%10==0){
//                 System.out.println("X....skipped....X");
//                 continue;   
//             }
//             System.out.println(num);
//         }
//         while(true); 
//     }

// }
//  Note that if  at.close() statement is placed after the loop, 
// which means it will never be reached because the loop runs 
// indefinitely. It's generally a good practice to close resources 
// like Scanner objects when you're done with them to free up system 
// resources. However, in this case, it's not possible to close the 
// Scanner object because the program will never exit the loop.

//  check if a number is prime or not 
// import java.util.*;
// public class lops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();

//         if(n==2){
//             System.out.println("n is prime no.");
//         }
//         else{
//             boolean isprime = true;
//             for(int i =2;i<=n-1;i++){ // n is a multiple of i (i is not =1 or n)
//                 if(n%i==0){
//                     isprime = false;
//                 }
//             }
//             if(isprime==true){
//                 System.out.println("n is prime");
//             }
//             else{
//                 System.out.println("n is not prime");
//             }
//         }

//     sc.close();
//     }
// }


// //  For more optimisation in checking big numbers we use underroot n * underroot n method 
 
// import java.util.*;
// public class lops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();

//         if(n==2){
//             System.out.println("n is prime no.");
//         }
//         else{
//             boolean isprime = true;
//             for(int i =2;i<=Math.sqrt(n);i++){ // n is a multiple of i (i is not =1 or n)
//                 if(n%i==0){
//                     isprime = false;
//                 }
//             }
//             if(isprime==true){
//                 System.out.println("n is prime");
//             }
//             else{
//                 System.out.println("n is not prime");
//             }
//         }

//     sc.close();
//     }
// }


// // Question 2 : Write a program that reads a set of integers, and then prints the sum of the
// // even and odd integers.

// import java.util.*;
// public class lops {
// public static void main(String[] args) {
//     Scanner at = new Scanner(System.in);
//     int number;
//     int evensum=0;
//     int oddsum=0;
//     int choice;
//     do{
//         System.out.print("Enter the number: ");
//         number= at.nextInt();
//         if(number%2==0){
//             evensum+=number;
//         }
//         else{
//             oddsum+=number;
//         }
//         System.out.print("If you wanna continue press 1 or 0 for exit: ");
//         choice = at.nextInt();

//     }while(choice==1);
    
//     System.out.println("Sum of even numbers: " + evensum);
//     System.out.println("Sum of odd numbers: " + oddsum);

//     at.close();
// }
// }

// Question 3 : Write a program to find the factorial of any number entered by the user.
// (Hint : factorial of a number n = n * (n-1) * (n-2) * (n-3) * …… * 1 and exists for positive numbers
// only. We write factorial as n!
// So, factorial of 0! = 1, 1! = 1, 2! = 2, 3! = 6, 4! = 24 and so on.
// Note - Please do not confuse factorial with NOT EQUAL TO operator, they are not the same)

// import java.util.*;
// public class lops {
// public static void main(String[] args) {
//     Scanner at = new Scanner(System.in);
//     System.out.print("Enter the number: ");
//     int num = at.nextInt();
//     int fact= 1 ;
//     for(int i=1; i<=num; i++ ){
//         fact*=i;
//     }
//     System.out.println("The Factorial of "+num+" is "+fact);
//     at.close();
// }
// }

// Question 4 : Write a program to print the multiplication table of a number N, entered by the
// user.

// import java.util.*;
// public class lops {
// public static void main(String[] args) {
//     Scanner at = new Scanner(System.in);
//     System.out.print("Enter the number: ");
//     int number=at.nextInt();
//     for(int i =1;i<=10;i++){
//         // int table = number*i;
//         // System.out.println(table);
//         System.out.println(i+" * "+number+" = "+i*number);

//     }
//     at.close();
// }
// }
