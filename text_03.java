package jsl.code;


//import java.util.Scanner;

public class text_03 {
    public static int add(int...a){        //不定长参数中a相当于  定义的一个数组a[];
        int s=0;
        for (int i = 0; i <a.length ; i++) {
            s=s+a[i];
        }
        return s;
    }
    public static void main(String[] args) {
//        System.out.println("input mouth");
//        Scanner scanner=new Scanner(System.in);
//        int n=scanner.nextInt();
        System.out.println("result="+add(1,2,2,3,4));

    }

}
