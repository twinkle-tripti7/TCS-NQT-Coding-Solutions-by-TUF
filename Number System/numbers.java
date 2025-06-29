// binary to decimal

/*
 * import java.util.Scanner;
 * 
 * public class numbers {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt();
 * System.out.println(n + " in decimal system : " + binToDec(n));
 * }
 * 
 * public static int binToDec(int n) {
 * String num = String.valueOf(n);
 * int ans = 0;
 * for (int i = 0; i < num.length(); i++) {
 * ans = ans + (int) Math.pow(2, num.length() - i - 1) *
 * Integer.parseInt(String.valueOf(num.charAt(i)));
 * 
 * }
 * return ans;
 * }
 * }
 */

// Binary to Octal

/*
 * import java.util.Scanner;
 * public class numbers {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt();
 * int numtoDec = binToDec(n);
 * int ans = octalNum(numtoDec);
 * System.out.println("Octal string :" + ans);
 * 
 * }
 * 
 * public static int binToDec(int n) {
 * String num = String.valueOf(n);
 * int ans = 0;
 * for (int i = 0; i < num.length(); i++) {
 * ans = ans + (int) Math.pow(2, num.length() - i - 1) *
 * Integer.parseInt(String.valueOf(num.charAt(i)));
 * 
 * }
 * return ans;
 * }
 * 
 * public static int octalNum(int n) {
 * String str = Integer.toOctalString(n);
 * return Integer.parseInt(str);
 * }
 * }
 */

// decimal to binary

/*
 * import java.util.Scanner;
 * 
 * public class numbers {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt();
 * System.out.println(n + " to binary string : " + decToBin(n));
 * }
 * 
 * public static String decToBin(int n) {
 * StringBuilder sb = new StringBuilder();
 * while (n > 0) {
 * int rem = n % 2;
 * sb.append(rem);
 * n /= 2;
 * }
 * return sb.reverse().toString();
 * }
 * }
 */

// decimal to octal

/*
 * import java.util.Scanner;
 * 
 * public class numbers {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt();
 * int ans = Integer.parseInt(decToOct(n));
 * System.out.println(n + " to octal number  : " + ans);
 * }
 * 
 * public static String decToOct(int n) {
 * return Integer.toOctalString(n);
 * }
 * }
 */

// octal to binary
/*
 * import java.util.Scanner;
 * 
 * public class numbers {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt(); // input as octal number
 * int ntoDec = octToDec(n);
 * System.out.println(n + " to binary : " + decToBin(ntoDec));
 * 
 * }
 * 
 * public static int octToDec(int n) {
 * String num = String.valueOf(n);
 * int ans = 0;
 * for (int i = 0; i < num.length(); i++) {
 * ans = ans + (int) Math.pow(8, num.length() - i - 1) *
 * Integer.parseInt(String.valueOf(num.charAt(i)));
 * 
 * }
 * return ans;
 * }
 * 
 * public static String decToBin(int n) {
 * StringBuilder sb = new StringBuilder();
 * while (n > 0) {
 * int rem = n % 2;
 * sb.append(rem);
 * n /= 2;
 * }
 * return sb.reverse().toString();
 * }
 * }
 */

// octal to decimal

/*
 * import java.util.Scanner;
 * 
 * public class numbers {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt(); // input as octal number
 * System.out.println(n + " to binary : " + octToDec(n));
 * 
 * }
 * 
 * public static int octToDec(int n) {
 * String num = String.valueOf(n);
 * int ans = 0;
 * for (int i = 0; i < num.length(); i++) {
 * ans = ans + (int) Math.pow(8, num.length() - i - 1) *
 * Integer.parseInt(String.valueOf(num.charAt(i)));
 * 
 * }
 * return ans;
 * }
 * }
 */

// convert digit/numbers to words
