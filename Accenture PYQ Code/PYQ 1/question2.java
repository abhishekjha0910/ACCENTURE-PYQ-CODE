import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class question2 {
    public static int sum(int[] arr){
        ArrayList <Integer> even = new ArrayList<>();
        ArrayList <Integer> odd = new ArrayList<>();
        for(int i = 0 ; i<arr.length ; i++){
            if(i % 2 == 0){
                even.add(arr[i]);
            }
            else{
                odd.add(arr[i]);
            }
            
        }
        Collections.sort(even);
        Collections.sort(odd);
        return even.get (even.size () - 2) + odd.get (1);
    }
    public static void main(String[] args) {
        int [] arr = {3,2,1,7,5,4};
        System.out.println(sum(arr));

    }
}
