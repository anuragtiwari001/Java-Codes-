// // //  ARray classnotes
// // // declaration 
// // // {, , , , }= int = 0

// // reverse a number
// import java.util.*;
// public class classsnotes {
//     public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter the number: ");
//     int num = sc.nextInt();
//     int rev =0;
//     while(num>0){
//         rev=rev*10+num%10;
//         num = num/10;
//     }
//     System.out.print(rev);

//     sc.close();
//     }

   
// }

// // fabonacci series
// import java.util.Arrays;
// import java.util.Scanner;
// public class classsnotes{
//     public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter the length: ");
//     int len = sc.nextInt();
//     if(len==1) {
//         System.out.println("[0]");
//     }
//     else if(len==2){
//         System.out.println("[0, 1]");
//     }
//     else{
//         int arr[] = new int[len];
//         arr[0] = 0;
//         arr[1] = 1;
//         for(int i=2;i<arr.length;i++){
//             arr[i]  = arr[i-1]+arr[i-2];

//         }
       
//         System.out.println (Arrays.toString(arr));
//     }

//     sc.close();
//     }
// }


// // HCF
// // import java.util.Arrays;
// import java.util.Scanner;
// public class classsnotes {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter num1: ");
//         int num1=sc.nextInt();
//         System.out.print("Enter num2: ");
//         int num2=sc.nextInt();
//         int min = num1<num2?num1:num2;
//         while(!(num1%min==0&&num2%min==0)){
//             min --;
//         }
//         System.out.println(min);
//         sc.close();
//     }
// }




// // LCM
// import java.util.Scanner;
// public class classsnotes {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter num1: ");
//         int num1=sc.nextInt();
//         System.out.print("Enter num2: ");
//         int num2=sc.nextInt();
//         int max = num1>num2?num1:num2;
//         while(!(max%num1==0&&max%num2==0)){
//             max++;
//         }
//         System.out.println(max);
        

    
//         sc.close();
//     }
// }


// // PERFECT NUMBER 
// import java.util.*;
// public class classsnotes {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int i = 0;
//         int sum =0;
        
//         while((num/2)>i){
//             i++;
//             if(num%i==0){
//                 sum=sum+i;
//             }

//         }
//         System.out.println(sum==num);
//         sc.close();


        
//     }
// }


// // ANANGRAM 
// public class classsnotes {

//     public static void main(String[] args) {
//         String str1 = "abcd";
//         String str2 = "bcda";
//         char[]
//     }
// }


// public class classsnotes {
//     public static void main(String[] args) {
//         int arr[]= {9,9,9};
//         int n= arr.length;
//         for(int i=n-1;i>=0;i--){
//             if(arr[i]==9){
//                 arr[i]=0;

//             }
//             else{
//                 arr[i]++;
//                 break;
//             }
            
//         }
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+",");
//         }
        
//     }

    
// }



// public class classsnotes {
//     public static void main(String[] args) {
//         int arr[]={9,9,9};
//         int n = arr.length;
//         boolean allNines = true;
//         for (int i=n-1;i>=0;i--) {
//             if (arr[i]==9) {
//                 arr[i]=0;
//             } else {
//                 arr[i]++;
//                 allNines=false;
//                 break;
//             }
//         }
//         StringBuilder sb = new StringBuilder();
//         if (allNines) {
//             sb.append("1,");
//         }
//         for (int i=0;i<n;i++) {
//             sb.append(arr[i]);
//             if (i<n-1){
//                 sb.append(",");
//             }
//         }
//         System.out.println(sb.toString());
//     }
// }


// Rotate an Array 
// public class classsnotes {

//     public static void Rotate(int arr[]){
//         int val = arr[arr.length-1]; // Store the last element
//         int i = arr.length-1; 
//         while (i>0) {
//             arr[i]=arr[i-1];
//             i--;    
//         }
//         arr[0] = val; // Assign the last element to the first position
        
//     }
//    public static void main(String[] args) {
//     int arr[] = {1,2,3,4,5,6,7,8,9};
//     // Rotate(arr);
//     for(int j=1;j<=3;j++){
//         Rotate(arr);
//     }
//     // Print the rotated array
//     for (int i=0;i<arr.length;i++) {
//         System.out.print(arr[i]+" ");
//     }

// }
// }


// // Tapped Rain Water Problem 

// import java.util.Arrays;

// public class classsnotes {

//     public static int TrappedRainWater(int height[]){
//         int n = height.length;
//         // Calculate left max boundary - array 
//         int left_max[] = new int[n];
//         left_max[0] = height[0];
//         for(int i=1;i<n;i++){
//             left_max[i]= Math.max(height[i],left_max[i-1]);
//         } 
//         // Calculate right max boundary - array 
//         int right_max[]=new int[n];
//         right_max[n-1]= height[n-1];
//         for(int i=n-2;i>=0;i--){
//             right_max[i]=Math.max(height[i],right_max[i+1]);
//         }
//         int trappedwater = 0;
//         for(int i=0;i<n;i++){
//             // Waterlevel = min(leftmax bound , right bound)
//             int waterLevel = Math.min(left_max[i],right_max[i]);
//             trappedwater += waterLevel-height[i];
//         }
//         return trappedwater;

//     }
//     public static void main(String[] args) {
//         int height[]={4,2,0,6,3,2,5};
//         int water=TrappedRainWater(height);
//         System.out.println("The trapped rainwater is: "+water);
        
//     }

//     // Candy Problem
    
//     public static void CandyCount(int rating[]){
//         int can[] = new int[rating.length];
//         can[0]=1;
//         int i =0;
//         int j =1;
//         while(j<rating.length){
//             if(rating[i]<rating[j]){
//                 can[j]=can[i]+1;   

//             }
//             else{
//                 can[j]=1;
//             }
//             i++;
//             j++;
//         }


//         System.out.println(Arrays.toString(can));
//     }
//     public static void main(String[] args) {
//         int rating []= {1,1,2,3,4,};
//     }
// }



import java.util.Scanner;
public class classnotes{
    public static void main(String[] args){
      
	  Scanner scanner=new Scanner(System.in);
	  System.out.print("enter a no: " );
	  int num = scanner.nextInt();
    //   int total_count = 0;
      int odd_count=0;
      int even_count=0;
	  int sum=0;

	  while(num!=0){
        // num = num%10;
		sum+=num%10;
        if(num%2==0){
            even_count++;
        }
        else if(num%2!=0){
            odd_count++;
        }
        // total_count= total_count++;
		num/=10;
	}
	System.out.println("Sum of digit:"+sum);
    System.out.println("The odd number of digits are "+odd_count);
    System.out.println("The even number of digits are "+even_count);
    System.out.println("The total number of digits are "+(odd_count+even_count));
    scanner.close();        
    }
}

