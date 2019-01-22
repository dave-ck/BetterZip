import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Benchmarker {
	/** Benchmarker class allow you to measure the performance of various different algorithms across many possible inputs.
	 *  Inputs:
	 *  - 10k digits of pi (decimal form - from http://www.geom.uiuc.edu/~huberty/math5337/groupe/digits.html)
	 *  - Couple of plays by Shakespeare (retrieved from http://shakespeare.mit.edu/hamlet/full.html)
	 *  - FHIR JSON anonymous medical data (kindly provided by TPP at Durhack 2018)
	 *  - Many small files (random generated strings); idea being to force the creation of many dictionaries
	 */
	private Encoder encoder;
	
	public Benchmarker(Encoder encoder){
		this.encoder = encoder;
	}

	public void writeCSV(){
		//make a .csv file named after the encoder.
		PrintWriter printer = null;
		try {
			File file = new File("./outputs/"+"testOutput.txt"); //+encoder.getName());
			printer = new PrintWriter(file);
		} catch (FileNotFoundException e) {
			System.out.println("Cannot print to target.");
			e.printStackTrace();
		}
		printer.print("This is a test string");
		printer.print("This is a test string (x2!)");
		printer.close();
		
		
		
		
	}
	
	public static void main(String[] args){
		Benchmarker b = new Benchmarker(null);
		
	}
	
	
	
	
}
