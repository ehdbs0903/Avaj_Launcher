package simulator;

import java.io.File;
import java.io.FileReader;

public class Simulator {
	public static void main(String[] args) {
		try {
			if (args.length != 1) {
				System.out.println("Usage: java ro.academyplus.avaj.simulator.Simulator <scenario file>");
				System.exit(1);
			}

			File file = new File("test.txt");
			FileReader fileReader = new FileReader(file);

			int singleCh = 0;
			while((singleCh = fileReader.read()) != -1) {
				System.out.println((char)singleCh);
			}
			fileReader.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
	}
}