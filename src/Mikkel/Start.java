package Mikkel;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        //Scanner object
        Scanner scanner = new Scanner(System.in);

        //Beder brugeren indtaste et tal
        System.out.println("Skriv et helt tal: ");

        // Deklarerer integer "heltTal" ved indtastning fra brugeren
        int heltTal = scanner.nextInt();

        // "Hvis det indtastede tal kan divideres med 5, bliver printet HiFive"
        if (heltTal % 5 == 0){
            System.out.println("HiFive");
        }
        //"Hvis det indtastede tal kan divideres med 2, bliver der printet HiEven"
        if (heltTal % 2 == 0){
            System.out.println("HiEven");
        }
        // Hvis tallet hverken går op med 2 eller 5, printes der HiNothing
        if (heltTal % 5 != 0 && heltTal % 2 != 0) {

            System.out.println("HiNothing");
        }



        }
    }

