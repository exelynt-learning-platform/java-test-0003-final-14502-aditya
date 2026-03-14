import java.util.Scanner;

public class Java_Test_0003_Final_14502_Aditya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of Rows:");
        int rows = sc.nextInt();
        int bit=1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {

                System.out.print(bit + " ");
                if(bit==1){
                    bit=0;
                }else{
                    bit=1;
                }
            }
            System.out.println();
        }
    }
}