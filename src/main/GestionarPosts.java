import java.util.Scanner;

public class GestionarPosts {
    public static void gestionPost(){
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while (opcion != -1){
            System.out.println("1 - Editar post");
            System.out.println("2 - Nuevo post");
            opcion = sc.nextInt();
            if (opcion == 1){
                //Llamada a método para editar el post
            } else if (opcion == 2) {
                //Llamada a método para crear el post
            }
        }

    }
}
