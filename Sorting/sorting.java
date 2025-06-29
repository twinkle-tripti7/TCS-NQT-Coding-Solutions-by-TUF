// Bubble sort

/*
 * import java.util.Scanner;
 * 
 * public class sorting {
 * public static void main(String args[]) {
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt();
 * int arr[] = new int[n];
 * for (int i = 0; i < n; i++) {
 * arr[i] = sc.nextInt();
 * }
 * bubbleSort(arr, n);
 * for (int i : arr) {
 * System.out.print(i + " ");
 * }
 * }
 * 
 * public static void bubbleSort(int arr[], int n) {
 * for (int i = 0; i < n; i++) {
 * for (int j = 0; j < n - i - 1; j++) {
 * if (arr[j] > arr[j + 1]) {
 * int temp = arr[j];
 * arr[j] = arr[j + 1];
 * arr[j + 1] = temp;
 * }
 * }
 * }
 * }
 * }
 * 
 */

// Selectiom sort

/*
 * import java.util.Scanner;
 * 
 * public class sorting {
 * public static void main(String args[]) {
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt();
 * int arr[] = new int[n];
 * for (int i = 0; i < n; i++) {
 * arr[i] = sc.nextInt();
 * }
 * selectionSort(arr, n);
 * for (int i : arr) {
 * System.out.print(i + " ");
 * }
 * }
 * 
 * public static void selectionSort(int arr[], int n) {
 * for (int i = 0; i < n; i++) {
 * int smallest = i;
 * for (int j = i + 1; j < n; j++) {
 * if (arr[smallest] > arr[j]) {
 * smallest = j;
 * }
 * }
 * if (smallest != i) {
 * int temp = arr[smallest];
 * arr[smallest] = arr[i];
 * arr[i] = temp;
 * }
 * }
 * }
 * }
 */

// Insertion Sort

/*
 * import java.util.Scanner;
 * 
 * public class sorting {
 * public static void main(String args[]) {
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt();
 * int arr[] = new int[n];
 * for (int i = 0; i < n; i++) {
 * arr[i] = sc.nextInt();
 * }
 * insertionSort(arr, n);
 * for (int i : arr) {
 * System.out.print(i + " ");
 * }
 * }
 * 
 * public static void insertionSort(int arr[], int n) {
 * for (int i = 0; i < n; i++) {
 * int j = i;
 * while (j > 0 && arr[j - 1] > arr[j]) {
 * int temp = arr[j - 1];
 * arr[j - 1] = arr[j];
 * arr[j] = temp;
 * j--;
 * }
 * }
 * }
 * }
 */

// merge sort
/*
 * import java.util.Scanner;
 * 
 * public class sorting {
 * public static void main(String args[]) {
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt();
 * int arr[] = new int[n];
 * for (int i = 0; i < n; i++) {
 * arr[i] = sc.nextInt();
 * }
 * mergeSort(arr, 0, arr.length - 1);
 * for (int i : arr) {
 * System.out.print(i + " ");
 * }
 * }
 * 
 * public static void merge(int arr[], int start, int mid, int end) {
 * mid = start + (end - start) / 2;
 * int len1 = mid - start + 1;
 * int len2 = end - mid;
 * int first[] = new int[len1];
 * int second[] = new int[len2];
 * for (int i = 0; i < len1; i++) {
 * first[i] = arr[start + i];
 * }
 * for (int j = 0; j < len2; j++) {
 * second[j] = arr[mid + j + 1];
 * }
 * int mainArrayIndex = start;
 * int index1 = 0;
 * int index2 = 0;
 * while (index1 < len1 && index2 < len2) {
 * if (first[index1] <= second[index2]) {
 * arr[mainArrayIndex++] = first[index1++];
 * } else {
 * arr[mainArrayIndex++] = second[index2++];
 * }
 * }
 * 
 * while (index1 < len1) {
 * arr[mainArrayIndex++] = first[index1++];
 * }
 * while (index2 < len2) {
 * arr[mainArrayIndex++] = second[index2++];
 * }
 * }
 * 
 * public static void mergeSort(int arr[], int start, int end) {
 * int mid = start + (end - start) / 2;
 * if (start >= end) {
 * return;
 * }
 * mergeSort(arr, start, mid);
 * mergeSort(arr, mid + 1, end);
 * merge(arr, start, mid, end);
 * }
 * }
 */

// Quick sort

/*
 * import java.util.Scanner;
 * 
 * public class sorting {
 * public static void main(String args[]) {
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt();
 * int arr[] = new int[n];
 * for (int i = 0; i < n; i++) {
 * arr[i] = sc.nextInt();
 * }
 * quickSort(arr, 0, arr.length - 1);
 * for (int i : arr) {
 * System.out.print(i + " ");
 * }
 * }
 * 
 * public static int partition(int arr[], int start, int end) {
 * int i = start + 1;
 * int j = end;
 * int pivot = arr[start];
 * while (i <= j) {
 * while (i <= j && arr[i] <= pivot) {
 * i++;
 * }
 * while (i <= j && arr[j] > pivot) {
 * j--;
 * }
 * }
 * if (i < j) {
 * int temp = arr[i];
 * arr[i] = arr[j];
 * arr[j] = temp;
 * }
 * 
 * int temp = arr[start];
 * arr[start] = arr[j];
 * arr[j] = temp;
 * return j;
 * }
 * 
 * public static void quickSort(int arr[], int start, int end) {
 * if (start >= end) {
 * return;
 * }
 * int p = partition(arr, start, end);
 * quickSort(arr, start, p - 1);
 * quickSort(arr, p + 1, end);
 * }
 * }
 */