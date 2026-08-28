public class isPalindrome {
    public static void main(String[] args){
        String str = "Nitin";
        String rev = "";
        for(int i= str.length()-1; i>=0; i--){
            rev += str.charAt(i);
        }
        String answer = str.equals(rev) ? "Palindrome" : "Not Palindrome"; //case-sensitive
        String answer2 = str.equalsIgnoreCase(rev) ? "Palindrome" : "Not Palindrome";//case-insensitive
        System.out.println(answer);
        System.out.println(answer2);
    }
}