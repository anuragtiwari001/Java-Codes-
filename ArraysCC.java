// // import java.util.*;


// // INPUT / OUTPUT :--

// import java.util.Scanner;
// public class ArraysCC {
//     public static void main(String[] args) {
//         Scanner at = new Scanner(System.in);
//         int marks []= new int[100];
//         System.out.println("Length of Array= "+ marks.length);
//         System.out.print("Enter the Array for [0]: ");
//         marks[0]=at.nextInt();
//         System.out.print("Enter the Array for [1]: ");
//         marks[1]=at.nextInt();
//         System.out.print("Enter the Array for [2]: ");
//         marks[2]=at.nextInt();
//         // marks[0]=at.nextInt();
//         System.out.println("Physics "+ marks[0]);
//         System.out.println("Chemistry "+ marks[1]);
//         System.out.println("Maths "+ marks[2]);
//         // marks[2]=marks[2]+1;
//         // System.out.println("Maths "+ marks[2]);

//         at.close();
        
//     }
    
// }


// public class ArraysCC{
//     public static void update(int marks[]){
//         for(int i =0;i<marks.length;i++){
//             marks[i]=marks[i]+1;
//         }
//     }
//      public static void main(String args[]){
//         int marks[]={97,98,99};
//         update(marks);
        
//         for(int i=0;i<marks.length;i++){
//             System.out.println(marks[i]+" ");
//         }
//         System.out.println();
//     }
// }


// Linear Search 
// find the list of element in a given array 
// public class ArraysCC {
//     public static int LinearSearch(int numbers[],int key){
//         for(int i =0;i<numbers.length;i++){
//             if (numbers[i]==key){
//                 return i;
//             }
//         }
//         return -1;
//     }
 
//     public static void main(String[] args) {
//         int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
//         int key = 16;
//         int index = LinearSearch(numbers,key);
//         if(index==-1){
//             System.out.println("Not Found");
//         }
//         else{
//             System.out.println("Key is at index: "+index);
//         }

    


//     }
 
// }


// // String type 

// public class ArraysCC {
//     public static int LinearSearch( String menu[],String key){
//         for(int i=0;i<menu.length;i++){
//             if (menu[i]==key){
//                 return i;
//             }
//         }
//         return -1;
//     }
 
//     public static void main(String[] args) {
//         String menu[] = {"dosa", "idly", "Browny", "Burger", "Frenchfries", "Momos", "Maggie", "Manchurian"};
//         String key = "Manchurian";
//         int index = LinearSearch(menu,key);
//         if(index==-1){
//             System.out.println("Not Found");
//         }
//         else{
//             System.out.println("Key is at index: "+index);
//         }


//     }
 
// }


// // Find the largest number in the Array 
//  import java.util.*;

// public class ArraysCC{
//     public static int FindLargest (int number[]){
//         int largest = Integer.MIN_VALUE;
//         for(int i=0;i<number.length;i++){
//             if(largest<number[i]){
//                 largest=number[i];
//             }

//         }
//         return largest;
        
//     }
//     public static void main(String[] args) {
//         int number[]={1,2,6,3,5,8,56};
//         System.out.println("Largest value is "+ FindLargest(number));

//     }


// }




// //  Find the Smallest number in the Array 
// import java.util.*;
// public class ArraysCC{
//     public static int FindSmallest(int number[]){
//         int Smallest = Integer.MAX_VALUE;
//         for(int i=0;i<number.length;i++){
//             if (Smallest>number[i]) {
//                 Smallest=number[i];
                
//             }
//         }
//         return Smallest;
//     }  
//     public static void main(String[] args) {
//         int number[]={1,2,6,3,5,8,56};
//         System.out.println("Smallest value is "+FindSmallest(number));
//     }
//










// SORTING  
// public class ArraysCC {
//     public static void main(String[] args) {
//       int[] arr = {5, 2, 8, 3, 1, 6, 4};
  
//       System.out.println("Before sorting:");
//       printArray(arr);
  
//       bubbleSort(arr);
  
//       System.out.println("After sorting:");
//       printArray(arr);
//     }
  
//     public static void bubbleSort(int[] arr) {
//       int n = arr.length;
//       for (int i = 0; i < n - 1; i++) {
//         for (int j = 0; j < n - i - 1; j++) {
//           if (arr[j] > arr[j + 1]) {
//             // Swap elements
//             int temp = arr[j];
//             arr[j] = arr[j + 1];
//             arr[j + 1] = temp;
//           }
//         }
//       }
//     }
  
//     public static void printArray(int[] arr) {
//       for (int i = 0; i < arr.length; i++) {
//         System.out.print(arr[i] + " ");
//       }
//       System.out.println();
//     }
//   }



















// public class ArraysCC {
//     public static void main(String[] args) {
//       int[] arr = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 9, 1};
  
//       int index = 0;
//       int[] uniqueArr = new int[arr.length];
  
//       for (int i = 0; i < arr.length; i++) {
//         boolean isUnique = true;
//         for (int j = 0; j < i; j++) {
//           if (arr[i] == arr[j]) {
//             isUnique = false;
//             break;
//           }
//         }
//         if (isUnique) {
//           uniqueArr[index++] = arr[i];
//         }
//       }
  
//       System.out.println("Unique elements:");
//       for (int i = 0; i < index; i++) {
//         System.out.print(uniqueArr[i] + " ");
//       }
//     }
//   }

// Binary Search 
// import java.util.*;
// public class ArraysCC{
// public static int binarySearch(int numbers[],int key){
//     int start = 0 ,end=numbers.length-1;
//     while(start<=end){
//         int mid = (start+end)/2;
//         if(numbers[mid]==key){
//             return mid;
//         }
//         if(numbers[mid]<key){
//             start=mid+1;
//         }
//         else{
//             end=mid-1;
        
//         }
        
//     }
//     return -1;

// }
//  public static void main(String args[]){
//     int numbers[]={2,4,6,8,10,12,14};
//     int key =10;
//     System.out.println("Index of the key is " + binarySearch(numbers, key));
//  }

// }

 
// public class ArraysCC{
//     public static int binarySearch(int num[], int key){
//         int start = 0 , end= num.length;
//         while (start<=end) {
//             int mid = (start+end)/2;
//             if(num[mid]==key){
//                 return mid;
//             }
//             if(num[mid]<key){
//                 start=mid+1;
//             }
//             if(num[mid]>key){
//                 end=mid-1;
//             }
            
//         }
//         return -1;

//     }
//     public static void main(String[] args){
//         int num[] = {2,5,6,8,9,10,12,15};
//         int key = 2;
//         System.out.println("The key lies on the index: " + binarySearch(num, key) );
//     }
// }

// // // REVERSE AN ARRAY
// public class ArraysCC{
//     public static void rev(int num[]){
//         int first = 0 , last = num.length-1;
//         while(first<last){
//             int temp = num[last];
//             num[last]=num[first];
//             num[first]=temp;
//             first++;
//             last--;
//         }

//     }
//     public static void main(String[] agrs){
//         int num[] = {8,9,7,5,6,10,18};
//         rev(num);
//         for(int i=0;i<num.length;i++){
//             System.out.print(num[i]+ " ");
//         }
//         System.out.println();

//         }
    
// }

// // PAIRS in array 
// public class ArraysCC {

//     public static void PP(int n[]){
//         int totalpairs = 0;
//         for(int i=0;i<n.length;i++){
//             int current = n[i];
//             for(int j=i+1;j<n.length;j++){
//                 System.out.print("(" + current + "," + n[j]+ ")");
//                 totalpairs++;
//             }
//             System.out.println();
//         }
//         System.out.println("Total pairs are: " + totalpairs);

//     }
//     public static void main(String[] args) {
//         int n[] = {2,4,6,8,10};
//         PP(n);
      
//     }
// }


// // PRINT SUBARRAY WITH SUM :

// public class ArraysCC {
//     public static void SubArray(int num[]){
        
//         int sa = 0;
//         for(int i=0;i<num.length;i++){
//             int start = i;
//             for(int j=i;j<num.length;j++){
//                 int end = j;
//                 int sum =0;
//                 for(int k=start;k<=end;k++){
//                     System.out.print(num[k]+" ");
                    
//                 }
//                 System.out.println();
//                 for(int l=start;l<=end;l++){
//                     sum=sum+num[l];
//                 }
//                 System.out.println("The sum of subarray is "+sum);
                
//                 sa++;
//                 System.out.println();
//             }
//             System.out.println();
            
//         }
//         System.out.println("The no. of Subarray are: "+sa);
       
//     }
//     public static void main(String[] args) {
//         int num[]={2,4,6,8,10};
//         SubArray(num);
//     }
    
// }   

// // PRINT SUBARRAY :-
// public class ArraysCC {

//     public static void Subarray(int num[]){
//         int sa = 0;
//         for(int i=0;i<num.length;i++){
//             int start =i;
//             for(int j=i;j<num.length;j++){
//                 int end =j;
//                 for(int k= start;k<=end;k++){
//                     System.out.print(num[k]+" ");
//                 } 
//                 sa++;
//                 System.out.println();   
//             }
//             System.out.println();
//         }
//         System.out.println("Toatal subarryas are "+sa);
            
//     }

//     public static void main(String[] args){
//         int num[] ={2,4,6,8,10};
//         Subarray(num);
//     }
// }


// // MAXIMUM SUBARRAY Brute Force 
// public class ArraysCC {

//     public static void maxSubarraySum(int num[]){
//         int Curr_sum = 0;
//         int maximum_sum = Integer.MIN_VALUE;
//         for(int i=0;i<num.length;i++){
//             int start =i;
//             for(int j=i;j<num.length;j++){
//                 int end =j;
//                 Curr_sum =0;
//                 for(int k= start;k<=end;k++){
//                     Curr_sum += num[k];
//                 } 
//                 System.out.println(Curr_sum);
//                 if(maximum_sum<Curr_sum){
//                     maximum_sum = Curr_sum;
//                 }
                
//                 System.out.println();   
//             }
            
//         }
        
//         System.out.println("The maximum Sum is :"+ maximum_sum);
//     }

//     public static void main(String[] args){
//         // int num[] ={2,4,6,8,10};1
//         int num[] ={1,-2,6,-1,3};
//         maxSubarraySum(num);
//     }
// }

 


// inheritance 
// polymorphism
// abstraction
// encaptulation



// // // MAXIMUM SUBARRAY by Prefix Sum (More Optimised)
// public class ArraysCC {

//     public static void maximum_sum_PrefixSum(int num[]){
//         int Curr_sum = 0;
//         int maximum_sum = Integer.MIN_VALUE;
//         int prefix[] = new int[num.length];
//         prefix[0]=num[0];
//         for(int i=1;i<prefix.length;i++){
//             prefix[i]=prefix[i-1]+num[i];
//         }
//         for(int i=0;i<num.length;i++){
//             int start = i;
//             for(int j =i;j<num.length;j++){
//                 int end = j;
//                 Curr_sum = start == 0?prefix[end]:prefix[end]-prefix[start-1];
//                 if(maximum_sum<Curr_sum){
//                     maximum_sum = Curr_sum;
//                 }
                
//             }
//         }
//         System.out.println("Maximum Sum = "+maximum_sum);
        
//     }
//     public static void main(String[] args) {
//         int num[] = {1,-2,6,-1,3};
//         maximum_sum_PrefixSum(num);
//     }
// }


// // // // MAXIMUM SUBARRAY by KADANE'S Algorithm (Most optimised code)
// public class ArraysCC {
//     public static void Kadanes(int num[]){
//         int maximum_sum = Integer.MIN_VALUE;
//         int Curr_sum =0;
//         for(int i=0;i<num.length;i++){
//             Curr_sum = Curr_sum+num[i];
//             if(Curr_sum<0){
//                 Curr_sum=0;
//             }
//             maximum_sum = Math.max(Curr_sum,maximum_sum);

//         }
        
//         System.out.println("Our maximum subarray sum is: "+maximum_sum);
//     }
//     public static void main(String[] args) {
//         int num[]={-2,-3,4,-1,-2,1,5,-3};
//         Kadanes(num);
        
//     }
// }


// // Tapped Rain Water Problem 
// public class ArraysCC {

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
// }



// // Best Time to Buy & sell Stocks 
// public class ArraysCC {
//     public static int Buy_Sell_Stocks(int prices[]){
//         int buyprice = Integer.MAX_VALUE;
//         int maxProfit = 0;
//         for(int i=0;i<prices.length;i++){
//             if(buyprice<prices[i]){ //profit
//                 int profit = prices[i]-buyprice; //todays profit
//                 maxProfit = Math.max(maxProfit,profit); //global profit
//             }
//             else{
//                 buyprice = prices[i];
//             }
//         }
//         return maxProfit;
        
//     }
//     public static void main(String[] args) {
//         int prices[]={7,1,5,3,6,4};
//         int totalmaxprofit = Buy_Sell_Stocks(prices);
//         System.out.println("Total profit is: "+totalmaxprofit);
//     }
// }



// public class ArraysCC {
//     public static int Buy_Sell_Stocks(int prices[]){
//         int buyprice = Integer.MAX_VALUE;
//         int maxProfit = 0;
//         for(int i=0;i<prices.length;i++){
//             if(buyprice<prices[i]){
//                 int profit = prices[i]-buyprice;
//                 maxProfit = Math.max(maxProfit, profit);
//             }
//             else{
//                 buyprice = prices[i];
//             }
//         }
//         return maxProfit;

//     }
//     public static void main(String[] args) {
//         int prices[] = {7,1,5,3,6,4};
//         int mf = Buy_Sell_Stocks(prices);
//         System.out.println("MAximum profit is: "+ mf);
//     }
// }


// Rotate an Array 
// public class ArraysCC {

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
//     for(int j=1;j<=5;j++){
//         Rotate(arr);
//     }
//     // Print the rotated array
//     for (int i=0;i<arr.length;i++) {
//         System.out.print(arr[i]+" ");
//     }
// }
// }

// Remove Duplicate elemnts from an Array 

// import java.util.Arrays;

// public class ArraysCC {
//     public static void removeDup(int[] input ) {
//         int[] arr = new int[input.length];
//         arr[0] = input[0];
//         int i= 0;
//         int j= 1;
//         while (j<input.length) {
//             if(arr[i] != input[j]){
//                 i++;
//                 arr[i]=input[j];
//             }
//             j++;
//         } 
//         System.out.println(Arrays.toString(arr));
//         // System.out.println(i+1);
        
//         int[] a = new int[i+1];
//         for(int k=0;k<a.length;k++){
//             a[k]=arr[k];
//         }
//         System.out.println(Arrays.toString(a));
        
//     }
//     public static void main(String[] args) {
//         int input[] = {1,2,2,3,3,4,5,5,6,7,7};
//         removeDup(input);
//     }
// }

