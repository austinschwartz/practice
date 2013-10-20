import java.util.*;

public class Clock {

    public static double timeToAngle(int h, int m) {
        double hourAngle = .5 * ((60 * h) + m);
        double minuteAngle = 6 * m;
        return Math.abs(hourAngle - minuteAngle);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext() == true) {
            int h = in.nextInt();
            int m = in.nextInt();
            double angle = timeToAngle(h, m);
            System.out.println(angle);
        }
    }
}
