import java.awt.*;
import java.awt.event.*;

public class ReceptionistSearchForm extends Frame implements KeyListener,ActionListener{
	private Register register;
    private Label messageBox;
	private TextField emailText;
	public ShowRecord showRecord;
	public ReceptionistSearchForm(Register r){
		super("Java Keyboard Demo");
		this.register=r;
		Button b=new Button("Search Receptionists Information");
		Button back=new Button("           Back          ");
        Label e=new Label("Email");
        messageBox=new Label("                                                            Message to show                                                             ");
        emailText=new TextField(60);
		add(e);
        add(emailText);
        add(b);
		add(back);
		add(messageBox);
		emailText.addKeyListener(this);
		setSize(500,400);
		setLayout(new FlowLayout());
		back.addActionListener(this);
	}
	public void paint(Graphics g){
	}
	public void keyPressed(KeyEvent ke){
	}
	public void keyTyped(KeyEvent ke){
	}
	public void keyReleased(KeyEvent ke){
		if(emailText.getText().length()>0){
			String text="select * from receptionist_details where email like '"+emailText.getText()+"%'";
			showRecord=new ShowRecord(15);
			showRecord.loadNames(text);
			showRecord.showNames(messageBox);
		}
		
	}
	public void actionPerformed(ActionEvent e){
		String text=e.getActionCommand();
		if(text.equals("           Back          ")){
			register.receptionistsearchForm.setVisible(false);
			register.addReceptionist.setVisible(true);
		}
}
}
