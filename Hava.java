import java.util.Scanner;
public class Hava {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık : ");
        heat = input.nextInt();

        if (heat <= 5){
            System.out.print("Kayak");
        }
        if (heat > 5 && heat <= 25 ){
            System.out.print("Sinema veya Piknik");
        }
        else if(heat > 25){
            System.out.print("Yüzme");
        }
        /**
         * @auhot Erdem AYDEMİR
         */
    }
}
