import java.util.Scanner;

class question1{

    public static int distinction(int m , int n ){
        int sumdivisible = 0 ;
        int sumnotdivisible = 0 ;
        for(int i = 0 ; i<=n ; i++){
            if(i % m != 0){
                sumnotdivisible += i;
            }
            else{
                sumdivisible += i;
            }
        }
        int dis = sumnotdivisible - sumdivisible;
        return dis;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n which is the range of the number :- ");
        int n = sc.nextInt();
        System.out.print("Enter the value of m which is the number by which we have to find the distinction :- ");
        int m = sc.nextInt();
        System.out.println(distinction(m, n));
    }
}