import models.Prime;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        System.out.print("Enter number need check:");

        double number = sc.nextDouble();

        Prime prime = new Prime(number);

        boolean isPrime = prime.isPrime(prime);

        if(isPrime){
            System.out.println(String.format("%f is prime",number));
        }else {
            System.out.println(String.format("%f is not prime",number));
        }

    }
}
