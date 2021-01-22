package controller;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Ejercicio 1
        //firstNNaturalNumber();
        //Ejercicio 2
        //multiplesNNumber();
        //Ejercicio 3
        //primeNumber();
        //Ejercicio 4
        //firstNPrimeNumber();
        //Ejercicio 5
        //ejercicio5();
    }

    private static void firstNNaturalNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero n para ver los primeros n numeros pares:");
        int n = sc.nextInt();
        sc.close();
        for (int i = 0; i<=n ; i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }
    }
    private static void multiplesNNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero n:");
        int n = sc.nextInt();
        System.out.println("Ingrese un numero m:");
        int m = sc.nextInt();
        sc.close();
        int numbersFound = 0;
        int i = 1;
        while(i <= m && numbersFound < n){
            if(m%i == 0){
                numbersFound++;
                System.out.println(i);
            }
            i++;
        }
    }
    private static void primeNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero para saber si es primo:");
        int n = sc.nextInt();
        sc.close();

            if (isPrime(n)) {
                System.out.println(n + " es primo");
            } else {
                System.out.println(n + " no es primo");
            }
    }

    private static void firstNPrimeNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero n para saber los primeros n numeros primos:");
        int n = sc.nextInt();
        sc.close();
        int i = 2;
        int primeFound = 0;
        while(primeFound < n){

            if(isPrime(i)){
                primeFound++;
                System.out.println(i);
            }
            i++;
        }
    }

    private static boolean isPrime(int n) {
        if (n > 1) {
            int i = 1;
            while (i <= n) {
                if (n % i == 0 && i != 1 && i != n) {
                    return false;
                }
                i++;
            }
            return true;
        } else {
            System.out.println("Debe ser un numero mayor a 1");
            return false;
        }
    }

    private static void ejercicio5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero n:");
        int n = sc.nextInt();
        System.out.println("Ingrese un numero m:");
        int m = sc.nextInt();
        System.out.println("Ingrese un numero d:");
        int d = sc.nextInt();
        sc.close();

        int ocurrence = 0;
        int number = 1;
        while(ocurrence < n){
            if(isValid(number, d, m)){
                System.out.println(number);
                ocurrence++;
            }
            number++;
        }
    }

    private static boolean isValid(int number, int d, int m) {
        String s = Integer.toString(number);

        char searchedNumber = (char) (d + '0');
        return charCount(s, searchedNumber) >= m;
    }

    private static int charCount(String s, char c){
        int count = 0;
        for (int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == c){
                count++;
            }
        }
        return count;
    }
}
