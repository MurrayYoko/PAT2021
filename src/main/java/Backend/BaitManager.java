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
public class BaitManager {
    int i = 0;
    private static String fileName = "data//bait.txt";

    public static String getAllBait() {
        try {
            Scanner sc = new Scanner(new File(fileName));
            String output = "";

            while (sc.hasNextLine()) {
                output += sc.nextLine() + "\n";
            }
            sc.close();
            return output;
        } catch (FileNotFoundException ex) {
            System.out.println("Bait file not found.");
            return null;
        }
    }

    public static String[] getAllBaitAsArray() {
        try {
            Scanner sc = new Scanner(new File(fileName));
            int numBait = getNumBait();
            String[] outputArr = new String[numBait];
            int currentIndex = 0;
            while (sc.hasNextLine()) {
                outputArr[currentIndex] = sc.nextLine();
                currentIndex++;
            }
            sc.close();
            return outputArr;
        } catch (FileNotFoundException ex) {
            System.out.println("Bait file not found.");
            return null;
        }
    }

    private static int getNumBait() {
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
            System.out.println("Bait file not found.");
            return -1;
        }
    }

    public static void addBait(String Bait) {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(fileName, true));
            pw.println(Bait);
            pw.close();
        } catch (IOException ex) {
            System.out.println("Could not write to file.");
        }

    }
    public static void deleteBait(String bait) {
		try {
			Scanner sc = new Scanner(new File(fileName));
			String output = "";
			String fullname = bait; 

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
			System.out.println("Bait file not found");
		} catch (IOException ex) {
			System.out.println("Could not delete Bait");
		}
	}
}
