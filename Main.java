import java.io.*;
import java.util.Scanner; // Import the Scanner class
import java.io.File; // Import the File class
import java.time.LocalDate; // import the LocalDate class
import java.time.Duration; // import the Duration class

public class Main {

    final static String welcomeMsg = "Welcome to the COMP 2150 Activity Tracker.";
    final static String fileMsg = "Please enter the name of the file with your activities: ";

    public static void main(String[] args) {

        System.out.println(welcomeMsg + "\n" + fileMsg);

        Scanner scanner = new Scanner(System.in);
        final String fileName = scanner.nextLine(); // Reads file name
        scanner.close();

        System.out.println("Going to read [" + fileName + "].");

        try {
            File inputFile = new File(fileName);
            Scanner fileReader = new Scanner(inputFile);

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] lineArr = line.split(" ", 7);

                if (lineArr[0].equals("QUIT")) {
                    break;
                } /*
                   * else if (lineArr[0].equals("QUERY")) {
                   * Query(lineArr[1]);
                   * } else if (lineArr[0].equals("CYCLING")) {
                   * Cycling tempCycling = new Cycling(lineArr[1], lineArr[2],
                   * LocalDate.parse(lineArr[3]),
                   * Duration.parse(lineArr[4]),
                   * Integer.parseInt(lineArr[5]), Integer.parseInt(lineArr[6]));
                   * } else if (lineArr[0].equals("WALKING")) {
                   * Walking tempWalking = new Walking(lineArr[1], lineArr[2],
                   * LocalDate.parse(lineArr[3]),
                   * Duration.parse(lineArr[4]),
                   * Integer.parseInt(lineArr[5]), Integer.parseInt(lineArr[6]));
                   * } else if (lineArr[0].equals("RUNNING")) {
                   * Running tempRunning = new Running(lineArr[1], lineArr[2],
                   * LocalDate.parse(lineArr[3]),
                   * Duration.parse(lineArr[4]),
                   * Integer.parseInt(lineArr[5]), Integer.parseInt(lineArr[6]));
                   * } else if (lineArr[0].equals("SWIMMING")) {
                   * Swimming tempSwimming = new Swimming(lineArr[1], lineArr[2],
                   * LocalDate.parse(lineArr[3]),
                   * Duration.parse(lineArr[4]),
                   * Integer.parseInt(lineArr[5]), Integer.parseInt(lineArr[6]));
                   * }
                   */

            }
            fileReader.close();
        } catch (

        IOException e) {
            System.out.println("An error occurred...FILE NOT FOUND!");
            e.toString();
        }

    }

    public static void Query(String value) {

        if (value.equals("TOTAL_TIME")) {
            System.out.println(">>> Querying total activity time: " + ">>> " + Activity.totalTime + ".\n");

            for (int i = 0; i < Cycling.Cyclings.size(); i++) {
                System.out.println(Cycling.Cyclings.get(i));
            }

        } else if (value.equals("ACTIVITY")) {

        }

    }

}