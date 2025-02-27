package NetworkBBDD;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    static java.sql.Connection connection;
    static String usuario = "";
    static int id_usuario = -1;

    public static java.sql.Connection getConnection() {

        String host = "jdbc:sqlite:src/main/resources/network.sqlite";
        if (connection == null) {
            try {
                connection = java.sql.DriverManager.getConnection(host);
            }catch (Exception sql){
                System.out.println(sql.getMessage());
                System.exit(0);
            }
        }
        return connection;
    }


    public static void main(String[] args) throws SQLException {

        connection = getConnection();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != -1) {
            if (!usuario.isEmpty()) {
                System.out.println(usuario + " | ");
            }

            System.out.println("1 - Usuarios | ");
            System.out.println("2 - Posts | ");
            System.out.println("3 - Comentarios | ");
            System.out.print("-1 - Salir ");

            opcion = scanner.nextInt();

            if (opcion == 1) {

                /*Aquí se pone lo que tiene que mostrar o hacer en caso de elegir Usuarios*/

            }else if (opcion == 2) {

                /*Aquí se pone lo que tiene que mostrar o hacer en caso de elegir Posts*/

            } else if (opcion == 3) {

                /*Aquí se pone lo que tiene que mostrar o hacer en caso de elegir Comentarios*/

            }
        }
    }
}
