package lecture02;

import java.util.Scanner;

public class Keisan {
    float[] ix = new float[6];
    public void apple() {


        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
             ix[i] =input.nextFloat();
             ix[0]=ix[0]+ix[i];
        }
        System.out.println("合計:"+ix[0]);
    }

    public  void banana(){
        if(ix[0]<=49){
            System.out.println("small");
        } else if (ix[0]>=50 && ix[0]<100) {
            System.out.println("big");
        }else{
            System.out.println("great!!");
        }
    }
}