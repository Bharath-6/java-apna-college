import java.util.Scanner;

public class newtonsquestion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of commands
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Read the string of commands
        String commands = scanner.nextLine();

        // Initialize initial position
        int x = 0, y = 0;

        // Process each command
        for (char command : commands.toCharArray()) {
            switch (command) {
                case 'L':
                    x--;
                    break;
                case 'R':
                    x++;
                    break;
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
            }
        }

        // Output the final position
        System.out.println(x + " " + y);

        // Close the scanner
        scanner.close();
    }
}
