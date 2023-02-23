import java.time.LocalDate; // import the LocalDate class
import java.time.Duration; // import the Duration class
import java.util.ArrayList; // import the ArrayList class

public class Swimming extends Activity {

    private int laps;
    private int lapLength;
    private Duration swimmingTime;
    ArrayList<Swimming> Swimmings = new ArrayList<Swimming>(); // Creates an ArrayList of all Swimming
                                                               // activities

    public Swimming(String name, String location, LocalDate date, Duration duration, int laps, int lapLength) {

        super(name, location, date, duration);
        laps = this.laps;
        lapLength = this.lapLength;
        totalTime = totalTime.plus(duration);
        swimmingTime = swimmingTime.plus(duration);

        activities.add(this);
        Swimmings.add(this);

    }

    public Duration swimmingTime() {
        return swimmingTime;
    }

    public String toString() {
        return "Adding activity: " + this.date + "\n" + "Walking: " + this.name + " at " + this.location + "\n"
                + "duration: " + this.duration + ";" + "\n"
                + "Laps: " + this.laps + " laps;" + "\n"
                + "lap Length: " + this.lapLength + "m;" + "\n";
    }

}