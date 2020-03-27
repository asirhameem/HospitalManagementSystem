import java.awt.*;
import java.awt.event.*;

class ReceptionistDashboard extends Frame implements WindowListener, ActionListener{
	
	
	private Register register;
	private Button Patient_Details,logout;

	
	private Panel panel;
	
	
	public ReceptionistDashboard(Register r){
		super("Receptionist Dashboard");
		this.register=r;
		setSize(800,600);
		panel=new Panel();
		panel.setLayout(null);

		Patient_Details = new Button("Patient Details");
		Patient_Details.setBounds(300,200,150,60);
		panel.add(Patient_Details);
		
		logout= new Button("Log Out");
		logout.setBounds(600,470,45,30);
		panel.add(logout);
		
		
		add(panel);
		Patient_Details.addActionListener(this);
		logout.addActionListener(this);
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
		int l=0;
		if(s.equals("Patient Details")){
			register.receptionistDashboard.setVisible(false);
			register.addPatient.setVisible(true);
		}
		else if(s.equals("Log Out")){
			register.receptionistDashboard.setVisible(false);
			register.receptionistloginWindow.setVisible(true);
		}
		
	}
	public void windowActivated(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowDeactivated(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowOpened(WindowEvent e){}

}
