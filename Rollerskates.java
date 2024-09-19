// public class classnotes {
    
//     public static void main(String[] args) {
//         // long l = 2147483647L;
//         // System.out.println(l);
//         //it will give error " Integer number too large " if one value exceeded
//         // byte x= 10+5L;
//         // System.out.println(x);
//         // byte x= 10/2;
//         // System.out.println(x);
//         // byte b1=10;
//         // byte b2=5;
//         // byte x= b1/b2;
//         // System.out.println(x);
//         // int , byte , short ,char they will always give return int datatype 


//     }
    
// }
// /// // Default value would not be ASSIGNED TO local variable 
// // // char d= "u1234"; This is unicode value 



// import java.util.*;
// public class classnotes {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int num = sc.nextInt();
//         int sum=0;
//         while (num>0) {
//             sum = sum+num%10;
//             num = num/10;  
//         }
//         // num++;
        
//         sc.close();
//         System.out.println(sum);


        
//     }
// }

// public class classnotes {

//     public static void main(String[] args) {
//         // double x= 0.0/0 this will give NaN not a number 
//         // double x = 10%0.0;
//         // int x=10;
//         // x++;
//         // ++x;
//         // System.out.println(x);

//         // String S1= "HEllo ";
//         // String S2= "Wipro ";
//         // System.out.println(S1.equals(S2));

// // 
//         // boolean b= 12>10&&12>0>3;
//         // boolean b= 12<10&&12>0>3;

//         // System.out.println(b);

        

//     }
// }

// public class classnotes {

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
//     public static void main(String[] args) {
//         System.out.println(isPrime(16));
//     }
// }

// // import java.util.*;
// public class classnotes {
//     public static void main(String[] args) {
//         int[] sum={};
//         int[] num ={1,2,3,4,5,6};
//         for(int i =0;i<=num.length;i++){
//             sum{}=num[]
//         }

//     }

    
// }

// public class classnotes {
//     public static void main(String[] args) {
//         int[] array = {2,4,9,10,5,3,7};
//         int[] prefixSum = calculatePrefixSum(array);
//         for (int i : prefixSum) {
//             System.out.print(i + " ");
//         }
//     }

//     public static int[] calculatePrefixSum(int[] array) {
//         int[] prefixSum = new int[array.length];
//         prefixSum[0] = array[0];
//         for (int i = 1; i < array.length; i++) {
//             prefixSum[i] = prefixSum[i - 1] + array[i];
//         }
//         return prefixSum;
//     }
// }
// import java.util.*;
// public class classnotes {
//     public static void main(String[] args) {
//         // Scanner sc =new Scanner(System.in);
//         int[] array = {2,4,9,10,5,3,7};
//         int[] prefixSum = new int[array.length];
//         prefixSum[0] = array[0];
//         for (int i = 1; i < array.length; i++) {
//             prefixSum[i] = prefixSum[i - 1] + array[i];
//         }
//         for (int i : prefixSum) {
//             System.out.print(i + " ");
//         }
//     }
//     // sc.close();
// }

// import java.util.*;
// public class classnotes {
//     public static void main (String args[]){
//         Scanner at= new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = at.nextInt();
//         System.out.println("you entered " + n);
//         at.close();
//     }
    
// }

// import java.util.*;
// public class classnotes {

//     public static void main(String[] args) {
//         Scanner at  = new Scanner(System.in);
//         System.out.print("Enter the Height: ");
//         double Height = at.nextDouble();
//         System.out.print("Enter the weight: ");
//         double weight = at.nextDouble();
//         double BMI = weight/(Height*Height);
//         System.out.println("Your BMI is " + BMI);

//         at.close();    
//     }

// }


// import java.util.*;
// public class classnotes {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         if(n%2!=0){
//             System.out.println("Weird");
//         }
//         if(n%2==0&&n<=2&&n<=5){
//             System.out.println("Not Weird");
//         }
//         if(n%2==0&&6<=n<=20){
//             System.out.println("Not Weird");
//         }
//         else if (n%2==0&&n>20){
//             System.out.println("Not Weird");
//         }
//         sc.close();
//   }
// }

// import java.util.Scanner;

// public class classnotes {

//     public static void main(String[] args) {  
//     Scanner scan = new Scanner(System.in);
//     int i = scan.nextInt();
//     double d = scan.nextDouble();
//     scan.nextLine();
//     String s = scan.nextLine();
    
//     System.out.println("String: " + s);
//     System.out.println("Double: " + d);
//     System.out.println("Int: " + i);
//     scan.close();
//     }
// }

// input:-
// 42
// 3.1415
// Welcome to HackerRank's Java tutorials!


// The issue you're facing is due to the way Scanner works in Java. When you call scan.nextInt() or scan.nextDouble(), it doesn't consume the newline character that you enter after typing the number. 
// So, when you call scan.nextLine() immediately after, it reads this newline character as an empty line and doesn't wait for you to enter a string.
// To fix this, you can add another scan.nextLine() after reading the integer and double values to consume the newline character:



// import java.util.Scanner;

// public class classnotes {

//     public static void main(String[] args) {
//             Scanner sc=new Scanner(System.in);
//             System.out.println("================================");
//             for(int i=0;i<3;i++){
//                 String s1=sc.next();
//                 int x=sc.nextInt();
//                 System.out.printf("%-15s%03d\n",s1,x);
//             }
//             System.out.println("================================");

//     }
// }
// // java 100
// // cpp 65
// // python 50



// public class R {

//     static int wheels= 1;
//     int tracks = 5;
//     public static void main(String[] args) {
//         Rollerskates s = new Rollerskates();
//         int feet =4 , tracks = 5;
//         System.out.println(feet+tracks+s.wheels);
//     }

// }

