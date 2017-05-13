package strategyPattern;

import java.util.ArrayList;

public class Client {

	public static void main(String[] args) {

		ArrayList<String> ss = new ArrayList<String>();
		ss.add("ahmed");
		ss.add("mohamed");
		ss.add("selam");


		CompressionContext ctx = new CompressionContext();
		// we could assume context is already set by preferences
		ctx.setCompressionStrategy(new ZipCompressionStrategy()); // get a list
																	// of
																	// files...
		ctx.createArchive(ss);
	}
}
