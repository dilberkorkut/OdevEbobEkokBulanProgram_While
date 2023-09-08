import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci saayiyi giriniz: ");
        int n1 = input.nextInt();
        System.out.println("Ikinci sayiyi giriniz: ");
        int n2 = input.nextInt();

        int ebob = 1;
        int i = 1;

        while (i<=n1 && i<=n2){
            i++;
            if(n1%i == 0 && n2%i == 0) {
                ebob = i;
            }
        }
        int ekok = (n1*n2) / ebob;
        System.out.println("Ebob Degeri : " +ebob);
        System.out.println("Ekok Degeri: " +ekok);

    }
}