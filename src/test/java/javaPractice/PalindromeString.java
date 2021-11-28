package javaPractice;

public class PalindromeString {
    public static void main(String[] args) {
        String original = "mom";
        String reverse = "";

        for(int i = original.length()-1; i>=0; i--){
            reverse+= original.charAt(i);
        }
        boolean palindrome = true;
        for(int i = 0; i < original.length(); i++){
            if(original.charAt(i) != reverse.charAt(i)){
                palindrome = false;
            }
        }
        if(palindrome){
            System.out.println("PALINDROME!");
        } else {
            System.out.println("Not a palindrome");
        }


//        for(int i = original.length() -1; i >=0; i--) {
//             reverse += original.charAt(i);
//            System.out.println(reverse);
//        public static boolean isPalindrome if (isPalindrome(original)) {
//            System.out.println("Test.Palindrome" + original);
//        } else {
//            System.out.println("Not Test.Palindrome" + original);
//        }
//        (String original, String reverse){
//            for (int i = original.length(); i > 0; i--) {
//                reverse += original.charAt(i);
//                System.out.println(reverse);
//                return true;
//            }
//        }
    }

    }

