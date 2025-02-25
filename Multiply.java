import java.util.Scanner;
public class Multiply {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = input.nextInt();
        int res;
        for(int i=0;i<10;i++){
            res = i*num;
            System.out.println(num+"*"+i+"="+res); 
        }
    }
}

