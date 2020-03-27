import java.awt.*;
import java.awt.event.*;

class DoctorLoginWindow extends Frame implements WindowListener, ActionListener{
				
    private Register register;
	private TextField uName;
	private TextField password;
	private Button loginButton;
	private Button backButton;
	private Panel panel;
	private Label title,passlabel;
	
	
	public DoctorLoginWindow(Register r){
		super("Hospital Management System");
		this.register=r;
		setSize(800,600);
		panel=new Panel();
		panel.setLayout(null);
		
		title=new Label("Welcome to General Hospital.");
		title.setBounds(280,30,500,80);
		panel.add(title);
		
		title=new Label("User Name");
		title.setBounds(200,110,100,30);
		panel.add(title);
		
		uName=new TextField(5);
		uName.setBounds(380,110,100,30);
		panel.add(uName);
		
		passlabel=new Label("Password");
		passlabel.setBounds(200,170,100,30);
		panel.add(passlabel);
		
		password=new TextField(5);
		password.setEchoChar('*');
		password.setBounds(380,170,100,30);
	   	panel.add(password);
		
		
		loginButton = new Button("Login");
		loginButton.setBounds(250,250,80,30);
		panel.add(loginButton);
		
		backButton = new Button("Back");
		backButton.setBounds(350,250,80,30);
		panel.add(backButton);
		
		title=new Label("Invalid User");
		title.setBounds(300,210,80,30);
		
		
		
		setLocation(100,100);
		
		add(panel);
		loginButton.addActionListener(this);
		backButton.addActionListener(this);
		addWindowListener(this);
	}
	public void paint(Graphics g){
		g.drawString("User Name:",40,100);
		g.drawString("Password:",40,150);
	}
	public void windowClosing(WindowEvent we){
        System.out.println("Window is closing");
		System.exit(0);
	}
	public void actionPerformed(ActionEvent e){
		String s=e.getActionCommand();
		boolean b=false;
		if(s.equals("Login")){
			try{
				register.buffer.loadUser("select * from doctor");
				b=register.buffer.checkUserAuth(uName.getText(),password.getText());
				if(b){
					System.out.println("Valid User");
					register.doctorDashboard.setVisible(true);
					register.doctorloginWindow.setVisible(false);
				}
				else{
					System.out.println("Invalid User");
				}
			}
				catch(Exception ex){ex.printStackTrace();}
			//System.out.println(uName.getText());
			//System.out.println(password.getText());
		}
			
	
		else if(s.equals("Back")){
			register.doctorloginWindow.setVisible(false);
			register.userChoice.setVisible(true);
		}
		panel.add(title);
		
		
	}
	public void windowActivated(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowDeactivated(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowOpened(WindowEvent e){}

}