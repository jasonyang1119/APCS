public class Time {
    public static void main(String args[]) {
      int hour = 19;
      int minute = 00;
      int second = 00;
      int secondssincemidnight = hour * 3600 + minute * 60 + second;
      int secondsfrommidnight = 86400 - secondssincemidnight;
      double percentageofday = secondssincemidnight / 86400.0 * 100.0;
      System.out.println("It is " + secondssincemidnight + " seconds since midnight");
      System.out.println("It is " + secondsfrommidnight + " seconds from midnight");
      System.out.println(percentageofday + "% of the day has passed");
    }
}