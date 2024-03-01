package com.mycomopany.poo;

public class Poo {

    public static void main(String[] args) {
        character homero = new character("homero", "inspector de seguridad",33,"que elegancia la de francia");
        homero.greeting();
       character bart = new character("bartolomeo","vago",10,"ayyy caramba!!!");
       bart.greeting();
        
    }

    static class character {

        String name;
        String occupation;
        int age;
        String phrase;

        public character(String name, String occupation, int age, String phrase) {
            this.name = name;
            this.occupation = occupation;
            this.age = age;
            this.phrase = phrase;
        }
        
        
        
        void greeting() {
           
            System.out.println(this.phrase);
             System.out.println(this.age);
        }
    }
}
