// string is palinndrome or not

/*import java.util.Scanner;

public class strings {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s + " is plaindrome ? " + check(s));
    }

    public static boolean check(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }
        for (int i = 0; i < s.length() / 2; i++) {
            char first = s.charAt(i);
            char last = s.charAt(s.length() - i - 1);
            if (first != last) {
                return false;
            }
        }
        return true;
    }
}
*/

// count the number of vowels, consonants, spaces

/*import java.util.Scanner;

public class strings {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toLowerCase();
        System.out.println("Vowels : " + countVow(s));
        System.out.println("Consonanats : " + countCon(s));
        System.out.println("White Spaces : " + countSpace(s));
    }

    public static int countCon(String s) {
        int c1 = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch) && !isVowel(ch)) {
                c1++;
            }
        }
        return c1;
    }

    public static int countVow(String s) {
        int c1 = 0;
        for (char ch : s.toCharArray()) {
            if (isVowel(ch)) {
                c1++;
            }
        }
        return c1;
    }

    public static int countSpace(String s) {
        int c1 = 0;
        for (char ch : s.toCharArray()) {
            if (ch == ' ') {
                c1++;
            }
        }
        return c1;
    }

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'u' || ch == 'o';
    }
}
    */

// find the ascii value of the character

/*public class strings {
    public static void main(String[] args) {
        char ch = 'A';
        System.out.println("ASCII value of " + ch + " is : " + (int) (ch));
    }
}*/

// reverse the string

/*public class strings {
    public static void main(String[] args) {
        String str = "tripti";
        System.out.println("Reversed string : " + reverse(str));

    }

    public static String reverse(String s) {
        String ans = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            ans += s.charAt(i);
        }
        return ans;
    }
}
*/

// Remove spaces from string

/*import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("After removing spaces : " + remove(str));
    }

    public static String remove(String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
    */

// remove all the charcaters except alphabets

// Input: string str = "take12% *&u ^$#forward"
// Output: takeuforward
/*import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("New string : " + remove(str));
    }

    public static String remove(String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
    */

// Remove brackets from an algebraic expression
// a+((b-c)+d)
// New string : a+b-c+d

/*import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("New string : " + removeBrackets(str));
    }

    public static String removeBrackets(String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch != '(' && ch != ')') {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
    */

// Capitalize first and last character of each word of a string
// Input: String str = "take u forward is awesome"
// Output: TakE U ForwarD IS AwesomE

/*import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String arr[] = str.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length) {
                sb.append(" ");
            }
            sb.append(capitalise(arr[i]));
        }
        System.out.println("New string : " + sb.toString());
    }

    public static String capitalise(String str) {
        if (str.length() == 0)
            return str;
        if (str.length() == 1)
            return str.toUpperCase();
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toUpperCase(str.charAt(0)));
        for (int i = 1; i < str.length() - 1; i++) {
            sb.append(str.charAt(i));
        }
        sb.append(Character.toUpperCase(str.charAt(str.length() - 1)));
        return sb.toString();
    }
}
*/

// Characters frequency of characters in a string

// Input: takeuforward
// Output: a2 d1 e1 f1 k1 o1 r2 t1 u1 w1 

/*import java.util.Scanner;
import java.util.TreeMap;

public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        TreeMap<Character, Integer> map = new TreeMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : map.keySet()) {
            System.out.print(ch);
            System.out.print(map.get(ch) + " ");
        }
    }
}
    */

// Sum of numbers in a string

/*import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String num = "";
        int sum = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                num += ch;
            } else {
                sum += Integer.parseInt(num);
                num = "0";
            }
        }
        System.out.println(sum + Integer.parseInt(num));
    }
}
    */

// Find the non-repeating characters of a string

/*import java.util.LinkedHashMap;
import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : map.keySet()) {
            if (map.get(ch) == 1) {
                System.out.print(ch + " ");
            }
        }
    }
}
    */

// concatenate one string to another

/*import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(str.concat(str2));
    }
}
    */

// check anagrams

/*import java.util.Arrays;
import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println("Are " + str1 + " and " + str2 + " anagrams of each other ? " + anagrams(str1, str2));
    }

    public static boolean anagrams(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char ch1[] = s.toCharArray();
        char ch2[] = t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1, ch2);
    }
}
    */

// print all the duplicates int he string

/*import java.util.Scanner;
import java.util.TreeMap;

public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        TreeMap<Character, Integer> map = new TreeMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : map.keySet()) {
            if (map.get(ch) > 1) {
                System.out.println(ch + " - " + map.get(ch));
            }
        }
    }
}
    */

// remove all the duplicates from the string

/*import java.util.Scanner;
import java.util.LinkedHashSet;

public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (char ch : s.toCharArray()) {
            set.add(ch);
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : set) {
            sb.append(ch);
        }
        System.out.println(sb.toString());
    }
}
*/

//maximum occuring character in the string

/*import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        ArrayList<Integer> list = new ArrayList<>(map.values());
        int max = Collections.max(list);
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                System.out.println(entry.getKey());
            }
        }
    }
}
    */

// remove all the characters from first string present int he second string

/*import java.util.Scanner;
import java.util.ArrayList;

public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        ArrayList<Character> l1 = new ArrayList<>();
        ArrayList<Character> l2 = new ArrayList<>();
        for (char ch : s1.toCharArray()) {
            l1.add(ch);
        }
        for (char ch : s2.toCharArray()) {
            l2.add(ch);
        }
        l1.removeAll(l2);
        String ans = "";
        for (char ch : l1) {
            ans += ch;
        }
        System.out.println(ans);
    }
}*/

// sort all the characters in a string
/*import java.util.Arrays;
import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char ch[] = s.toCharArray();
        Arrays.sort(ch);
        String ans = "";
        for (char c : ch) {
            ans += c;
        }
        System.out.println(ans);
    }
}*/

// count the number of words in a given string

/*import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String strArr[] = s.split("\\s+");
        System.out.println(strArr.length);
    }
}*/

// Find the Position of a Substring within a String

/*import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String substr = sc.next();
        if (s.contains(substr)) {
            System.out.println(s.indexOf(substr));
        } else {
            System.out.println("-1");
        }
    }
}
    */

// Change case of each of character in the string

/*import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)) {
                sb.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                sb.append(Character.toUpperCase(ch));
            } else if (Character.isWhitespace(ch)) {
                sb.append(" ");
            }
        }
        System.out.println(sb.toString().trim());
    }
}*/

// find the largest word in a string

/*import java.util.Scanner;

public class strings {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String longestWord = "";
        String strArr[] = s.split("\\s+");
        for (String str : strArr) {
            if (str.length() > longestWord.length()) {
                longestWord = str;
            }
        }
        System.out.println("Longest word : " + longestWord);
    }
}
    */

// find the words with the highest number of repeated letters in string
// input: cameron blue
//output:-1

// input : abcdefghij google microsoft
//output: google

/*import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Collections;

public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashMap<String, Integer> map = new HashMap<>();
        String strArr[] = str.split("\\s+");
        for (String s : strArr) {
            map.put(s, getHighestFrequency(s));
        }
        String result = "-1";
        int maxFreq = 1;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                result = entry.getKey();
            }
        }
        System.out.println(result);

    }

    public static int getHighestFrequency(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        return Collections.max(map.values());
    }
}
    */

// Change every letter with the next lexicographic alphabet

import java.util.*;

public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch == 'z') {
                sb.append("a");
            } else {
                sb.append((char) (ch + 1));
            }
        }
        System.out.println(sb.toString());
    }
}