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

    public static void logSession(String date, String userName, String targetSpecies, String location, String baitUsed, String timeSpent, String timeOfArrival, String amountFish, String speciesCaught) {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(fileName, true));
            pw.println(date + "#" + userName + "#" + targetSpecies + "#" + location + "#" + baitUsed + "#" + timeSpent + "#" + timeOfArrival + "#" + amountFish + "#" + speciesCaught);
            pw.close();
        } catch (IOException ex) {
            System.out.println("Could not write to file");
        }
    }

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
                String  date = linesc.next();
                String  userName = linesc.next();
                String  targetSpecies = linesc.next();
                String  location = linesc.next();
                String  baitUsed = linesc.next();
                String  timeSpent = linesc.next();
                String  amountFish = linesc.next();
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
    public static String getAllFish() {
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
                String  date = linesc.next();
                String  userName = linesc.next();
                String  targetSpecies = linesc.next();
                String  location = linesc.next();
                String  baitUsed = linesc.next();
                String  timeSpent = linesc.next();
                String  amountFish = linesc.next();
                String speciesCaught = linesc.next();

                numFish += Integer.parseInt(amountFish);
                linesc.close();

            }
            sc.close();
            return numFish;
        } catch (FileNotFoundException ex) {
            System.out.println("File not found.");
        }
        return -1;
    }
    
    public static int getAllHours() {
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
                String  date = linesc.next();
                String  userName = linesc.next();
                String  targetSpecies = linesc.next();
                String  location = linesc.next();
                String  baitUsed = linesc.next();
                String  timeSpent = linesc.next();
                String  amountFish = linesc.next();
                String speciesCaught = linesc.next();

                numHours += Integer.parseInt(timeSpent);
                linesc.close();

            }
            sc.close();
            return numHours;
        } catch (FileNotFoundException ex) {
            System.out.println("File not found.");
        }
        return -1;
    }
    
    public static int getNumSessions() {
        //read these in the same order as they were saved
        try {
            Scanner sc = new Scanner(new File(fileName));
            int output = 0;

            while (sc.hasNextLine()) {
                output = output + 1; 
                //get line into string
                //new scanner on line (use # delimeter)
                //get each data point
                String line = sc.nextLine();
                Scanner linesc = new Scanner(line).useDelimiter("#");

                /**
                 * This returns the first token (we ignore the next token (which
                 * is the "type" of assessment.
                 */
                String  date = linesc.next();
                String  userName = linesc.next();
                String  targetSpecies = linesc.next();
                String  location = linesc.next();
                String  baitUsed = linesc.next();
                String  timeSpent = linesc.next();
                String  amountFish = linesc.next();
                String speciesCaught = linesc.next();

                
                linesc.close();
                
            }
            sc.close();
            return output;
        } catch (FileNotFoundException ex) {
            System.out.println("ile not found.");
            return -1;
        }
    }
}
