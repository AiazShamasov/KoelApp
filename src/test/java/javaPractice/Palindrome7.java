package javaPractice;

public class Palindrome7 {

    static boolean isPalindrome (String str){
        str = str.replace(" ", "");
        int i = 0;
        int j = str.length() -1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "nurses run";

        if (isPalindrome(str))
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}
