import java.util.Scanner;

public class rec_us {

    static int us (int n, int k) {
        if (k==0)
            return 1;

        else
            return n * us (n, k-1);


    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Üssünü almak istediğiniz sayıyı giriniz: ");
        int n = input.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int k = input.nextInt();
        System.out.print(us(n,k));
    }

}
