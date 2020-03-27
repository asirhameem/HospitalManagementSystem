import java.awt.*;
import java.awt.event.*;


class DoctorDashboard extends Frame implements WindowListener, ActionListener{
	
	
	private Register register;
	private Button Patient_Details;
	private Button Log_Out;


	
	private Panel panel;
	
	
	public DoctorDashboard(Register r){
		super("Doctor DashBoard window");
		this.register=r;
		setSize(800,600);
		panel=new Panel();
		panel.setLayout(null);
		
		
		Patient_Details = new Button("Patient Details");
		Patient_Details.setBounds(300,250,150,60);
		panel.add(Patient_Details);
		
		Log_Out = new Button("Log Out");
		Log_Out.setBounds(590,470,80,30);
		panel.add(Log_Out);
		
		
		add(panel);
		Patient_Details.addActionListener(this);
		Log_Out.addActionListener(this);
		addWindowListener(this);
	}
	
	public void windowClosing(WindowEvent we){
        System.out.println("Window is closing");
		System.exit(0);
	}
	public void actionPerformed(ActionEvent e){
		String s=e.getActionCommand();
		int l=0;
		if(s.equals("Log Out")){
			register.doctorloginWindow.setVisible(true);
			register.doctorDashboard.setVisible(false);
		}
		else if(s.equals("Patient Details")){
			register.patientsearchForm.setVisible(true);
			register.doctorDashboard.setVisible(false);
		}
		
		
	}
	public void windowActivated(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowDeactivated(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowOpened(WindowEvent e){}
}
