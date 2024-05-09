package collections;

import java.security.DrbgParameters.NextBytes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import arrayList_Vector_P46.Arraylist;

//Storing scanner in linked list
public class Work4_merge {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the first Array: ");
        LinkedList<String> s1 = new LinkedList<String>(Arrays.asList(scan.nextLine()));

		System.out.println("Enter the first Array: ");
        LinkedList<String> s2 = new LinkedList<String>(Arrays.asList(scan.next()));


		System.out.print(s1);
		System.out.print(s2);
	}
}
