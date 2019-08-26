import java.awt.AWTException;
import java.awt.Frame;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ScreenStart {

	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		 JFrame f=new JFrame("Button Example");  
		
		 
//		ArrayList <Image> imagelist=new ArrayList <Image>();
//		
//		imagelist.addAll((Collection<? extends Image>) new ImageIcon ("\\src\\images\\Icon.png"));
		 
		 
//		 f.setIconImage(System.getProperty("user.dir")+"\\src\\images\\Icon.png");
//		 f.setIconImage(
//				 new ImageIcon(getClass().getClassLoader().getResource("PATH/TO/YourImage.png"))
//				 );
		    JButton b=new JButton("Start"); 
		    JButton c=new JButton("Stop");
		    b.setBounds(50,100,95,30); 
		    c.setBounds(200,100,95,30); 
		    f.add(b); 
		    f.add(c);
		    f.setSize(400,300);  
		    f.setLayout(null);  
		    f.setLocationRelativeTo(null);
		    f.setVisible(true); 
		    f.setTitle("Recording");
		    
		    
		    
		    
		    b.addActionListener(new ActionListener(){
		    	public void actionPerformed(ActionEvent e)
		    	{
		    		try {
						startbutton.startRec();
						System.out.println("Rec Start");
						 f.setState(Frame.ICONIFIED);
//					    Thread.sleep(10000);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (AWTException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		    	}

				
		    });
		    
		    
		    
		    
		    c.addActionListener(new ActionListener(){
		    	public void actionPerformed(ActionEvent e)
		    	{
		    		try {
						startbutton.stopRec();
						f.setVisible(false);
						JOptionPane.showMessageDialog(null, "Recording saved at : "+ System.getProperty("user.dir")+"\\ScreenRecording");
						System.exit(0);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		    	}

				
		    });
		    

	}

}
