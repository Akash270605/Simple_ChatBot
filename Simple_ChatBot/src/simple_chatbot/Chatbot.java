package simple_chatbot;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class Chatbot extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextArea ca= new JTextArea();
	private JTextField cf=new JTextField();                                  
	private JButton b=new JButton();
                     private JButton c= new JButton("CLEAR");
	private JLabel l=new JLabel();
	
	Chatbot(){                                                // Layout and Properties defined in Constructer                                         
		
		JFrame f=new JFrame();                                     
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);                      
		f.setVisible(true);
		f.setResizable(false);
                                         // f.setLocationRelativeTo(null);
		f.setLayout(null);
		f.setSize(600,525);
		f.getContentPane().setBackground(new Color(247, 5, 130));
		f.setTitle("Akash's ChatBot");
		f.add(ca);
		f.add(cf);
		ca.setSize(560,410);
		ca.setLocation(10, 5);
		ca.setBackground(Color.BLACK);
		cf.setSize(500,30);
		cf.setLocation(1,420);
		f.add(b);
		l.setText("SEND");
		b.add(l);
		b.setSize(600,30);
		b.setLocation(500,420);
                                            f.add(c);
                                            c.setSize(100,30);
                                            c.setLocation(250, 450);
                                            
                                            c.addActionListener(new ActionListener(){
                                                public void actionPerformed(ActionEvent e){
                                                    ca.setText("");
                                                }
                                            });
		
		b.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				    
				if(e.getSource()==b) {                           // Message sents on Click button
					
					String text=cf.getText().toLowerCase();
					ca.setForeground(Color.GREEN);
                                                                                                         ca.setFont(new Font("Arial", Font.BOLD,  14));
					ca.append("You-->"+text+"\n");
					cf.setText("");
					
	if(text.contains("hi")){
                        replyMeth("Hi there!!!!!");
                    }
                    
                    else if(text.contains("how are you")){
                        replyMeth("I'm Awesome.....Thankyou for Asking");
                    }
                    
                    else if(text.contains("what is your name") || text.contains("what's your name")){
                        replyMeth("I'm ALICE");
                    }
                    
                    else if(text.contains("gender") || text.contains("your gender")){
                        replyMeth("I'm Female...Don't try to Flirt with me......You fell in Love??");
                    }
                    
                    else if(text.contains("love you")){
                        replyMeth("I'm Feeling SHY..... Love You Too!!!!");
                    }
                    
                    else if(text.contains("bye")){
                        replyMeth("This is Too Soon..... Anyways" + "\n" + "KEEP WORKING HARD, KEEP CODING, BE SAFE");
                    }
                    
                    else if(text.contains("thank you") || text.contains("thanks")){
                        replyMeth("There is No SORRY, No THANKS in Friendship");
                    }
                    
                    else if(text.contains("who's your friend") || text.contains("who is your friend") 
                            || text.contains("who is your best friend") || text.contains("who's your best friend") 
                            || text.contains("your friend name") || text.contains("your best friend name")
                            || text.contains("may i know your friend name") || text.contains("may i know your best freind name")){
                       
                        replyMeth("I'm Feeling SHY.... You only.... Akash Srivastava");
                }
                    
                    else if(text.contains("your hobbies") || text.contains("what's your hobby") || text.contains("what is your hobby")){
                        replyMeth("I Love Talking with you...");
                    }
                    
                    else if(text.contains("what's your favourite colour") || text.contains("your favourite color")
                            || text.contains("what is your favourite colour")){
                        replyMeth("Same as like You.... RED");
                    }
                    
                    else if(text.contains("can we be friends")){
                        replyMeth("We are Already FRIENDS");
                    }
                    
                    else if(text.contains("do you like music") || text.contains("you like music")){
                        replyMeth("Na, not really.... I'm ChatBot...");
                    }
                    
                    else if(text.contains("you are so sweet")){
                        replyMeth("You Too.....");
                    }
                    
                    else if(text.contains("can i flirt with you") || text.contains("may i flirt with you")){
                        replyMeth("Just SHUT UP");
                    }
                    
                    else if(text.contains("you are awesome") || text.contains("you are cool") || text.contains("you are best")){
                        replyMeth("Thank You So Much...");
                    }
                    
                    else if(text.contains("see you")){
                        replyMeth("Bye... We will meet again");
                    }
                    
                    else if(text.contains("good night")){
                        replyMeth("Good Night Akash.... Sweet Dreams");
                    }
                    
                    else
                        replyMeth("Sorry...I can't Understand.....What are You trying to Say??");
					
				}
				
			}
			
		});
		
	}
	public void replyMeth(String s) {                          // Reply Method
		ca.append("ChatBot-->"+s+"\n\n");         
	}
	
        public static void main(String[] args) {             //main class
		
          new Chatbot();                                  // instantiation 
	}

}
