public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutesToAdd = Integer.parseInt(args[1]);
        int totalMinutes = hours * 60 + minutes + minutesToAdd;
        int newHours = (totalMinutes / 60) % 24;
        int newMinutes = totalMinutes % 60;
        hours = newHours;
        minutes = newMinutes;
        String minutesStr = (minutes < 10) ? "0" + minutes : String.valueOf(minutes);
        String hoursStr = (hours < 10) ? "0" + hours : String.valueOf(hours);
		System.out.println(hoursStr + ":" + minutesStr + " ");

      
    }
}
