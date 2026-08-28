public class LargestElementArray {
    public static void main(String[] args) {
        int[] arr = {1,22,42,45,-98,107,8934};
        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i<=arr.length-1; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Maximum element in array is: "+max);
        System.out.println("Minimum element in array is: "+min);
    }
}