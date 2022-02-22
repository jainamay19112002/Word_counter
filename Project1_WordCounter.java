import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project1_WordCounter extends JFrame implements ActionListener  {
	JLabel lb1,lb2;
	JTextArea ta;
	JButton b;
	JButton pad,text;
	
	Project1_WordCounter(){
		super("A Word Count Tool");
		lb1=new JLabel("Characters:");
		lb1.setBounds(100,100,200,40);
		
		lb2=new JLabel("Words:");
		lb2.setBounds(100,160,200,40);
		
		ta=new JTextArea();
		ta.setBounds(100,220,600,400);
		
		b=new JButton("Click Me");
		b.setBounds(100,640,160,60);
		b.addActionListener(this);
		
		pad=new JButton("Color Change");
		pad.setBounds(280,640,220,60);
		pad.addActionListener(this);
		
		text=new JButton("Text");
		text.setBounds(520,640,220,60);
		text.addActionListener(this);
		
		add(lb1);add(lb2);add(ta);add(b);add(pad);add(text);
		setSize(800,800);  
        setLayout(null); 
        setVisible(true);  
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
		
	}
	public void actionPerformed(ActionEvent d) {
		if(d.getSource()==b){  
	        String text=ta.getText();  
	        lb1.setText("Characters: "+text.length());  
	        String words[]=text.split("\\s");  
	        lb2.setText("Words: "+words.length);  
	        }
		else if(d.getSource()==pad){  
	            Color c=JColorChooser.showDialog(this,"Choose Color",Color.BLUE);  
	            ta.setBackground(c);  
	        }
		else if(d.getSource()==text){  
	            Color c=JColorChooser.showDialog(this,"Choose Color",Color.WHITE);  
	            ta.setForeground(c);  
	        }  
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Project1_WordCounter();

	}

}
