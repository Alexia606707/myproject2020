package edu.fju;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Project20201229 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("data.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			String s = br.readLine();
			System.out.println(s);
			s = br.readLine();
			System.out.println(s);
			s = br.readLine();
			System.out.println(s);
			/*
			int n = fis.read();
			while (n != -1) {
				System.out.print((char)n);
				n = fis.read();
			}
			*/
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error reading");
		}
	}

}
