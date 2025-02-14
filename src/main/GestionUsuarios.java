import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class GestionUsuarios {
    public static void gestionUsuario() throws SQLException {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while (opcion != -1){
            System.out.println("1 - Logearse");
            System.out.println("2 - Nuevo usuario");
            opcion = sc.nextInt();
            if (opcion == 1){
                boolean logeado = logearse();
                if (logeado){
                    break;
                }
            } else if (opcion == 2){
                //Llamada al método para crear el usuario
            }
        }

    }

    public static boolean logearse() throws SQLException {

        //En primer lugar crearemos la conexión con la base de datos
        java.sql.Connection conexion = Main.connection;


        //Almaceno los datos introducidos por el usuario en una variable
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el nombre");
        String nombre = sc.nextLine();

        System.out.println("Introduzca la contraseña");
        String contraseña = sc.nextLine();


        //Hacemos la consulta a todos los campos de la tabla Usuarios y coja los que son iguales a las variables almacenadas
        PreparedStatement estado = conexion.prepareStatement("SELECT * FROM usuarios WHERE nombre = = AND contrasenya = ?");

        //Ahora le daremos un valor a cada uno de los ? que hemos puesto antes
        estado.setString(1, nombre);
        estado.setString(2, contraseña);
        ResultSet resultado = estado.executeQuery();
        return resultado.next();

    }
}
