package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n = 2;
        while (n > 1){
            if (checkPrime(n)){
                System.out.print(n + " ");
            }
            n++;
            if (n > 100)
                break;
        }
    }
    public static boolean checkPrime(int number){
        boolean check = true;
        for(int i = 2; i < Math.sqrt(number);i++){
            if (number % i == 0) {
                check = false;
                break;
            }
        }return check;
    }
}
