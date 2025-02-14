import java.util.Scanner;

public class GestionComentarios {
    public static void gestionComentario(){
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while (opcion != -1){
            System.out.println("1 - Editar comentario");
            System.out.println("2 - Nuevo comentario");
            opcion = sc.nextInt();
            if (opcion == 1){
                //Llamada a método para editar el comentario
            } else if (opcion == 2){
                //Llamada a método para crear el comentario
            }
        }

    }
}
