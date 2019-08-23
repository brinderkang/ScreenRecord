import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ScreenStart {

	public static void main(String[] args) {
		 JFrame f=new JFrame("Button Example");  
		    JButton b=new JButton("Start"); 
		    JButton c=new JButton("Stop");
		    b.setBounds(50,100,95,30); 
		    c.setBounds(200,100,95,30); 
		    f.add(b); 
		    f.add(c);
		    f.setSize(400,400);  
		    f.setLayout(null);  
		    f.setVisible(true); 
		    
		    b.addActionListener(new ActionListener(){
		    	public void actionPerformed(ActionEvent e)
		    	{
		    		
		    	}

				
		    });

	}

}
