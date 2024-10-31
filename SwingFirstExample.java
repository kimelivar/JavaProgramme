import java.util.Scanner;

public class SwingFirstExample {

    public static void main(String[] args) {
        // Crear un escáner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar nombre de usuario
        System.out.print("User: ");
        String username = scanner.nextLine();

        // Solicitar contraseña
        System.out.print("Password: ");
        String password = scanner.nextLine();

        // Procesar la información (por ejemplo, puedes agregar lógica de validación)
        System.out.println("Login successful for user: " + username);
        
        // Cerrar el escáner
        scanner.close();
    }
}
