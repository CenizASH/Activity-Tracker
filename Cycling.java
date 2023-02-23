import java.time.LocalDate; // import the LocalDate class
import java.time.Duration; // import the Duration class
import java.util.ArrayList; // import the ArrayList class

public class Cycling extends Activity {

    private int distance;
    private int elevation;
    private Duration cyclingTime;
    static ArrayList<Cycling> Cyclings = new ArrayList<Cycling>(); // Creates an ArrayList of all Cycling activities

    public Cycling(String name, String location, LocalDate date, Duration duration, int distance, int elevation) {

        super(name, location, date, duration);
        distance = this.distance;
        elevation = this.elevation;
        totalTime = totalTime.plus(this.duration);
        cyclingTime = cyclingTime.plus(this.duration);

        activities.add(this);
        Cyclings.add(this);

    }

    public Duration cyclingTime() {
        return cyclingTime;
    }

    public String toString() {
        return "Adding activity: " + this.date + "\n" + "Cycling: " + this.name + " at " + this.location + "\n"
                + "duration: " + this.duration + ";" + "\n"
                + "distance: " + this.distance + "km;" + "\n"
                + "elev: " + this.elevation + "m;" + "\n";
    }

}