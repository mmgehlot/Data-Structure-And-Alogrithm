package array;

public class SingleNumber {

    static int findSingleNumber(int[] arr){
        int result = 0;
        for(int i=0; i<arr.length; i++){
            result = result ^ arr[i];
        }
        return result;
    }

    public static void main(String args[]){
        int[] arr = {4, 1, 2, 1, 2};
        int result = findSingleNumber(arr);
        System.out.println(result);
    }
}
