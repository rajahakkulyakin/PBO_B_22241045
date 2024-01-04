package com.tutorial;

class Hero{
    String nama;

    void display(){
        System.out.println("Nama Hero : " + nama);
    }
}

class HeroTank extends Hero{
    float health;

    void display(){
        System.out.println("Health : " + health);
    }

}
public class Main {
    public static void main(String[] args) {
        Hero hero_1 = new Hero();
        hero_1.nama = "salsa";
        hero_1.display();

        HeroTank hero_2 = new HeroTank();
        hero_2.nama = "susi";
        hero_2.display();

         
    }
}
