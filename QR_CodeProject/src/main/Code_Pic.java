package main;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import com.github.sarxos.webcam.Webcam;

public class Code_Pic {
	public static void main(String[]arg) throws IOException{
			Webcam webcam = Webcam.getDefault();
			webcam.open();
			ImageIO.write(webcam.getImage(), "JPG", new File("test.jpg"));
	}

}


	