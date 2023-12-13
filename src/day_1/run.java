package day_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner f = new Scanner(new File("values.txt"));
			int sum = 0;
            while (f.hasNextLine()) {
                String line = f.nextLine();
                String reversed = "";
                for(int i = line.length()-1; i >= 0; i--) {
                	reversed += line.charAt(i);
                }
                sum += findNum(line) * 10;
                sum += findNum(reversed);
            }
            
            System.out.println(sum);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static int findNum(String s) {
		for(int i = 0; i < s.length(); i++) {
			if(isNumber(s.charAt(i))) {
				return Integer.parseInt(Character.toString(s.charAt(i)));
			}
		}
		return 0;
	}
	
	public static boolean isNumber(char c) {
	    try {
	        double d = Integer.parseInt(Character.toString(c));
	    } catch (Exception e) {
	        return false;
	    }
	    return true;
	}
}
