import java.util.Scanner;
import java.util.*;
import java.io.*;

import length.Foot;
import length.Inch;
import length.Length;
import length.Meter;
import length.Yard;

/**
 * This class handles lengths of different
 * units in a specific file<br>
 * @author Felix
 *
 */
public class Lab4 {
	/**
	 * This main program prints out
	 * each new class and calls
	 * other methods to process data<br>
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = null;

		try {
			in = new Scanner(new File("data.txt"));
		} catch (FileNotFoundException exception) {
			throw new RuntimeException("failed to open data.txt");
		}

		ArrayList<Length> lengthList = new ArrayList<Length>();

		// need more code for other parts of this assignment
		while (in.hasNextDouble()) {
			double value = in.nextDouble();
			String unit = in.next();
			Length length = null;
			// code here to use the value of unit to create the
			// right type of Length object and store it in length.
			if (unit.substring(0, 1).equalsIgnoreCase("m")) {
				length = new Meter(value);
			} else if (unit.substring(0, 1).equalsIgnoreCase("i")) {
				length = new Inch(value);
			} else if (unit.substring(0, 1).equalsIgnoreCase("f")) {
				length = new Foot(value);
			} else if (unit.substring(0, 1).equalsIgnoreCase("y")) {
				length = new Yard(value);
			} else {
				throw new IllegalArgumentException("Invalid Input");
			}

			lengthList.add(length);
			System.out.println(length);
			// need more code for other parts of this assignment
		}

		in.close();
		// need more code for other parts of this assignment
		System.out.printf("\n");

		getMinimum(lengthList);
		getMaximum(lengthList);
		System.out.printf("\n");

		addLengthsftl(lengthList);
		System.out.printf("\n");
		addLengthsltf(lengthList);

	}

	/**
	 * This method keeps track of minimum
	 * in length arraylist<br>
	 * @param lengthList
	 */
	public static void getMinimum(ArrayList<Length> lengthList) {
		if (lengthList.size() == 0)
			return;
		int j = 0;
		for (int i = 1; i < lengthList.size(); i++) {
			//compare current minimum to current object length
			if (lengthList.get(j).compareTo(lengthList.get(i)) > 0) {
				j = i;
			}
		}
		System.out.printf("Minimum is %s\n", lengthList.get(j).toString());
	}

	/**
	 * This method keeps track of maximum in
	 * length arraylist<br>
	 * @param lengthList
	 */
	public static void getMaximum(ArrayList<Length> lengthList) {
		if (lengthList.size() == 0)
			return;
		int j = 0;
		for (int i = 1; i < lengthList.size(); i++) {
			//compare current maximum to current object length
			if (lengthList.get(j).compareTo(lengthList.get(i)) < 0) {
				j = i;
			}
		}
		System.out.printf("Maximum is %s\n", lengthList.get(j).toString());
	}

	/**
	 * This method adds all lengths first to last
	 * and puts the totals in a new class of
	 * a specific unit<br>
	 * @param lengthList
	 */
	public static void addLengthsftl(ArrayList<Length> lengthList) {
		System.out.println("Sum of Lengths Adding from First to Last");
		Length length = null;
		length = new Meter(0.0);
		for (int i = 0; i < lengthList.size(); i++) {
			length.add(lengthList.get(i));
		}
		System.out.println(length);

		length = new Inch(0.0);
		for (int i = 0; i < lengthList.size(); i++) {
			length.add(lengthList.get(i));
		}
		System.out.println(length);

		length = new Foot(0.0);
		for (int i = 0; i < lengthList.size(); i++) {
			length.add(lengthList.get(i));
		}
		System.out.println(length);

		length = new Yard(0.0);
		for (int i = 0; i < lengthList.size(); i++) {
			length.add(lengthList.get(i));
		}
		System.out.println(length);
	}

	/**
	 * 
	 * @param lengthList
	 */
	public static void addLengthsltf(ArrayList<Length> lengthList) {
		System.out.println("Sum of Lengths Adding from Last to First");
		Length length = null;
		length = new Meter(0.0);
		for (int i = lengthList.size() - 1; i >= 0; i--) {
			length.add(lengthList.get(i));
		}
		System.out.println(length);

		length = new Inch(0.0);
		for (int i = lengthList.size() - 1; i >= 0; i--) {
			length.add(lengthList.get(i));
		}
		System.out.println(length);

		length = new Foot(0.0);
		for (int i = lengthList.size() - 1; i >= 0; i--) {
			length.add(lengthList.get(i));
		}
		System.out.println(length);

		length = new Yard(0.0);
		for (int i = lengthList.size() - 1; i >= 0; i--) {
			length.add(lengthList.get(i));
		}
		System.out.println(length);
	}

}
