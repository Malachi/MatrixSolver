import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Checker {
	private int term_count;
	private int term_add;
	private int term_minus;
	
	public Checker() {
		// initialize variables
		term_count = 0;
		term_add = 0;
		term_minus = 0;
		
		// Status message
		System.out.println("Starting to count terms & signs");
		
		// count
		for (int i = 1; i < 10; i++) {
			System.out.println("Currently counting... ./10x10.tex" + i);
			count("./10x10.tex" + i);
			term_count = term_add + term_minus;
		}
		
		// print the results
		System.out.println("Total # Of Terms:  " + term_count);
		System.out.println("Addition Signs:    " + term_add);
		System.out.println("Subtraction Signs: " + term_minus);
	}
	
	/**
	 * Entry into the program.
	 * @param args the arguments passed to the program.
	 */
	public static void main(String[] args) {
		new Checker();
	}
	
	public void count(String filename) {
		// open file for scanning
		Scanner scan = null;
		try {
			scan = new Scanner(new File(filename));
		} catch(IOException e) {
			System.out.println("Unable to read file. Exiting.");
			System.exit(1);
		}
		
		// scan through the file line by line
		StringBuffer temp = new StringBuffer();
		while (scan.hasNext()) {
			temp.append(scan.next());
			for(int i = 0; i < temp.length(); i++) {
				if (temp.charAt(i) == '+') term_add++;
				else if (temp.charAt(i) == '-') term_minus++;
			}
			temp.setLength(0);
		}
		
		// close file used for scanning
		scan.close();
	}

}
