public class isPrime {
    public static void main(String[] args) {
        int num = 17;
        boolean result = true;
        for(int i = 2; i<num; i++){
            if(num % i == 0){
                result = false;
                break;
            }
        }
        System.out.println(result ? "Prime" : "Not Prime");
    }
}