package OpenWeaver;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateAndTime08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter date and time (HH-MM-YYYY hh:mm:ss): ");
        String input = scanner.nextLine();
        scanner.close();

        DateFormat inputFormat = new SimpleDateFormat("HH-MM-yyyy hh:mm:ss");
        DateFormat outputFormat = new SimpleDateFormat("HH:mm:ss yyyy-MM-dd");

        try {
            Date date = inputFormat.parse(input);
            String formattedDate = outputFormat.format(date);
            System.out.println("Converted Date/Time: " + formattedDate);
        } catch (ParseException e) {
            System.out.println("Invalid input format. Please enter in HH-MM-YYYY hh:mm:ss format.");
        }
    }
}
