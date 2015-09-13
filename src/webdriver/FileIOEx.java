package webdriver;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.io.TemporaryFilesystem;

public class FileIOEx {

	public static void main(String[] args) {
		
		String sFileDir = "/Users/ppalanisamy/Desktop/SELENIUM/TempDir/";
		
		File from = new File (sFileDir+"srcFile.txt");
		File to = new File (sFileDir+"srcFile1.txt");
		
		
		try {
			//FileHandler.copy(from, to);
			
			File tfs = TemporaryFilesystem.getDefaultTmpFS().createTempDir("prefix", "suffix");
			
			System.out.println(tfs.getAbsolutePath());
						
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
