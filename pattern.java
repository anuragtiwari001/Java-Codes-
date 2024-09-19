// public class pattern {
//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(" @*$ ");
//             }
//             System.out.println();
//         }
        
//     }
    
// }

// import java.util.*;
// public class pattern {
// public static void main(String[] args) {
//     Scanner at = new Scanner(System.in);
//     System.out.print("Enter the no. of line: ");
//     int n = at.nextInt();
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=n-i+1;j++){
//             System.out.print("*");
//         }
//         System.out.println( );
//     }
//     at.close();
//     } 
// }

// import java.util.*;
// public class pattern {
//     public static void main(String[] args) {
//         Scanner at = new Scanner(System.in);
//         System.out.print("Enter the Nubber of line: ");
//         int n = at.nextInt();
//         char ch = 'A';
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++ ){
//                 System.out.print(ch);
//                 ch++;
//             }
//             System.out.println();
//         }
//         at.close();       
//     }
  
// }

// import java.util.*;
// public class pattern {
// public static void main(String[] args) {
//     Scanner at = new Scanner(System.in);
//     System.out.print("Enter the number: ");
//     int n = at.nextInt();
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=i;j++){
//             System.out.print(j);
//         }
//         System.out.println();
//     }
//     at.close();
// }
// }

// HOLLOWED RECTANGLE PATTERN 

// import java.util.Scanner;
// public class pattern {

//     public static void Hol_rec(int row , int column){
//         for(int i=1;i<=row;i++){
//             for(int j=1;j<=column;j++){
//                 if(i==1||i==row||j==1||j==column){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
                
               
//             }
//             System.out.println();
//         }
        

//     }
//     public static void main(String args[]){
//         Scanner at = new Scanner(System.in);
//         int row = at.nextInt();
//         int column = at.nextInt();
//         Hol_rec(row,column);
//         at.close();
//     }
// }

 
// // Inverted and Rotated Half Pyramid
// public class pattern {
//     public static void Inv_Half_Pyramid(int n) {
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

        
//     }
//     public static void main(String args[]){
//         Inv_Half_Pyramid(10);
//     }


// }

// // Inverted Half-Pyramid wit Numbers 
// public class pattern {

//     public static void Inv_Half_Pyramid_num(int n ) {
//         for(int i =1;i<=n;i++){
//             for(int j=1;j<=n-i+1;j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
        
//     }
//     public static void main(String[] args) {
//         Inv_Half_Pyramid_num(20);
//     }
// }

// public class pattern {
//     public static void main(String[] args) {
//         int[] num = {-2, -3, -4, -1, -2, -1, -5, -3};
//         int maxSum = num[0]; // Initialize maxSum as the first element
//         int currentSum = num[0]; // Initialize currentSum as the first element

//         for (int i = 1; i < num.length; i++) {
//             // Update currentSum to be the maximum of current element and sum of current element and previous currentSum
//             currentSum = Math.max(num[i], currentSum + num[i]);
//             // Update maxSum to be the maximum of current maxSum and currentSum
//             maxSum = Math.max(maxSum, currentSum);
//         }
//         System.out.println("Maximum sum of subarray: " + maxSum);
//     }
// }

