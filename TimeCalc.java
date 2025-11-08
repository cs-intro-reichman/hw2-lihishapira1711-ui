public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutesToAdd = Integer.parseInt(args[1]);
        int totalMinutes = hours * 60 + minutes + minutesToAdd;
        int totalHours = totalMinutes / 60;
        int newHours = totalHours % 24;
        int newMinutes = totalMinutes - (totalHours * 60);
        hours = newHours;
        minutes = newMinutes;
        String minutesStr = (minutes < 10) ? "0" + minutes : String.valueOf(minutes);
        if (hours == 0) {
            hours = 12; // Midnight case
        } else if (hours > 12) {
            hours -= 12; // Convert to 12-hour format
        }
        String hoursStr = (hours < 10) ? "0" + hours : String.valueOf(hours);
		System.out.println(hoursStr + ":" + minutesStr + " ");

      
    }
}
