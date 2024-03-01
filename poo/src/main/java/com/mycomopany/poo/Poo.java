package com.mycomopany.poo;
import characters.Character;
public class Poo {

    public static void main(String[] args) {
        Character homero = new Character("homero", "inspector de seguridad",33,"que elegancia la de francia");
        homero.greeting();
        System.out.println(homero.getAge());
        Character bart = new Character();
        bart.setPhrase("ayy caramba!!!");
        bart.greeting();
        
        
    }
}
