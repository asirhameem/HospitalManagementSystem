public class Register{
	public DoctorLoginWindow doctorloginWindow;
	public DoctorDashboard doctorDashboard;
	public Buffer buffer;
	public AdminLoginWindow adminloginWindow;
	public UserChoice userChoice;
	public AdminDashboard adminDashboard;
	public ReceptionistLoginWindow receptionistloginWindow;
	public ReceptionistDashboard receptionistDashboard;
	public AddDoctor addDoctor;
	public AddReceptionist addReceptionist;
	public AddPatient addPatient;
	public DoctorSearchForm doctorsearchForm;
	public PatientSearchForm patientsearchForm;
	public ReceptionistSearchForm receptionistsearchForm;
	public Register(){
		userChoice=null;
		adminDashboard=null;
		adminloginWindow=null;
		receptionistloginWindow=null;
		doctorloginWindow=null;
		receptionistDashboard=null;
		addDoctor=null;
		addReceptionist=null;
		addPatient=null;
		doctorsearchForm=null;
		patientsearchForm=null;
		receptionistsearchForm=null;
		buffer=new Buffer(20);
	}
}