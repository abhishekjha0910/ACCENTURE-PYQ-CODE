public class question1 {
    public static int findlostgem(int[] arr){
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i] == i*i && arr[i] != 0 ){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[] = {0,1,4,9,16,25,35};
        System.out.println(findlostgem(arr));
    }
}
