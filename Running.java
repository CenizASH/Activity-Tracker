import java.time.LocalDate; // import the LocalDate class
import java.time.Duration; // import the Duration class
import java.util.ArrayList; // import the ArrayList class

public class Running extends Activity {

    private int distance;
    private int elevation;
    private Duration runningTime;
    ArrayList<Running> Runnings = new ArrayList<Running>(); // Creates an ArrayList of all Running activities

    public Running(String name, String location, LocalDate date, Duration duration, int distance, int elevation) {

        super(name, location, date, duration);
        distance = this.distance;
        elevation = this.elevation;
        totalTime = totalTime.plus(duration);
        runningTime = runningTime.plus(duration);

        activities.add(this);
        Runnings.add(this);

    }

    public Duration runningTime() {
        return runningTime;
    }

    public String toString() {
        return "Adding activity: " + this.date + "\n" + "Running: " + this.name + " at " + this.location + "\n"
                + "duration: " + this.duration + ";" + "\n"
                + "distance: " + this.distance + "km;" + "\n"
                + "elev: " + this.elevation + "m;" + "\n";
    }

}