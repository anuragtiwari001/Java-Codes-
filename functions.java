// public class functions{
//     public static int greet(){
//         System.out.println("Hello World");
//         return 1;
     
//     }
//     public static void main(String[] args) {
//         greet();
//     }
// }

// Syntax with Parametrs 

// import java.util.Scanner;

// public class functions {

//     public static void calculatesum(int a , int b ){
//         int sum = a+b;
//         System.out.println("Sum is : "+ sum);
       

//     }
//     public static void main(String[] args) {
//         Scanner at = new Scanner(System.in);
//         System.out.print("Enter first number: ");
//         int a = at.nextInt();
//         System.out.print("Enter Second number: ");
//         int b = at.nextInt();
//         at.close();
//         calculatesum(a,b);
//     }

// }
 

// import java.util.Scanner;

// public class functions {

//     public static int calculatesum(int a , int b ){
//         int sum = a+b;
//         return sum;

//     }
//     public static void main(String[] args) {
//         Scanner at = new Scanner(System.in);
//         System.out.print("Enter first number: ");
//         int a = at.nextInt();
//         System.out.print("Enter Second number: ");
//         int b = at.nextInt();
//         at.close();
//        int sum = calculatesum(a,b);
//        System.out.println("Sum is : "+ sum);
//     }

// }

// // // Functon to find product if a and b 
// import java.util.*;
// public class functions {

//     public static int multiply(int a,int b){
       
//         int product = a*b;
//         return product;
        
//     }
//     public static void main(String[] args){
//         Scanner at = new Scanner(System.in);
//         System.out.print("Enter first number: ");
//         int a = at.nextInt();
//         System.out.print("Enter second number: ");
//         int b= at.nextInt();
//         int prod = multiply(a, b);
//         System.out.println("a*b= " + prod);    
//         at.close();    
//     //     prod = multiply(10,20);
//     //    System.out.println(prod);
        
//     }
// }

// // // Method to find factorial
// // import java.util.*;
// public class functions {

//     public static int fact(int n){
//         int f=1;
//         for(int i=1;i<=n;i++){
//             f=f*i;
//         }
//         return f;

//     }
//     // public static void main(String[] args) {
//     //     Scanner at= new Scanner(System.in);
//     //     System.out.print("Enter the n : ");
//     //     int n = at.nextInt();
//     //     System.out.println(fact(n));
//     //     at.close();
//     // }
//     public static int bincoeff(int n,int r){
//         int fact_n=fact(n);
//         int fact_r=fact(r);
//         int fact_nmr=fact(n-r);
//         int bincoeff=fact_n/(fact_r*fact_nmr);
//         return bincoeff;
//     }
//     public static void main(String[] args) {
//         System.out.println(bincoeff(5, 2));
//     }
// }
 
// //  Check a number is prime or not 
// public class functions {
    
//     public static boolean isPrime(int n ){
//         // Corner Cases
//         if (n==2){
//             return true ;
//         }
    
//         // boolean isPrime = true;
//         for(int i=2;i<=n-1;i++){
//             if(n%i==0){
//                  return false;
//             }

//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         System.out.println(isPrime(5));
//     }
// }

// // Check Prime OPtimised Version
// public class functions {

    // public static boolean isPrime(int n){
    //     if(n==2){
    //         return true;
    //     }
    //     for(int i=2;i<=Math.sqrt(n);i++){
    //         if(n%i==0){
    //             return false;
    //         }
    //     }
    //    return true;  
    // }
//     public static void main(String[] args) {
//         System.out.println(isPrime(16));
//     }
// }


// //  Print all prime number in Range 
// public class functions {
//     public static boolean isPrime(int n){
//         if(n==2){
//             return true;
//         }
//         for(int i=2;i<=Math.sqrt(n);i++){
//             if(n%i==0){
//                 return false;
//             }
//         }
//        return true;  
//     }
//     public static void primerange(int n ){
//         for(int i=2;i<=n;i++){
//             if(isPrime(i)){
//                 System.out.print(i+" ");
//             }
//         }

//          System.out.println();
//     }
//     public static void main(String[] args) {
//         primerange(100);
//     }
// }  

// //  Function to convert Binary number to Decimal number 
// public class functions {
//     public static void binToDec(int binnum){
//         int mynum= binnum;
//         int pow=0;
//         int decNum=0;
//         while (binnum>0) { 
//             int lastDigit=binnum%10;
//             decNum=decNum+(lastDigit*(int)Math.pow(2,pow));
//             pow++;
//             binnum=binnum/10;
            
//         }
//         System.out.println("Decimal of "+ mynum + " = " + decNum);
//     }
// public static void main(String[] args) {
//     binToDec(1000);
// }
    
// }


// // Function to Convert Decimal To Binary 
// public class functions {
//     public static void decToBin(int decnum){
//         int mynum=decnum;
//         int pow=0;
//         int binnum=0;
//         while (decnum>0) {
//             int rem = decnum%2;
//             binnum=binnum+(rem*(int)Math.pow(10,pow));
//             pow++;
//             decnum = decnum/2;
            
//         }
//         System.out.println("Binary form of " + mynum + " = " + binnum);


//     }
//     public static void main(String[] args) {
//         decToBin(745);
//     }
    

    
// }


   