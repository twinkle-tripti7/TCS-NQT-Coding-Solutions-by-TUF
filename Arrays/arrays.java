// find the smallest element in the array

/*
 * import java.util.Scanner;
 * public class arrays {
 * public static void main(String args[]) {
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt();
 * int arr[] = new int[n];
 * for (int i = 0; i < n; i++) {
 * arr[i] = sc.nextInt();
 * }
 * System.out.println("Smallest number in array:" + findMin(arr));
 * }
 * 
 * public static int findMin(int arr[]) {
 * int min = Integer.MAX_VALUE;
 * for (int i : arr) {
 * if (i < min) {
 * min = i;
 * }
 * }
 * return min;
 * }
 * }
 */

// find the largest number in the array
/*
 * import java.util.Scanner;
 * 
 * public class arrays {
 * public static void main(String args[]) {
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt();
 * int arr[] = new int[n];
 * for (int i = 0; i < n; i++) {
 * arr[i] = sc.nextInt();
 * }
 * System.out.println("Largest number in array:" + findMax(arr));
 * }
 * public static int findMax(int arr[]) {
 * int max = Integer.MIN_VALUE;
 * for (int i : arr) {
 * if (i > max) {
 * max = i;
 * }
 * }
 * return max;
 * }
 * }
 */

// find second largest and second smallest element
/*
 * import java.util.Scanner;
 * import java.util.Arrays;
 * 
 * public class arrays {
 * public static void main(String args[]) {
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt();
 * int arr[] = new int[n];
 * for (int i = 0; i < n; i++) {
 * arr[i] = sc.nextInt();
 * }
 * Arrays.sort(arr);
 * System.out.println("second largest number in array :" + arr[arr.length - 2]);
 * System.out.println("Second smallest in the array :" + arr[1]);
 * }
 * }
 */

// reverse an array
/*
 * import java.util.Scanner;
 * 
 * public class arrays {
 * public static void main(String args[]) {
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt();
 * int arr[] = new int[n];
 * for (int i = 0; i < n; i++) {
 * arr[i] = sc.nextInt();
 * }
 * reverse(arr);
 * for (int i : arr) {
 * System.out.print(i + " ");
 * }
 * }
 * 
 * public static void reverse(int arr[]) {
 * int start = 0;
 * int end = arr.length - 1;
 * while (start < end) {
 * int temp = arr[start];
 * arr[start] = arr[end];
 * arr[end] = temp;
 * start++;
 * end--;
 * }
 * }
 * }
 */

// count frequency of each element
/*
 * import java.util.Scanner;
 * import java.util.HashMap;
 * 
 * public class arrays {
 * public static void main(String args[]) {
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt();
 * int arr[] = new int[n];
 * for (int i = 0; i < n; i++) {
 * arr[i] = sc.nextInt();
 * }
 * HashMap<Integer, Integer> map = new HashMap<>();
 * for (int i : arr) {
 * map.put(i, map.getOrDefault(i, 0) + 1);
 * }
 * for (int i : map.keySet()) {
 * System.out.println("Occurence of " + i + " is :" + map.get(i));
 * }
 * }
 * }
 */

// calculates sum of elements in an array
/*
 * import java.util.Scanner;
 * import java.util.Arrays;
 * 
 * public class arrays {
 * public static void main(String args[]) {
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt();
 * int arr[] = new int[n];
 * for (int i = 0; i < n; i++) {
 * arr[i] = sc.nextInt();
 * }
 * int sum = 0;
 * for (int i : arr) {
 * sum += i;
 * }
 * System.out.println("Sum of all elements : " + sum);
 * }
 * }
 */

// rotate array by k elements
/*
 * import java.util.Scanner;
 * 
 * public class arrays {
 * public static void main(String args[]) {
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt();
 * int arr[] = new int[n];
 * for (int i = 0; i < n; i++) {
 * arr[i] = sc.nextInt();
 * }
 * int k = 3;
 * rotate(arr, k);
 * for (int i : arr) {
 * System.out.print(i + " ");
 * }
 * }
 * 
 * public static void reverse(int arr[], int start, int end) {
 * while (start < end) {
 * int temp = arr[start];
 * arr[start] = arr[end];
 * arr[end] = temp;
 * start++;
 * end--;
 * }
 * }
 * 
 * public static void rotate(int arr[], int k) {
 * if (k < 0) {
 * return;
 * }
 * int n = arr.length;
 * k = k % arr.length;
 * reverse(arr, 0, arr.length - k - 1);
 * reverse(arr, n - k, n - 1);
 * reverse(arr, 0, n - 1);
 * }
 * }
 */

// average of all elements
/*
 * import java.util.Scanner;
 * 
 * public class arrays {
 * public static void main(String args[]) {
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt();
 * int arr[] = new int[n];
 * for (int i = 0; i < n; i++) {
 * arr[i] = sc.nextInt();
 * }
 * int sum = 0;
 * for (int i : arr) {
 * sum += i;
 * }
 * System.out.println("Average = " + sum / n);
 * }
 * }
 */

// find the median of the array
/*
 * import java.util.Scanner;
 * public class arrays {
 * public static void main(String args[]) {
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt();
 * int arr[] = new int[n];
 * for (int i = 0; i < n; i++) {
 * arr[i] = sc.nextInt();
 * }
 * System.out.println("Median of the array is :" + median(arr));
 * }
 * 
 * public static double median(int arr[]) {
 * double ans = 0;
 * int n = arr.length;
 * if (n % 2 != 0) {
 * ans += (double) arr[n - 1] / 2.0;
 * } else {
 * ans += (double) (arr[n - 1] / 2 + arr[n] / 2) / 2.0;
 * }
 * return ans;
 * }
 * }
 */

// remove duplicates from array

/*
 * public class arrays {
 * public static void main(String args[]) {
 * int arr[] = { 0, 0, 3, 3, 5, 6 };
 * System.out.println("No of unique elements after removal of duplicates are : "
 * + removeDup(arr));
 * }
 * 
 * public static int removeDup(int arr[]) {
 * int k = 0;
 * for (int i = 0; i < arr.length; i++) {
 * if (arr[i] != arr[k]) {
 * k++;
 * }
 * arr[k] = arr[i];
 * }
 * return k + 1;
 * }
 * }
 */

// remove the duplicates from unsorted array
/*
 * import java.util.LinkedHashSet;
 * import java.util.Scanner;
 * 
 * public class arrays {
 * public static void main(String args[]) {
 * Scanner sc = new Scanner(System.in);
 * // int n = sc.nextInt();
 * int arr[] = { 4, 3, 9, 2, 4, 1, 10, 89, 34 };
 * 
 * LinkedHashSet<Integer> set = new LinkedHashSet<>();
 * for (int i : arr) {
 * set.add(i);
 * }
 * System.out.println(set);
 * }
 * }
 */

// adding element in array

/*
 * import java.util.ArrayList;
 * import java.util.Scanner;
 * 
 * public class arrays {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt();
 * int arr[] = new int[n];
 * for (int i = 0; i < n; i++) {
 * arr[i] = sc.nextInt();
 * }
 * ArrayList<Integer> list = new ArrayList<>();
 * for (int i : arr) {
 * list.add(i);
 * }
 * insertbeginning(list, 6);
 * insertending(list, 7);
 * insertatPos(list, 4, 8);
 * for (int i : list) {
 * System.out.print(i + " ");
 * }
 * }
 * 
 * public static void insertbeginning(ArrayList<Integer> list, int x) {
 * list.add(0, x);
 * }
 * 
 * public static void insertending(ArrayList<Integer> list, int x) {
 * list.add(list.size() - 1, x);
 * }
 * 
 * public static void insertatPos(ArrayList<Integer> list, int index, int x) {
 * list.add(index - 1, x);
 * }
 * }
 */

// find the repeating element in an array

/*
 * import java.util.ArrayList;
 * import java.util.HashSet;
 * import java.util.Scanner;
 * 
 * public class arrays {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int arr[] = { 1, 2, 3, 4, 6, 6, 2, 1 };
 * HashSet<Integer> set = new HashSet<>();
 * ArrayList<Integer> list = new ArrayList<>();
 * for (int i : arr) {
 * if (set.contains(i)) {
 * list.add(i);
 * } else {
 * set.add(i);
 * }
 * }
 * for (int i : list) {
 * System.out.print(i + " ");
 * }
 * }
 * }
 */

// find all the non-repeating elements in the array
/*
 * import java.util.HashMap;
 * import java.util.Scanner;
 * 
 * public class arrays {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int arr[] = { 1, 2, 3, 4, 6, 6, 2, 1 };
 * HashMap<Integer, Integer> map = new HashMap<>();
 * for (int i : arr) {
 * map.put(i, map.getOrDefault(i, 0) + 1);
 * }
 * for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
 * if (entry.getValue() == 1) {
 * System.out.print(entry.getKey() + " ");
 * }
 * }
 * }
 * }
 */

// maximum subarray sum
/*
 * import java.util.Scanner;
 * public class arrays {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int arr[] = { 1, 2, 3, 4, 6, 6, 2, 1 };
 * System.out.println("Maximum subarray sum : " + maxSubarraySum(arr));
 * }
 * 
 * public static int maxSubarraySum(int arr[]) {
 * int currSum = 0;
 * int maxSum = Integer.MIN_VALUE;
 * for (int i : arr) {
 * currSum += i;
 * if (currSum > maxSum) {
 * maxSum = currSum;
 * }
 * if (currSum < 0) {
 * currSum = 0;
 * }
 * }
 * return maxSum;
 * }
 * }
 */

// maximum product subarray
/*
 * public class arrays {
 * public static void main(String[] args) {
 * int arr[] = { 2, 3, -2, 4 };
 * System.out.println("Maximum product subarray : " + maxProductSubarray(arr));
 * }
 * 
 * public static int maxProductSubarray(int arr[]) {
 * int max = Integer.MIN_VALUE;
 * for (int i = 0; i < arr.length - 1; i++) {
 * for (int j = i + 1; j < arr.length; j++) {
 * int prod = 1;
 * for (int k = i; k <= j; k++) {
 * prod = prod * arr[k];
 * max = Math.max(max, prod);
 * }
 * }
 * }
 * return max;
 * }
 * }
 */

// sorting elements of an array by frequency

/*
 * import java.util.TreeMap;
 * 
 * public class arrays {
 * public static void main(String args[]) {
 * int arr[] = { 1, 2, 3, 2, 4, 3, 1, 2 };
 * TreeMap<Integer,Integer> map=new TreeMap<>();
 * for(int i:arr){
 * map.put(i, map.getOrDefault(i,0)+1);
 * }
 * for()
 * 
 * }
 * }
 */

// search an element in an array
/*
 * public class arrays {
 * public static void main(String args[]) {
 * int arr[] = { 5, 9, 10, 45, 23, 56 };
 * int target = 7;
 * System.out.println(target + " is present in the array? " + find(arr,
 * target));
 * 
 * }
 * 
 * public static boolean find(int arr[], int x) {
 * for (int i : arr) {
 * if (i == x) {
 * return true;
 * }
 * }
 * return false;
 * }
 * }
 */

// check if an array is a subset of another array

/*
 * public class arrays {
 * public static void main(String[] args) {
 * int arr1[] = { 1, 3, 4, 5, 2 };
 * int arr2[] = { 2, 4, 3, 1, 7, 5, 15 };
 * System.out.println(isSubset(arr1, arr1.length, arr2, arr2.length));
 * 
 * }
 * static boolean isSubset(int arr1[], int m, int arr2[], int n) {
 * if (m > n)
 * return false;
 * for (int i = 0; i < m; i++) {
 * boolean present = false;
 * for (int j = 0; j < n; j++) {
 * if (arr2[j] == arr1[i]) {
 * present = true;
 * break;
 * }
 * }
 * if (present == false) {
 * return false;
 * }
 * }
 * return true;
 * }
 * }
 */

// replace elements by its rank
// Input: 20 15 26 2 98 6
// Output: 4 3 5 1 6 2

// find all the symmetric pairs in an array

// Input: (1,2),(2,1),(3,4),(4,5),(5,4)
// Output: (2,1) (5,4)
// Explanation: Since (1,2) and (2,1) are symmetric pairs and (4,5) and (5,4)
// are symmetric pairs.

// find the equilibrium index in an array

// Problem Statement: Finding Equilibrium index in an array

// Given a 0-indexed integer array nums, find the leftmost equilibrium Index.

// An equilibrium Index is an index at which sum of elements on its left is
// equal to the sum of element on its right. That is, nums[0] + nums[1] + ... +
// nums[equilibriumIndex-1] == nums[equilibriumIndex+1] +
// nums[equilibriumIndex+2] + ... + nums[nums.length-1]. If equilibriumIndex ==
// 0, the left side sum is considered to be 0. Similarly, if equilibriumIndex ==
// nums.length - 1, the right side sum is considered to be 0.

// Return the leftmost equilibrium Index that satisfies the condition, or -1 if
// there is no such index.

// Input: nums = [2,3,-1,8,4]
// Output: 3
// Explanation: The sum of the numbers before index 3 is: 2 + 3 + -1 = 4
// The sum of the numbers after index 3 is: 4 = 4