package biblioteca;
import  library.library;
import  java.util.Scanner;
public class Biblioteca {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("cuantos libros agregar");
        int num = sc.nextInt();
        int c=0;
        library[] libro = new library[num];
        while(c<num){
        System.out.println("de el nombre del libro");
        sc.nextLine();
        String  name = sc.nextLine();
            System.out.println("la cantidad de libros en stock");
        int  ammount = sc.nextInt();
            System.out.println("id del libro");
        int id = sc.nextInt();
            System.out.println("el genero del libro");
        sc.nextLine();
        String genre = sc.nextLine();
        library book = new library(name, ammount,id,genre);
        libro[c] = book;
        c=c+1;
        }
        int v=0;
        System.out.println();
        int a = libro[v].getAmmount();
          
        System.out.println(libro[0].getAmmount());
    }
  
}
