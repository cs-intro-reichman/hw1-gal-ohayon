public class TimeFormat {
    public static void main(String[] args) {
        String[] parts = args[0].split(":");// מחלק את המחזרוזת ל2 חלקים (שעות ודקות)
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);

        String period;
        if (hour < 12) {
            period = "AM";
        } else {
            period = "PM";
        }

        if (hour > 12) {
            hour -= 12;
        }

        if (hour == 24 || hour == 0) {
            hour = 0;
            period = "AM";
        }

        
        System.out.printf("%d:%02d %s%n", hour, minute, period);
    }
}
