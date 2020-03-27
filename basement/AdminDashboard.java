import java.awt.*;
import java.awt.event.*;

class AdminDashboard extends Frame implements WindowListener, ActionListener{
	
	
	private Register register;
	private Button Patient_Details;
	private Button Employee_Details;
	private Button Department_Details;

	private Button logout;
	private Panel panel;
	
	
	public AdminDashboard(Register r){
		super("Admin DashBoard window");
		this.register=r;
		setSize(800,600);
		panel=new Panel();
		panel.setLayout(null);
		
		
		Patient_Details = new Button("Patient Details");
		Patient_Details.setBounds(200,150,150,60);
		panel.add(Patient_Details);
		
		Employee_Details = new Button("Doctor Details");
		Employee_Details.setBounds(450,150,150,60);
		panel.add(Employee_Details);
		
		
		Department_Details = new Button("Receptionist Details");
		Department_Details.setBounds(320,300,150,60);
		panel.add(Department_Details);

		logout= new Button("Log Out");
		logout.setBounds(600,470,45,30);
		panel.add(logout);
		
		
		add(panel);
		Patient_Details.addActionListener(this);
		Employee_Details.addActionListener(this);
		Department_Details.addActionListener(this);
	
		logout.addActionListener(this);
		
		
		addWindowListener(this);
		
	}
	/*public void paint(Graphics g){
		g.drawString("User Name:",40,100);
		g.drawString("Password:",40,150);
	}*/
	public void windowClosing(WindowEvent we){
        System.out.println("Window is closing");
		System.exit(0);
	}
	public void actionPerformed(ActionEvent e){
		String s=e.getActionCommand();
		int l=0;
		if(s.equals("Doctor Details")){
			register.adminDashboard.setVisible(false);
			register.addDoctor.setVisible(true);
		}
		else if(s.equals("Receptionist Details")){
			register.adminDashboard.setVisible(false);
			register.addReceptionist.setVisible(true);
		}
		else if(s.equals("Patient Details")){
			register.adminDashboard.setVisible(false);
			register.addPatient.setVisible(true);
		}
		
		else if(s.equals("Log Out")){
			register.adminDashboard.setVisible(false);
			register.adminloginWindow.setVisible(true);
		}
			
		
		
	}
	public void windowActivated(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowDeactivated(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowOpened(WindowEvent e){}

}
