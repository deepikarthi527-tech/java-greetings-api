import java.util.*;

public class greetings {
    public static void main(String[] args) {
        greetings.greet();
    }

    public static void greet() {
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY); // 0 - 23

        String message;

        if (hour >= 5 && hour < 12) {
            message = "Good Morning!";
        } else if (hour >= 12 && hour < 17) {
            message = "Good Afternoon!";
        } else if (hour >= 17 && hour < 21) {
            message = "Good Evening!";
        } else {
            message = "Good Night!";
        }

        System.out.println(message);
        System.out.println("Current time: " + calendar.getTime());
    }
}