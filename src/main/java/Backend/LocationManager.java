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
public class LocationManager {
   

	//READ COMMENTS IN ASSESSMENT - this class is almost a duplicate
	private static String fileName = "data//location.txt";

	public static String getLocations() {
		try {
			Scanner sc = new Scanner(new File(fileName));
			String output = "";

			while (sc.hasNextLine()) {
				output += sc.nextLine() + "\n";
			}
			sc.close();
			return output;
		} catch (FileNotFoundException ex) {
			System.out.println("Location file not found");
			return null;
		}
	}

	public static String[] getLocationAsArray() {
		try {
			Scanner sc = new Scanner(new File(fileName));
			int numLocations = getNumLocations();
			String[] outputArr = new String[numLocations];
			int currentIndex = 0;
			while (sc.hasNextLine()) {
				outputArr[currentIndex] = sc.nextLine();
				currentIndex++;
			}
			sc.close();
			return outputArr;
		} catch (FileNotFoundException ex) {
			System.out.println("Location file not found");
			return null;
		}
	}

	private static int getNumLocations() {
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
			System.out.println("Location file not found");
			return -1;
		}
	}

	public static void addLocation(String location) {
		try {
			PrintWriter pw = new PrintWriter(new FileWriter(fileName, true));
			pw.println(location);
			pw.close();
		} catch (IOException ex) {
			System.out.println("Could not write to file");
		}
	}

	public static void deleteLocation(String location) {
		try {
			Scanner sc = new Scanner(new File(fileName));
			String output = "";
			String area = location;

			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				if (!line.equalsIgnoreCase(area)) {
					output += line + "\n";
				}
			}
			sc.close();

			PrintWriter pw = new PrintWriter(new FileWriter(fileName, false));
			pw.print(output);
			pw.close();
		} catch (FileNotFoundException ex) {
			System.out.println("location file not found");
		} catch (IOException ex) {
			System.out.println("Could not delete location");
		}
	}
}


