//package javaPractice;
//
//public class Palindrome5 {
//    public static void main(String[] args) {
//        String str = "mom";
//
//        char reverse = '0';
//        if (isPalindrome(str,reverse))
//            System.out.println("Palindrome");
//        else
//            System.out.println("Not a Palindrome");
//    }
//
//    static boolean isPalindrome(String str, char reverse){
//        for(int i = str.length() -1; i >=0; i--){
//            reverse = str.charAt(i);
//        }
//
//        boolean palindrome = true;
//        for(int i = 0; i < str.length(); i++){
//            if (str.charAt(i) != reverse) {
//                return false;
//            } else {
//                return true;
//            }
//        }
//    }
//}
//
