import java.time.LocalDate; // import the LocalDate class
import java.time.Duration; // import the Duration class
import java.util.ArrayList; // import the ArrayList class

public abstract class Activity {
    String name;
    String location;
    LocalDate date = null;
    Duration duration;
    static Duration totalTime;
    ArrayList<Activity> activities = new ArrayList<Activity>(); // Creates an ArrayList of all activities

    public Activity(String name, String location, LocalDate date, Duration duration) {
        name = this.name;
        location = this.location;
        date = this.date;
        duration = this.duration;

        activities.add(this);

    }

    public Duration getTime() {
        return totalTime;
    }

}