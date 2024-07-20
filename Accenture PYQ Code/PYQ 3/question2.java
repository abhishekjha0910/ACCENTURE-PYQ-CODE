import java.util.Scanner;

public class question2 {
    public static int function(int a , int b , int c){
        if(c == 1){
            return (a+b);
        }
        else if(c == 4){
            return (a/b);
        }
        else if(c == 2){
            return (a - b);
        }
        else if(c == 3){
            return(a *b);
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(function(a, b, c));
    }
}
