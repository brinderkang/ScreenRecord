import static org.monte.media.FormatKeys.EncodingKey;
import static org.monte.media.FormatKeys.FrameRateKey;
import static org.monte.media.FormatKeys.KeyFrameIntervalKey;
import static org.monte.media.FormatKeys.MIME_AVI;
import static org.monte.media.FormatKeys.MediaTypeKey;
import static org.monte.media.FormatKeys.MimeTypeKey;
import static org.monte.media.VideoFormatKeys.CompressorNameKey;
import static org.monte.media.VideoFormatKeys.DepthKey;
import static org.monte.media.VideoFormatKeys.ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE;
import static org.monte.media.VideoFormatKeys.QualityKey;

import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.io.File;

import org.monte.media.Format;
import org.monte.media.FormatKeys.MediaType;
import org.monte.media.math.Rational;
import org.monte.screenrecorder.ScreenRecorder;

public class startbutton {
	
	// screenRecording Start
	 StringBuffer verificationErrors = new StringBuffer();   
	 ScreenRecorder screenRecorder; 
	 File file = new File(System.getProperty("user.dir")+"\\src\\movieFolder");
	// Create an instance of GraphicsConfiguration to get the   Graphics configuration  of the Screen. This is needed for ScreenRecorder class.     
	 GraphicsConfiguration gc = GraphicsEnvironment         
			 					.getLocalGraphicsEnvironment()         
			 					.getDefaultScreenDevice()         
			 					.getDefaultConfiguration();
	   // Create a instance of ScreenRecorder with the required     configurations   
	 	

screenRecorder = new ScreenRecorder(gc, 
						gc.getBounds(),new Format(MediaTypeKey, MediaType.FILE, MimeTypeKey, MIME_AVI),      
						new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey,          
						ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,         
						CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,         
						DepthKey, (int)24, FrameRateKey, Rational.valueOf(15),         
						QualityKey, 1.0f,         
						KeyFrameIntervalKey, (int) (15 * 60)),      
						new Format(MediaTypeKey, MediaType.VIDEO,          
						EncodingKey,"black",         
						FrameRateKey, Rational.valueOf(30)),            
						null,file);



private void screenRecorder() {
	// TODO Auto-generated method stub

}






}