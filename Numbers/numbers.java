
// palindrome number
/*
 * import java.util.Scanner;
 * 
 * public class numbers {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt();
 * System.out.println(n + " is palindrome ? " + check(n));
 * }
 * 
 * public static boolean check(int n) {
 * int temp = n;
 * int reverse = 0;
 * while (n > 0) {
 * int rem = n % 10;
 * reverse = reverse * 10 + rem;
 * n /= 10;
 * }
 * return temp == reverse;
 * }
 * }
 */

// find all palindrome numbes in the range
/*
 * import java.util.Scanner;
 * 
 * public class numbers {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int left = sc.nextInt();
 * int right = sc.nextInt();
 * int count = 0;
 * System.out.println("Palindrome numbers between " + left + " and " + right);
 * for (int i = left; i <= right; i++) {
 * if (check(i) == true) {
 * System.out.print(i + " ");
 * }
 * }
 * }
 * 
 * public static boolean check(int n) {
 * int temp = n;
 * int reverse = 0;
 * while (n > 0) {
 * int rem = n % 10;
 * reverse = reverse * 10 + rem;
 * n /= 10;
 * }
 * return temp == reverse;
 * }
 * }
 */

// check if a number prime or not

/*
 * import java.util.Scanner;
 * 
 * public class numbers {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt();
 * System.out.println(n + " is a prime number : " + isPrime(n));
 * }
 * 
 * public static boolean isPrime(int n) {
 * if (n < 2) {
 * return false;
 * }
 * if (n == 2) {
 * return true;
 * }
 * int c = 2;
 * while (c * c < n) {
 * if (n % c == 0) {
 * return false;
 * }
 * c++;
 * }
 * return true;
 * }
 * }
 */

// prime numbers in the given range

/*
 * import java.util.Scanner;
 * 
 * public class numbers {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int left = sc.nextInt();
 * int right = sc.nextInt();
 * for (int i = left; i <= right; i++) {
 * if (isPrime(i) == true) {
 * System.out.print(i + " ");
 * }
 * }
 * }
 * 
 * public static boolean isPrime(int n) {
 * if (n < 2) {
 * return false;
 * }
 * if (n == 2) {
 * return true;
 * }
 * int c = 2;
 * while (c * c <= n) {
 * if (n % c == 0) {
 * return false;
 * }
 * c++;
 * }
 * return true;
 * }
 * }
 */

// check if a number is armstrong or not

/*
 * import java.util.Scanner;
 * 
 * public class numbers {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt();
 * System.out.println(n + " is an armstrong number : " + isArmstrong(n));
 * }
 * 
 * public static boolean isArmstrong(int n) {
 * int temp = n;
 * int sum = 0;
 * while (n > 0) {
 * int rem = n % 10;
 * sum += rem * rem * rem;
 * n /= 10;
 * }
 * return sum == temp;
 * }
 * }
 */

// check if a number is perfect number or not
/*
 * import java.util.Scanner;
 * 
 * public class numbers {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt();
 * System.out.println(n + " is a perfect number : " + isPerfect(n));
 * }
 * 
 * public static boolean isPerfect(int n) {
 * int temp = n;
 * int sum = 0;
 * for (int i = 1; i < n; i++) {
 * if (n % i == 0) {
 * sum += i;
 * }
 * }
 * return sum == n;
 * }
 * }
 */

// even or odd
/*
 * import java.util.Scanner;
 * 
 * public class numbers {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt();
 * System.out.println(n + " is an even number : " + isEven(n));
 * }
 * 
 * public static boolean isEven(int n) {
 * return n % 2 == 0;
 * }
 * }
 */

// positive or negative
/*
 * import java.util.Scanner;
 * 
 * public class numbers {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt();
 * System.out.println(n + " is a positive number : " + isPos(n));
 * }
 * 
 * public static boolean isPos(int n) {
 * if (n >= 0) {
 * return true;
 * }
 * return false;
 * }
 * }
 */

// sum of first n natural numbers
/*
 * import java.util.Scanner;
 * 
 * public class numbers {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt();
 * System.out.println("Sum of first " + n + " natural numbers : " + findSum(n));
 * }
 * 
 * public static int findSum(int n) {
 * return n * (n + 1) / 2;
 * }
 * }
 */

// find the sum of AP series

// find the sum of GP series

// greatest of two numbers
/*
 * import java.util.Scanner;
 * 
 * public class numbers {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int a = sc.nextInt();
 * int b = sc.nextInt();
 * System.out.println("greater of a and b : " + Math.max(a, b));
 * }
 * }
 */

// greatest of three numbers
/*
 * import java.util.Scanner;
 * 
 * public class numbers {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int a = sc.nextInt();
 * int b = sc.nextInt();
 * int c = sc.nextInt();
 * System.out.println("Greatest of three numbers :" + findGreatest(a, b, c));
 * }
 * 
 * public static int findGreatest(int a, int b, int c) {
 * if (a > b && a > c) {
 * return a;
 * } else if (b > a && b > c) {
 * return b;
 * } else {
 * return c;
 * }
 * }
 * }
 */

// leap year or not
/*
 * import java.util.Scanner;
 * 
 * public class numbers {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int year = sc.nextInt();
 * System.out.println(year + " is leap year : " + check(year));
 * }
 * 
 * public static boolean check(int n) {
 * if (n % 400 == 0) {
 * return true;
 * } else if (n % 4 == 0 && n % 100 != 0) {
 * return true;
 * }
 * return false;
 * }
 * }
 */

// reverse the digits of number
/*
 * import java.util.Scanner;
 * 
 * public class numbers {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt();
 * System.out.println("reverse of " + n + " : " + reverse(n));
 * }
 * 
 * public static int reverse(int n) {
 * int ans = 0;
 * while (n > 0) {
 * int rem = n % 10;
 * ans = ans * 10 + rem;
 * n /= 10;
 * }
 * return ans;
 * }
 * }
 */

// factorial of number
/*
 * import java.util.Scanner;
 * 
 * public class numbers {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt();
 * System.out.println("factorial : " + fact(n));
 * }
 * 
 * public static int fact(int n) {
 * int f = 1;
 * if (n == 0 || n == 1) {
 * return 1;
 * }
 * for (int i = 1; i <= n; i++) {
 * f = f * i;
 * }
 * return f;
 * }
 * }
 */

// power of number
/*
 * import java.util.Scanner;
 * 
 * public class numbers {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int a = sc.nextInt();
 * int n = sc.nextInt();
 * System.out.println("power : " + power(a, n));
 * }
 * 
 * public static int power(int a, int n) {
 * int ans = 1;
 * for (int i = 1; i <= n; i++) {
 * ans = ans * a;
 * }
 * return ans;
 * }
 * }
 */

// factors of a given number
/*
 * import java.util.Scanner;
 * 
 * public class numbers {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt();
 * for (int i = 1; i < n; i++) {
 * if (n % i == 0) {
 * System.out.print(i + " ");
 * }
 * }
 * }
 * }
 */

// print all prime factors of a number

/*
 * import java.util.Scanner;
 * 
 * public class numbers {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt();
 * for (int i = 1; i < n; i++) {
 * if (n % i == 0 && isPrime(i) == true) {
 * System.out.print(i + " ");
 * }
 * }
 * }
 * 
 * public static boolean isPrime(int n) {
 * if (n == 2) {
 * return true;
 * }
 * if (n < 2) {
 * return false;
 * }
 * int c = 2;
 * while (c * c <= n) {
 * if (n % c == 0) {
 * return false;
 * }
 * }
 * return true;
 * }
 * }
 */

// check if number is strong or not
/*
 * import java.util.Scanner;
 * 
 * public class numbers {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt();
 * System.out.println(n + " is a strong number :" + strong(n));
 * }
 * 
 * public static int fact(int n) {
 * if (n == 0 || n == 1) {
 * return 1;
 * }
 * int f = 1;
 * for (int i = 1; i <= n; i++) {
 * f = f * i;
 * }
 * return f;
 * }
 * 
 * public static boolean strong(int n) {
 * int temp = n;
 * int ans = 0;
 * while (n > 0) {
 * int rem = n % 10;
 * ans = ans + fact(rem);
 * n = n / 10;
 * }
 * return ans == temp;
 * }
 * }
 */

// check if a number is automorphic
// Problem Statement: Given a number, check if it is automorphic or not. A
// number is called an Automorphic number if and only if its square ends in the
// same digits as the number itself.

/*
 * import java.util.Scanner;
 * 
 * public class numbers {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt();
 * System.out.println(n + " is a automorphic number :" + automorphic(n));
 * }
 * 
 * public static boolean automorphic(int n) {
 * int sq = (int) Math.pow(n, 2);
 * while (n > 0) {
 * if (n % 10 == sq % 10) {
 * return true;
 * }
 * n /= 10;
 * sq /= 10;
 * }
 * return false;
 * }
 * }
 */

// print fibonacci upto nth term
/*
 * import java.util.Scanner;
 * 
 * public class numbers {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt();
 * int a = 0;
 * int b = 1;
 * System.out.print(a + " " + b + " ");
 * for (int i = 1; i <= n; i++) {
 * int temp = a + b;
 * a = b;
 * b = temp;
 * System.out.print(temp + " ");
 * }
 * }
 * }
 */

// gcd of two number
/*
 * import java.util.Scanner;
 * 
 * public class numbers {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int a = sc.nextInt();
 * int b = sc.nextInt();
 * System.out.println("GCD of two numbers :" + gcd(a, b));
 * }
 * 
 * public static int gcd(int a, int b) {
 * if (a == 0) {
 * return b;
 * }
 * return gcd(b % a, a);
 * }
 * }
 */

// lcm of two numbers
/*
 * import java.util.Scanner;
 * 
 * public class numbers {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int a = sc.nextInt();
 * int b = sc.nextInt();
 * System.out.println("LCM of two numbers :" + lcm(a, b));
 * }
 * 
 * public static int lcm(int a, int b) {
 * int max = Math.max(a, b);
 * int min = Math.min(a, b);
 * for (int i = max;; i += max) {
 * if (i % min == 0) {
 * return i;
 * }
 * }
 * }
 * }
 */

// maximum or minimum digit in a number

/*
 * import java.util.Scanner;
 * 
 * public class numbers {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt();
 * int max = findMaxDigit(n);
 * int min = findMinDigit(n);
 * System.out.println("Maximum digit in " + n + " : " + max);
 * System.out.println("Minimum digit in " + n + " : " + min);
 * }
 * 
 * public static int findMaxDigit(int n) {
 * int max = Integer.MIN_VALUE;
 * while (n > 0) {
 * int rem = n % 10;
 * if (rem > max) {
 * max = rem;
 * }
 * n /= 10;
 * }
 * return max;
 * }
 * 
 * public static int findMinDigit(int n) {
 * int min = Integer.MAX_VALUE;
 * while (n > 0) {
 * int rem = n % 10;
 * if (rem < min) {
 * min = rem;
 * }
 * n /= 10;
 * }
 * return min;
 * }
 * }
 */

// harshad number
/*
 * import java.util.Scanner;
 * 
 * public class numbers {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt();
 * System.out.println(n + " is a harshad number :" + check(n));
 * 
 * }
 * 
 * public static boolean check(int n) {
 * int temp = n;
 * int sum = 0;
 * while (n > 0) {
 * sum += n % 10;
 * n /= 10;
 * }
 * if (temp % sum == 0) {
 * return true;
 * }
 * return false;
 * }
 * }
 */

// abundant number
/*
 * import java.util.Scanner;
 * 
 * public class numbers {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt();
 * System.out.println(n + " is an abundant number :" + check(n));
 * 
 * }
 * 
 * public static boolean check(int n) {
 * int sum = 0;
 * int temp = n;
 * for (int i = 1; i < n; i++) {
 * if (n % i == 0) {
 * sum += i;
 * }
 * }
 * if (temp > sum) {
 * return false;
 * }
 * return true;
 * }
 * }
 */

// sum of digits

/*
 * import java.util.Scanner;
 * 
 * public class numbers {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt();
 * System.out.println("sum = " + check(n));
 * 
 * }
 * 
 * public static int check(int n) {
 * int sum = 0;
 * while (n > 0) {
 * sum += n % 10;
 * n /= 10;
 * }
 * return sum;
 * }
 * }
 */

// calcualte the area of circle

/*
 * import java.util.Scanner;
 * 
 * public class numbers {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt();
 * double area = 3.14 * n * n;
 * System.out.println("Area of circle : " + area);
 * 
 * }
 * }
 */

// replace all 0's with 1's

/*
 * import java.util.Scanner;
 * 
 * public class numbers {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * String s = sc.nextLine();
 * System.out.println("Replaced string : " + replace(s));
 * }
 * 
 * public static String replace(String s) {
 * StringBuilder sb = new StringBuilder();
 * for (char ch : s.toCharArray()) {
 * if (ch == '0') {
 * sb.append('1');
 * } else {
 * sb.append(ch);
 * }
 * }
 * return sb.toString();
 * }
 * }
 */

// roots of a number
/*
 * import java.util.*;
 * 
 * public class numbers {
 * static void Roots(int a, int b, int c) {
 * if (a == 0) {
 * System.out.println("Invalid");
 * return;
 * }
 * 
 * int d = b * b - 4 * a * c;
 * double sqrt_val = Math.sqrt(Math.abs(d));
 * 
 * if (d > 0) {
 * System.out.println("Roots are real and different ");
 * 
 * double root1 = (double) (-b + sqrt_val) / (2 * a);
 * double root2 = (double) (-b - sqrt_val) / (2 * a);
 * System.out.println(root1 + "\n" + root2);
 * } else if (d == 0) {
 * System.out.println("Roots are real and same ");
 * double root1 = -(double) b / (2 * a);
 * double root2 = -(double) b / (2 * a);
 * System.out.println(root1 + "\n" + root2);
 * } else // d < 0
 * {
 * System.out.println("Roots are complex ");
 * 
 * System.out.println(-(double) b / (2 * a) + " + i" + sqrt_val + "\n" +
 * -(double) b / (2 * a) + " - i" + sqrt_val);
 * }
 * }
 * 
 * public static void main(String args[]) {
 * int a = 1, b = -3, c = -10;
 * 
 * Roots(a, b, c);
 * }
 * }
 */

// can a number be expressed as sum of two prime numbers

/*
 * public class numbers {
 * public static void main(String args[]) {
 * int n = 73;
 * boolean bprime = bothPrime(n);
 * if (bprime == true) {
 * System.out.println("Yes can be expressed in form of two prime integers");
 * } else {
 * System.out.println("Not possible");
 * }
 * 
 * }
 * 
 * public static boolean prime(int n) {
 * if (n == 2) {
 * return true;
 * }
 * if (n < 2) {
 * return false;
 * }
 * int c = 2;
 * while (c * c <= n) {
 * if (n % c == 0) {
 * return false;
 * }
 * c++;
 * }
 * return true;
 * }
 * 
 * public static boolean bothPrime(int n) {
 * return prime(n) && prime(n - 2);
 * }
 * }
 */

// sum of ap series
/*
 * import java.util.Scanner;
 * 
 * public class numbers {
 * public static void main(String args[]) {
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt();
 * int a = sc.nextInt();
 * int d = sc.nextInt();
 * System.out.println("Sum of AP series : " + findSum(n, a, d));
 * }
 * 
 * public static double findSum(int n, int a, int d) {
 * if (n < 0) {
 * return 0;
 * }
 * double sum = (2.0 * a + (n - 1) * d) * (n / 2.0);
 * return sum;
 * }
 * }
 */

// sum of the GP series

/*
 * import java.util.Scanner;
 * 
 * public class numbers {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int a = sc.nextInt();
 * double r = sc.nextDouble();
 * int n = sc.nextInt();
 * System.out.println("Sum of the GP series : " + sumGP(a, r, n));
 * 
 * }
 * 
 * public static double sumGP(int a, double r, int n) {
 * double sum = a * (Math.pow(r, n) - 1) / (r - 1);
 * return sum;
 * }
 * }
 */