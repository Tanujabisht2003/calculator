import java.util.Scanner;

public class ReadInput {

    public static String read(){
// scanner takes the input from the command line(user)
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input expression (for eg: 4*3/2)");

        String inputLine = scanner.nextLine();
        //expression written by user is sent back to input line

        scanner.close();
        return inputLine;
    }
}
