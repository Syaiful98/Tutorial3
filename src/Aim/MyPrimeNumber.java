package Aim;

import java.util.Scanner;
public class MyPrimeNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Input x:");
        int x = scan.nextInt();

    Thread t1= new Thread(()->primeNumber(x,x+5));
    Thread t2= new Thread(()->primeNumber(x+5,x+10));
    t1.start();
    t2.start();

    }
    public static void primeNumber(int x, int y){
        int total;
        for(int i=x;i<=y;i++){
            isPrimeNumber(i);
        }

    }
    static int isPrimeNumber(int n){
        int i,m=0,flag=0;
        m=n/2;
        if(n==0||n==1){

        }else
            for (i=2;i<=m;i++){
                if (n%i==0){
                    flag=1;
                    break;
                }
            }

    if(flag==0){
        System.out.println(Thread.currentThread().getName()+" "+n);
    }
       return n;
    }
}
