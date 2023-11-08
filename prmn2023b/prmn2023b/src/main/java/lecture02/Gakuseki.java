package lecture02;

import java.util.Scanner;

public class Gakuseki {

    public void aiueo(){
        String number = "B2001000";

        Scanner scan = new Scanner(System.in);
        System.out.println("学籍番号を入力してください：");
        String gakuseki = scan.next();

        if (number.equals(gakuseki)) {
            System.out.println("complete!!");
        } else {
            System.out.println("error!!");
        }
    }
}
