import java.util.Scanner;

/*
* Problem Description
You are given a string S you have to implement a function to perform basic string compression
* using the counts of repeated characters.

If the 'compressed' string would not become smaller than the original string, your function should
* return the original string.

You can assume the string has only uppercase and lowercase letters (a - z).

time.

Input format
A single line that contains the string S.

Output format
A single line that represents the compressed string as given in the problem.

Sample Input 1
aabccccc

Sample Output 1
a2b1c5

Explanation 1
First 'a' repeats two times then 'b' doesn't repeats then 'c' repeats two times.

Constraints
1 <= length(S) <= 100000
* */
public class CompressedString {
    public static String compress(String s) {
        StringBuilder str = new StringBuilder(s);
        StringBuilder finalStr = new StringBuilder();
        int i=0;
        while(i<str.length()){
            int j =i;
            int count=1;
            while(str.charAt(j)==str.charAt(j+1)){
                count++;
                j++;
            }
            finalStr.append(str.charAt(i));
            finalStr.append(count);
        }
        return finalStr.toString();
    }
    public static void  main (String args []) {
        Scanner sc =  new Scanner(System.in);
        String s = new String();
        s = sc.next();

        int n = s.length();
        String ans = compress(s);
        System.out.print(ans);
    }
}
