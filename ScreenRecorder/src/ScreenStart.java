import java.awt.AWTException;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ScreenStart {

	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		 JFrame f=new JFrame("Button Example");  
		    JButton b=new JButton("Start"); 
		    JButton c=new JButton("Stop");
		    b.setBounds(50,100,95,30); 
		    c.setBounds(200,100,95,30); 
		    f.add(b); 
		    f.add(c);
		    f.setSize(300,300);  
		    f.setLayout(null);  
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
						System.exit(0);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		    	}

				
		    });
		    

	}

}
