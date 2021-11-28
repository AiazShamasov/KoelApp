package javaPractice;

public class Palindrome {
    public static void main(String[] args) {

        String original = "m55om6mom";
        String reverse = "";

        for(int i=original.length() -1; i>=0; i--){
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
    }
}
