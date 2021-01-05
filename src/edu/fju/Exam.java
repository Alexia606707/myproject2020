package edu.fju;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exam {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("d1");
			BufferedReader bf = new BufferedReader(fr);
			String data = bf.readLine();
			System.out.println(data);
			String[] aa = data.split(" ");
			System.out.println(aa[0]);
			System.out.println(aa[1]);
			System.out.println(aa[2]);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
