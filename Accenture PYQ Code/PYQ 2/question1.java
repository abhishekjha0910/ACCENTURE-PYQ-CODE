
public class question1 {
    public static int lcm(int a , int b){
        int max = Math.max(a, b);
        while(true){
            if(max % a == 0 && max % b == 0){
                
                break;
            }
            max = max+1;
        }
        return max;
    }
    public static void main(String[] args) {
        int a = 1;
        int b = 11;
        System.out.println(lcm(a, b));
    }
}
