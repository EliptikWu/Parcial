package Parcial3;



import Parcial3.Modelo.Juego;
import Parcial3.Repository.Abs;
import Parcial3.Repository.Int;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class MainJuego {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        String opt = "1";
        Int repo = new Abs();

        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Consola de juegos=  \n 1. Agregar  \n 2. Lista \n 3. Editar " +
                    "\n 4. Eliminar  \n 5. Salir \n =>");
            opt = sc.next();
            switch (opt){
                case "1":
                    System.out.println("Numero de juego: ");
                    int jn = sc.nextInt();
                    System.out.println("Nombre:  ");
                    String nam = sc.next();
                    System.out.println("Categoria:  ");
                    String cat = sc.next();
                    System.out.println("Fecha:   ");
                    String sch = sc.next();
                    System.out.println("Empresa:   ");
                    String emp = sc.next();
                    repo.save(new Juego(jn,nam,cat,sch,emp));
                    break;

                case "2": {
                    List<Juego> juegos = repo.findAll();
                    juegos.forEach(System.out::println);
                    break;
                }

                case "3": {
                    System.out.println("===== Editar =====");
                    System.out.println("Ponga el numero del juego: ");
                    Integer jpp = sc.nextInt();
                    System.out.println("Ponga el nombre:  ");
                    nam = sc.next();
                    System.out.println("Ponga la categoria:  ");
                    cat = sc.next();
                    System.out.println("Fecha:   ");
                    sch = sc.next();
                    System.out.println("Empresa:   ");
                    emp = sc.next();
                    Juego upd = new Juego(jpp,nam,cat,sch,emp);
                    repo.update(upd);
                    break;

                }

                case "4": {
                    System.out.println("===== Eliminar ======");
                    System.out.print("Ponga el numero del juego: ");
                    int lp = sc.nextInt();
                    repo.delete(repo.findByNum(lp));
                    repo.findAll().forEach(System.out::println);
                    break;
                }

                case "5": {
                    opt = "5";
                    break;
                }

            }
        }while (opt != "5");
    }
}