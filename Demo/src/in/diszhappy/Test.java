package in.diszhappy;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.Properties;

public class Test {

	private Properties properties;

	public void load() {
		properties = new Properties();
		try {
			properties.load(getClass().getClassLoader().getResourceAsStream("application.properties"));

		} catch (IOException ioex) {
			System.out.println("IOException Occured while loading properties file::::" + ioex.getMessage());
		}
	}

	public String readProperty(String keyName) {
		System.out.println("Reading Property " + keyName);
		return properties.getProperty(keyName, "There is no key in the properties file");
	}

	public static void main(String[] args) throws InterruptedException {
		Test t = new Test();
		t.load();
		System.out.println(t.readProperty("message.one"));
		Frame f = new Frame ("Label example");  
	    Label l1, l2;    
	  
	    // initializing the labels   
	    l1 = new Label (t.readProperty("message.one"));   
	    l2 = new Label (t.readProperty("message.seven"));   
	  
	    // set the location of label  
	    l1.setBounds(100, 100, 100, 30);    
	    l2.setBounds(100, 150, 100, 30);  
	  
	    // adding labels to the frame    
	    f.add(l1);  
	    f.add(l2);   
	  
	    // setting size, layout and visibility of frame   
	    f.setSize(400,400);    
	    f.setLayout(null);    
	    f.setVisible(true);  
	    f.addWindowListener(new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                System.exit(0);    
            }    
        });  
	}

}
