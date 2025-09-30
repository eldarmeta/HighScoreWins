import java.util.Scanner;
import java.util.regex.Pattern;

public class highScoreWins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input a score " +
                "(format is Home:Visitor|21:9 ) :");
        String input = scanner.nextLine().toUpperCase().trim();

        String[] parts = input.split(Pattern.quote("|"));
        String teams = parts[0];
        String score = parts[1];

        String[] names = teams.split(Pattern.quote(":"));
        String host = names[0];
        String guest = names[1];

        String[] numbers = score.split(Pattern.quote(":"));
        int scoreHost = Integer.parseInt(numbers[0]);
        int scoreGuest = Integer.parseInt(numbers[1]);

        if (scoreGuest > scoreHost){
            System.out.println("Winner: " + guest);
        }
        else if (scoreGuest < scoreHost){
            System.out.println("Winner: " + host);
        }
        else{
            System.out.println("TIE");
        }

        scanner.close();
    }
}
