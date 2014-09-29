
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Buffer 
{
	public static void main(String[] args) throws IOException, NullPointerException
	{     
	    File outputFile = new File("buffer.txt");
	    if(!outputFile.exists())
	    	outputFile.createNewFile();
		FileOutputStream Output = new FileOutputStream(outputFile,false);
	      int bufferSize = 1024*1; //begin at 1, double each time to 128
	      int total = (1024*1024*100);
	      int writecount = total/bufferSize;
	      byte[] buffer = new byte[bufferSize];
	      
	      long startTime = System.currentTimeMillis();
	      
	      for(int i = 0; i<writecount;i++)
	      {
	    	  Output.write(buffer,0,bufferSize);
	      }
	      Output.close();
	   
	      long finalTime = System.currentTimeMillis() - startTime;
	      
	      System.out.println("Time: " + finalTime);
	      
	
	
	
	}
}