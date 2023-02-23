import java.time.LocalDate; // import the LocalDate class
import java.time.Duration; // import the Duration class
import java.util.ArrayList; // import the ArrayList class

public class Walking extends Activity {

    private int distance;
    private int elevation;
    private Duration walkingTime;
    ArrayList<Walking> Walkings = new ArrayList<Walking>(); // Creates an ArrayList of all Walking activities

    public Walking(String name, String location, LocalDate date, Duration duration, int distance, int elevation) {

        super(name, location, date, duration);
        distance = this.distance;
        elevation = this.elevation;
        totalTime = totalTime.plus(duration);
        walkingTime = walkingTime.plus(duration);

        activities.add(this);
        Walkings.add(this);

    }

    public Duration walkingTime() {
        return walkingTime;
    }

    public String toString() {
        return "Adding activity: " + this.date + "\n" + "Walking: " + this.name + " at " + this.location + "\n"
                + "duration: " + this.duration + ";" + "\n"
                + "distance: " + this.distance + "km;" + "\n"
                + "elev: " + this.elevation + "m;" + "\n";
    }

}