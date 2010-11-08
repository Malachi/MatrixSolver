import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileManipulator {
	private static BufferedWriter bufferedWriter;
	
	/**
	 * Clears the output file.
	 * @param outputFile the file to clear
	 */
	public static void clearOutputFile(String outputFile) {
		try {
			bufferedWriter = new BufferedWriter(new FileWriter(outputFile, false));
			bufferedWriter.write("");
			bufferedWriter.close();
		} catch (IOException e) {
			System.out.println("Error Clearing Output File...Exiting");
			System.exit(1);
	    }
	}

	/**
	 * Prints text to a file.
	 * @param outputFile the file to write too
	 * @param text the text to output
	 * @param withLarge prints the text large if this flag set
	 */
	public static void toFile(String outputFile, String text, boolean withLarge) {
		try {
			// get new file descriptor
			bufferedWriter = new BufferedWriter(new FileWriter(outputFile, true));
	        
	        // print text
			if (withLarge) bufferedWriter.write("\n{\\Large ");
			bufferedWriter.write(text);
	        if (withLarge) bufferedWriter.write("}");
	        
	        // close the file descriptor
	        bufferedWriter.close();
		} catch (IOException e) {
			System.out.println("Error Printing Text To Output File...Exiting");
			System.exit(1);
	    }
	}
	
}
