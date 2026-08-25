public class vowelsInString {
    public static void main(String args []){
        String str = "ABC DE FGhijklmn  OPQrsTUVwxYz";
        int count = 0;
        for(char c: str.toLowerCase().toCharArray()){
            //no. of vowels
            if("aeiou".indexOf(c) != -1){
                count++;
            }
        }
        System.out.println("Vowels: "+count);
    }
}