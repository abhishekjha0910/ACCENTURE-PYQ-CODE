public class question2 {
    public static int pangram(String str[] , int n){
        int count = 0 ;
        for(int i = 0 ; i<n ; i++){
            for(int j = i+1 ; j<n ; j++){
                if(str[i] == str[j]){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str[] = {"bit","scale"};
        int n = str.length;
        System.out.println(pangram(str, n));
    }
}
