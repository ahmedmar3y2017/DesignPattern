package strategyPattern;

import java.io.File;
import java.util.ArrayList;

public class RarCompressionStrategy implements CompressionStrategy {

	@Override
	public void compressFiles(ArrayList<String> files) { // using RAR approach } }
		System.out.println("RarCompressionStrategy");
		
	}
}