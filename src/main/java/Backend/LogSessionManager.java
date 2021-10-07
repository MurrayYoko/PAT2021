/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Murrayy
 */
public class LogSessionManager {

    private static String fileName = "data//Session.txt";

    //Saves information to Session.txt
    public static void logSession(String userName, String date, String location, String targetSpecies, String baitUsed, String weather, String timeSpent, String timeOfArrival, String amountFish, String speciesCaught) {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(fileName, true));
            pw.println(userName + "#" + date + "#" + location + "#" + targetSpecies + "#" + baitUsed + "#" + weather + "#" + timeSpent + "#" + timeOfArrival + "#" + amountFish + "#" + speciesCaught);
            pw.close();
        } catch (IOException ex) {
            System.out.println("Could not write to file");
        }
    }

    //Gets all sessions in a multilined string
    public static String getAllSessions() {
        //read these in the same order as they were saved
        try {
            Scanner sc = new Scanner(new File(fileName));
            String output = "";

            while (sc.hasNextLine()) {

                //get line into string
                //new scanner on line (use # delimeter)
                //get each data point
                String line = sc.nextLine();
                Scanner linesc = new Scanner(line).useDelimiter("#");

                /**
                 * This returns the first token (we ignore the next token (which
                 * is the "type" of assessment.
                 */
                String userName = linesc.next();
                String date = linesc.next();
                String location = linesc.next();
                String targetSpecies = linesc.next();
                String baitUsed = linesc.next();
                String weather = linesc.next();
                String timeSpent = linesc.next();
                String timeOfArrival = linesc.next();
                String amountFish = linesc.next();
                String speciesCaught = linesc.next();

                output += "Date: " + date + " Location: " + location + " Bait used: " + baitUsed + " Amount of fish caught: " + amountFish + "\n";
                //numFish += Integer.parseInt(amountFish);
                linesc.close();

            }
            sc.close();
            return output;
        } catch (FileNotFoundException ex) {
            System.out.println("Session file not found.");
            return null;
        }
    }

    //Gets the total number of fish caught throughout all logged sessions.
    public static int getNumFish() {
        //read these in the same order as they were saved
        try {
            Scanner sc = new Scanner(new File(fileName));
            int numFish = 0;

            while (sc.hasNextLine()) {

                //get line into string
                //new scanner on line (use # delimeter)
                //get each data point
                String line = sc.nextLine();
                Scanner linesc = new Scanner(line).useDelimiter("#");

                /**
                 * This returns the first token (we ignore the next token (which
                 * is the "type" of assessment.
                 */
                String userName = linesc.next();
                String date = linesc.next();
                String location = linesc.next();
                String targetSpecies = linesc.next();
                String baitUsed = linesc.next();
                String weather = linesc.next();
                String timeSpent = linesc.next();
                String timeOfArrival = linesc.next();
                String amountFish = linesc.next();
                String speciesCaught = linesc.next();

                numFish += Integer.parseInt(amountFish);
                linesc.close();

            }
            sc.close();
            return numFish;
        } catch (FileNotFoundException ex) {
            System.out.println("File not found.");
        }
        return 0;
    }

    //Gets the total number of hours spent from all logged sessions.
    public static int getNumHours() {
        //read these in the same order as they were saved
        try {
            Scanner sc = new Scanner(new File(fileName));
            int numHours = 0;

            while (sc.hasNextLine()) {

                //get line into string
                //new scanner on line (use # delimeter)
                //get each data point
                String line = sc.nextLine();
                Scanner linesc = new Scanner(line).useDelimiter("#");

                /**
                 * This returns the first token (we ignore the next token (which
                 * is the "type" of assessment.
                 */
                String userName = linesc.next();
                String date = linesc.next();
                String location = linesc.next();
                String targetSpecies = linesc.next();
                String baitUsed = linesc.next();
                String weather = linesc.next();
                String timeSpent = linesc.next();
                String timeOfArrival = linesc.next();
                String amountFish = linesc.next();
                String speciesCaught = linesc.next();

                numHours += Integer.parseInt(timeSpent);
                linesc.close();

            }
            sc.close();
            return numHours;
        } catch (FileNotFoundException ex) {
            System.out.println("File not found.");
        }
        return 0;
    }

    //Gets the total number of sessions logged.
    public static int getNumSessions() {
        //read these in the same order as they were saved
        try {
            Scanner sc = new Scanner(new File(fileName));
            int numsessions = 0;

            while (sc.hasNextLine()) {

                //get line into string
                //new scanner on line (use # delimeter)
                //get each data point
                String line = sc.nextLine();
                Scanner linesc = new Scanner(line).useDelimiter("#");

                /**
                 * This returns the first token (we ignore the next token (which
                 * is the "type" of assessment.
                 */
                String userName = linesc.next();
                String date = linesc.next();
                String location = linesc.next();
                String targetSpecies = linesc.next();
                String baitUsed = linesc.next();
                String weather = linesc.next();
                String timeSpent = linesc.next();
                String timeOfArrival = linesc.next();
                String amountFish = linesc.next();
                String speciesCaught = linesc.next();

                numsessions += 1;
                linesc.close();

            }
            sc.close();
            return numsessions;
        } catch (FileNotFoundException ex) {
            System.out.println("File not found.");
            return 0;
        }
    }
}
