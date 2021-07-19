import java.util.Scanner;

/*
* Problem Description
Write a program that counts the number of occurrences of 2 as a digit in numbers from 0 to n

That is, count the number of 2s as a digit in all numbers from 0 to n.

Input format
First line contains an integer representing the value of N.

Output format
Print a single integer which has the count of 2's.

Sample Input 1
22

Sample Output 1
6

Explanation 1
Total 2s that appear as a digit from 0 to 22 are (2, 12, 20,21, 22);.

Constraints
1 <= N <= 1000000
* */
public class CountOfTwos {
    int countOfTwos(int n) {
        int i=2,count=0;

        while(i<=n){
            int digit = i;
            while(digit>0){
                if(digit%10==2){
                    count++;
                }
                digit = digit/10;
            }
            i++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = new CountOfTwos().countOfTwos(n);
        System.out.println(result);
        scanner.close();
    }
}

