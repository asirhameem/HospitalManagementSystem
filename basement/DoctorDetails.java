import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;


class DoctorDetails extends Frame implements WindowListener, ActionListener{
	
	private Register register;
	private Label title,name,mobile,address,dob,dept,gender,ms,bg,age,email,salary;
	private TextField Tname,Tmobile,Taddress,Tdob,Tdept,Tgender,Tms,Tbg,Tage,Temail,Tsalary;
	private Button Search;
	private Panel panel;
	
	
	public DoctorDetails(Register r){
		super("Hospital Management System");
		this.register=r;
		setSize(800,600);
		panel=new Panel();
		panel.setLayout(null);
		
		title=new Label("Enter doctor information.");
		title.setBounds(280,30,500,80);
		panel.add(title);
		
		
		gender=new Label("Gender");
		gender.setBounds(400,110,100,30);
		panel.add(gender);
		
		Tgender=new TextField(5);
		Tgender.setBounds(520,110,150,30);
		panel.add(Tgender);
		
		name=new Label("Name");
		name.setBounds(80,170,100,30);
		panel.add(name);
		
		Tname=new TextField(5);
		Tname.setBounds(200,170,150,30);
	   	panel.add(Tname);
		
		age=new Label("Date of Joining ");
		age.setBounds(400,170,100,30);
		panel.add(age);
		
		Tage=new TextField(5);
		Tage.setBounds(520,170,150,30);
	   	panel.add(Tage);
		
		mobile=new Label("Mobile No");
		mobile.setBounds(80,230,100,30);
		panel.add(mobile);
		
		Tmobile=new TextField(5);
		Tmobile.setBounds(200,230,150,30);
	   	panel.add(Tmobile);
		
		email=new Label("Email ");
		email.setBounds(400,230,100,30);
		panel.add(email);
		
		Temail=new TextField(5);
		Temail.setBounds(520,230,150,30);
	   	panel.add(Temail);
		
		address=new Label("Address");
		address.setBounds(80,290,100,30);
		panel.add(address);
		
		Taddress=new TextField(5);
		Taddress.setBounds(200,290,150,30);
	   	panel.add(Taddress);
		
		dept=new Label("Department");
		dept.setBounds(400,290,100,30);
		panel.add(dept);
		
		Tdept=new TextField(5);
		Tdept.setBounds(520,290,150,30);
	   	panel.add(Tdept);
		
		ms=new Label("Marital Status");
		ms.setBounds(400,350,100,30);
		panel.add(ms);
		
		dob=new Label("Date of Birth");
		dob.setBounds(80,350,100,30);
		panel.add(dob);
		
		Tdob=new TextField(5);
		Tdob.setBounds(200,350,150,30);
	   	panel.add(Tdob);
		
		Tms=new TextField(5);
		Tms.setBounds(520,350,150,30);
	   	panel.add(Tms);
		
		salary=new Label("Salary");
		salary.setBounds(80,410,100,30);
		panel.add(salary);
		
		Tsalary=new TextField(5);
		Tsalary.setBounds(200,410,150,30);
	   	panel.add(Tsalary);
		
		bg=new Label("Blood Group");
		bg.setBounds(400,410,100,30);
		panel.add(bg);
		
		Tbg=new TextField(5);
		Tbg.setBounds(520,410,150,30);
		panel.add(Tbg);
		
		
		Search = new Button("Search");
		Search.setBounds(450,470,45,30);
		panel.add(Search);
		
		
		
		add(panel);
		Search.addActionListener(this);
		
			
		addWindowListener(this);
		
	}
	public void windowClosing(WindowEvent we){
        System.out.println("Window is closing");
		System.exit(0);
	}
	public void actionPerformed(ActionEvent e){
		String text=e.getActionCommand();
	    DataAccess da=new DataAccess();
		//iname=rs.getString("name");
		
		if(text.equals("Search")){
			try{
				
			text="select * from beta where name like '"+Tname.getText()+"%'";
		    ResultSet rs=da.getData(text);
			Temail.setText(rs.getString("email"));
			}
			catch(Exception ex){};
		
		
		}
		
		else if(text.equals("Back")){
			register.adminDashboard.setVisible(true);
			register.addDoctor.setVisible(false);
		}
		
	   
		
		
	}
	public void windowActivated(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowDeactivated(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowOpened(WindowEvent e){}
}