package Task2;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection connection1 = DatabaseConnection.getInstance();
        DatabaseConnection connection2 = DatabaseConnection.getInstance();

        System.out.println("Are both connections the same? " + (connection1 == connection2));

        connection1.connect();
        connection2.disconnect();
    }
}
