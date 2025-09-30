import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String fullName = scanner.nextLine().trim().toUpperCase();

        String[] parts = fullName.split(" ");
        String firstName = parts[0];
        String lastName = (parts.length > 1) ? parts[1] : "";

        System.out.print("What date will you be coming (MM/dd/yyyy): ");
        String date = scanner.nextLine().trim();

        System.out.print("How many tickets would you like?: ");
        int quantity = scanner.nextInt();

        if (quantity == 1) {
            System.out.println(quantity + " ticket reserved for " + date +
                    " under " + lastName + ", " + firstName);
        } else {
            System.out.println(quantity + " tickets reserved for " + date +
                    " under " + lastName + ", " + firstName);
        }

        scanner.close();
    }
}
