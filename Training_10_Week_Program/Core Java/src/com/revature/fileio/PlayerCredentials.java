package com.revature.fileio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.revature.model.MonsterCard;

public class PlayerCredentials extends MonsterCard{
	/*
	 * As an aside, if you have a final reference like so, you must assign its
	 * value:
	 * 
	 * 1. When you declare the reference 2. OR inside of an "instance initializer"
	 * 3.OR inside of a constructor
	 */
	private final int num;

	public PlayerCredentials() {
		num = 8;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Hello, player! What would you like your username to be?");

		/*
		 * The "final" keyword has a few different uses in Java. In this case, it
		 * enforces that the "username" reference can only ever point to the same object
		 * in memory. This means that you can't use the assignment operator with a final
		 * reference more than once.
		 */
		final String username = sc.nextLine();

		System.out.println("What would you like your password to be?");

		final String password = sc.nextLine();

		/*
		 * We'd like to persist this user information, but we don't have a working
		 * database right now. As such, we will write the user information to a file
		 * instead.
		 * 
		 * In Java, there is a simple representation of a file called the "File" class.
		 */

		File file = new File("./credentials.txt");

		/*
		 * When writing to files in Java, you might frequently see the following
		 * options:
		 * 
		 * FileOutputStream -> a stream which allows you to write to a file. Writes in
		 * bytes. FileWriter -> Wraps around a FileOutputStream. Writes in characters.
		 * BufferedWriter -> A wrapper class that can wrap around a file writer. Writer
		 * entire lines. Is thread-safe.
		 */

		FileOutputStream fos = null;
		FileWriter fw = null;
		BufferedWriter bw = null;

		try {
//			fos = new FileOutputStream(file); Note that we are not using the fos as it writes in bytes
			fw = new FileWriter(file, true);
			bw = new BufferedWriter(fw);

			bw.write(username + ", " + password + "\n");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		/*
		 * Now let's see if we can read that data from our credentials file. In order to
		 * do so, we might choose to use:
		 * 
		 * FileInputStream -> An input stream that reads in bytes FileReader -> Wraps
		 * around an input stream. Reads in characters. BufferedReader -> Wraps around a
		 * FileReader. Reads in lines. Is thread-safe.
		 */

		FileInputStream fis = null;
		FileReader fr = null;
		BufferedReader br = null;

		try {
//			fis = new FileInputStream(file); Again we're not using this
			fr = new FileReader(file);
			br = new BufferedReader(fr);

			while (br.ready()) {
				String credentials = br.readLine();
				System.out.println(credentials);
				/*
				 * We need to separate the pieces of data
				 */
				String credentialPieces[] = credentials.split(",");
				System.out.println(credentialPieces[0]);
				System.out.println(credentialPieces[1]);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		/*
		 * Now let's also store some information about a MonsterCard. We will use
		 * serialization to do this.
		 */

		File byteCodeFile = new File("./bytecode.txt");

		FileOutputStream fos2 = null;
		ObjectOutputStream oos = null; // Used to write objects to a stream and the object has to be serializable

		try {
			fos2 = new FileOutputStream(byteCodeFile);
			oos = new ObjectOutputStream(fos2);

			// Create the MonsterCard
			MonsterCard card = new MonsterCard(1, "Teal Dragon", "Ugioh", 10);

			oos.writeObject(card);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
				fos2.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		/*
		 * Let's read our object back in. We'll use the ObjectInputStream to do so.
		 * Again it has to be serializable
		 */

		FileInputStream fis2 = null;
		ObjectInputStream ois = null;

		try {
			fis2 = new FileInputStream(byteCodeFile);
			ois = new ObjectInputStream(fis2);

			// De-serialization of our MonsterCard
			MonsterCard card2 = (MonsterCard) ois.readObject();
			System.out.println(card2);

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis2.close();
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
