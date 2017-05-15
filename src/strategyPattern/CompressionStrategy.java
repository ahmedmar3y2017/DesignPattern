package strategyPattern;

import java.util.ArrayList;

//Strategy Interface
public interface CompressionStrategy {
  public void compressFiles(ArrayList<String> files);
}