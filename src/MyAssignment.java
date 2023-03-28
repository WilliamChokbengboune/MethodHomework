import java.util.Scanner;

/**
 * Class: MyAssignment
 * Author: William Chokbengboune
 * Date: 3/26/23
 * Version: 1.0
 * Description:
 */

public class MyAssignment {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        MyAssignment grade = new MyAssignment();

    }

    public int luckySum(int a, int b, int c){
        if (a == 13){
            return 0;
        }
        else if(b == 13){
            return 0;
        }
        else if(c == 13){
            return 0;
        }
        else{
            return a + b + c;
        }
    }

    public boolean hasPalindrome(String word){
        word = word.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        for (int i = 0; i < word.length(); i++){
            int left = i -1;
            int right = i + 1;
            while (left >= 0 && right < word.length() && word.charAt(left)==word.charAt(right)){
                return true;
            }
            left = i;
            right = i + 1;
            while (left >= 0 && right < word.length() && word.charAt(left)==word.charAt(right)){
                return true;
            }
        }
        return false;
    }

    public String missingFront(String word) {
        return word.substring(3);
    }

    public int fib(int n){
        if (n < 0) {
            throw new IllegalArgumentException("Input must be non-negative.");
        }
        else if(n == 0){
            return 0;
        }
        else if (n == 1){
            return 1;
        }
        else{
            int a = 0;
            int b = 1;
            for (int i = 2; i <= n; i++){
                int c = a + b;
                a = b;
                b = c;
            }
            return b;
        }
    }

    public String letter(String word){
        String result = "";
        for (int i = 0; i < word.length(); i += 2){//
            result += word.charAt(i);//records the characters at the points
        }
        return result;
    }

    public String nonStart(String a, String b){
        if (a.length() < 2 || b.length() < 2){
            return "";
        }
        else {
            return a.substring(1) + b.substring(1);
        }
    }

    public boolean powerTwo(int n){
        if (n == 0){//This makes sure 0 is no option
            return false;
        }
        else{
            do{
                if (n == 1){
                    return true;
                }
                else if(n % 2 != 0){
                    return false;
                }
                n /= 2;
            }while (true);
        }
    }

    public String end(String swap){
        if (swap.length() == 0){
            return swap;
        }
        else{
            char first = swap.charAt(0);//this takes the first character
            char last = swap.charAt(swap.length()-1);//this takes the last letter
            return last + swap.substring(1,swap.length()-1) + first;
        }
    }

    public int digit(int n){
        if (n==0){
            return 0;
        }
        else{
            int sum = 0;
            while (n > 0){
                sum += n % 10;
                n /= 10;
            }
            return sum;
        }
    }

    public String birthday(String name){
        return "Happy Birthday " + name + "!";
    }

    public String reverseChar(String word){
        String holder = "";
        for (int i = word.length()-1; i >= 0; i--){
            holder += word.charAt(i) + "" + word.charAt(i);
        }
        return holder;
    }
}
