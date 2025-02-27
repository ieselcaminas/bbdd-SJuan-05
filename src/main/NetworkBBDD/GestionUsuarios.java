package NetworkBBDD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class GestionUsuarios {

    public static void gestionMenu() throws SQLException {

        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        String usuario;

        while (opcion != -1) {
            System.out.println(" 1 - Login | ");
            System.out.println(" 2 - Nuevo Usuario | ");
            System.out.println(" 3 - Salir | ");

            opcion = scanner.nextInt();

            if (opcion == 1) {

                //Logearse

            } else if (opcion == 2) {

                //Crear Usuario

            } else if (opcion == 3) {

                //Salir

            }
        }
    }

    public static String existeUsuario() throws SQLException {

        Connection conexion = Main.connection;
        Scanner scanner = new Scanner(System.in);
        String usuario;
        String contraseña;

        System.out.println("Ingrese su usuario: ");
        usuario = scanner.nextLine();

        System.out.println("Introduzca la contraseña: ");
        contraseña = scanner.nextLine();


        PreparedStatement consultaSQL = conexion.prepareStatement("SELECT * FROM usuarios WHERE usuario = ? AND contraseña = ?");
        consultaSQL.setString(1, usuario);
        consultaSQL.setString(2, contraseña);
        ResultSet resultado = consultaSQL.executeQuery();
        if (resultado.next()){
            Main.id_usuario = resultado.getInt(1);
            Main.usuario = resultado.getString(2);
        }

        return "";
    }

    public static String insertarUsuario() throws SQLException {
        Connection conexion = Main.connection;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese su apellido: ");
        String apellido = scanner.nextLine();

        System.out.println("Ingrese su contraseña: ");
        String contraseña = scanner.nextLine();

        PreparedStatement consultaSQL2 = conexion.prepareStatement("INSERT INTO usuarios (nombre, apellidos, contraseña) VALUES (?, ?, ?)");
        consultaSQL2.setString(1, nombre);
        consultaSQL2.setString(2, apellido);
        consultaSQL2.setString(3, contraseña);

        consultaSQL2.executeUpdate();
        return "";
    }





}
