package lecture02;

import java.util.Scanner;

public class passward {


    String[][] prf1 = {
            {"B200100","qwer"}
    };
    String[][] prf2 = {
            {"B200200","asdf"}
    };
    String[][] prf3 ={
            {"B200300","zxcv"}
    };
    String[][] prf4 ={
            {"B200400","uiop"}
    };
    String[][] prf5 ={
            {"B200500","hjkl"}
    };

    void rion(){
        Scanner scan = new Scanner(System.in);
        System.out.println("学籍番号を入力してください：");
        String gakuseki = scan.next();

        if (gakuseki.equals(prf1[0][0]) || gakuseki.equals(prf2[0][0]) || gakuseki.equals(prf3[0][0]) || gakuseki.equals(prf5[0][0]) || gakuseki.equals(prf4[0][0])) {
            System.out.println("complete!!");
            System.out.println("パスワードを入力してください:");
            String pass = scan.next();
           if(gakuseki.equals(prf1[0][0]) && pass.equals(prf1[0][1])) {
               System.out.println("ログイン完了");
           } else if (gakuseki.equals(prf2[0][0]) && pass.equals(prf2[0][1])) {
               System.out.println("ログイン完了");
           } else if (gakuseki.equals(prf3[0][0]) && pass.equals(prf3[0][1])) {
               System.out.println("ログイン完了");
           } else if (gakuseki.equals(prf4[0][0]) && pass.equals(prf4[0][1])) {
               System.out.println("ログイン完了");
           } else if (gakuseki.equals(prf5[0][0]) && pass.equals(prf5[0][1])) {
               System.out.println("ログイン完了");
           }else{
               System.out.println("不正なアクセス");
           }
           } else {
            System.out.println("error!!");
        }

    }
}
