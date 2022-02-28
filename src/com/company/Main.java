package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Iniciou do programa do método main.");
        a();
        System.out.println("Finalizou do programa do método main.");
    }
    static void a(){
        System.out.println("Entrou no método a. ");
        b();
        System.out.println("Finalizando o método a. ");
    }
    static void b() {
        System.out.println("Entrou no método b. ");
        for (int i = 0; i <= 4; i++) ;
        System.out.println();
        c();
        System.out.println("Finalizando o método b. ");
    }
    static void c(){
        System.out.println("Entrou no método c. ");
        Thread.dumpStack();
        System.out.println("Finalizando o método c. ");
    }
}
