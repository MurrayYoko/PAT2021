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
public class SpeciesManager {
    
    private static String fileName = "data//species.txt";

    public static String getAllSpecies() {
        try {
            Scanner sc = new Scanner(new File(fileName));
            String output = "";

            while (sc.hasNextLine()) {
                output += sc.nextLine() + "\n";
            }
            sc.close();
            return output;
        } catch (FileNotFoundException ex) {
            System.out.println("Species file not found.");
            return null;
        }
    }

    public static String[] getAllSpeciesAsArray() {
        try {
            Scanner sc = new Scanner(new File(fileName));
            int numSpecies = getNumSpecies();
            String[] outputArr = new String[numSpecies];
            int currentIndex = 0;
            while (sc.hasNextLine()) {
                outputArr[currentIndex] = sc.nextLine();
                currentIndex++;
            }
            sc.close();
            return outputArr;
        } catch (FileNotFoundException ex) {
            System.out.println("Species file not found.");
            return null;
        }
    }

    private static int getNumSpecies() {
        try {
            Scanner sc = new Scanner(new File(fileName));
            int count = 0;
            while (sc.hasNextLine()) {
                sc.nextLine();
                count++;
            }
            sc.close();
            return count;
        } catch (FileNotFoundException ex) {
            System.out.println("Species file not found.");
            return -1;
        }
    }

    public static void addSpecies(String Species) {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(fileName, true));
            pw.println(Species);
            pw.close();
        } catch (IOException ex) {
            System.out.println("Could not write to file.");
        }

    }
    public static void deleteSpecies(String species) {
		try {
			Scanner sc = new Scanner(new File(fileName));
			String output = "";
			String fullname = species; 

			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				if (!line.equalsIgnoreCase(fullname)) {
					output += line + "\n";
				}
			}
			sc.close();

			PrintWriter pw = new PrintWriter(new FileWriter(fileName, false));
			pw.print(output);
			pw.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Species file not found");
		} catch (IOException ex) {
			System.out.println("Could not delete Species");
		}
	}
}

