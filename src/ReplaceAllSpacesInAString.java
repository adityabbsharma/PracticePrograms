import java.util.Scanner;

/*
* Problem Description
Given a string S consisting of lowercase alphabets and spaces.
* Write a function to replace all spaces in a string with '%20'.

Input format
A single line that contains a string representing the string S.

Output format
Print a string where spaces are replaced with '%20'.

Sample Input 1
hello world

Sample Output 1
hello%20world

Explanation 1
Space between hello and world is replaced by %20.

Constraints
1 <= length(S) <= 100000
* */
public class ReplaceAllSpacesInAString {
    public static String change(String s) {
        StringBuffer str = new StringBuffer(s);
        StringBuffer finalStr = new StringBuffer();
        for(int i=0;i<str.length();i++){
            if(Character.isWhitespace(str.charAt(i))){
                finalStr.append("%20");
            }
            else{
                finalStr.append(str.charAt(i));
            }
        }
        return finalStr.toString();
    }
    public static void main(String args[]) throws Exception {

        Scanner sc  = new Scanner(System.in);

        String s = new String();
        String ans = new String();
        s = sc.nextLine();
        ans = change(s);
        System.out.print(ans);

    }
}
