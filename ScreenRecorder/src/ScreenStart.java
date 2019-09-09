import java.awt.AWTException;
import java.awt.Frame;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ScreenStart {

	public static JFrame f;
	public static JLabel l;
	public static JLabel l2;
	 public static JButton c=new JButton("Stop");
	 
	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		 f=new JFrame("Button Example");  	
		 l=new JLabel();
		 l2=new JLabel();
		
		 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		    JButton b=new JButton("Start"); 
//		    JButton c=new JButton("Stop");
		    
		    b.setBounds(50,100,95,30); 
		    c.setBounds(200,100,95,30); 
		    l.setBounds(100,150,1155,60);
		    l2.setBounds(130,150,1155,80);
		    f.add(b); 
		    f.add(c);
		    f.setSize(400,300);  
		    f.setLayout(null);  
		    f.setLocationRelativeTo(null);
		    f.setVisible(true); 
		    f.setTitle("Recording");
		    
//		    l2.setText("Duration : ");
//		    f.add(l2);
		    
		    
		    
		    
		    b.addActionListener(new ActionListener(){
		    	public void actionPerformed(ActionEvent e)
		    	{
		    		try {
		    			recording.startRec();
		    			
//		    			l2.setText("Timer :");
//						 f.add(l2);
//		    			 timerN();
		    			 
						System.out.println("Rec Start");
						b.setEnabled(false);
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
		    			recording.stopRec();
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
	
	 public static void timerN()
	  {
		  long startTime=(System.currentTimeMillis());
		  long elapsedTime=0L;
		  long elapsedTimeN=0L;
				  while (elapsedTime>= 0)
				  {
					  elapsedTime=((new Date()).getTime())-startTime;
					  
					  String hms = String.format("%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(elapsedTime),
							    TimeUnit.MILLISECONDS.toMinutes(elapsedTime) % TimeUnit.HOURS.toMinutes(1),
							    TimeUnit.MILLISECONDS.toSeconds(elapsedTime) % TimeUnit.MINUTES.toSeconds(1));
					 
					  if(elapsedTime!=elapsedTimeN)
					  {
						  System.out.println(hms);
						  l.setText(hms);
						  f.add(l);
						  l.repaint();
						  
						  
						  
					  }
					  elapsedTimeN=elapsedTime;
					 
				  }
				
				  
	  }

}
