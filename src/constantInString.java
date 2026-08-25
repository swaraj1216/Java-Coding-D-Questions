public class constantInString {
    public static void main(String args[]){
        String str = "ABCDEFGhijklmnOPQrsTUVwxYz";
        int count = 0;
        for(char c: str.toLowerCase().toCharArray()){
            if(c != ' ' && "aeiou".indexOf(c) == -1){
                count++;
            }
        }
        System.out.println("Constants: "+count);
    }
}