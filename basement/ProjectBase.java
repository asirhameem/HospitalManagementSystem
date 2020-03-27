	public class ProjectBase{
    public static void main(String str[]){
		Register r=new Register();
		r.adminloginWindow=new AdminLoginWindow(r);
		r.userChoice=new UserChoice(r);
		r.adminDashboard=new AdminDashboard(r);
		r.receptionistloginWindow=new ReceptionistLoginWindow(r);
		r.receptionistDashboard=new ReceptionistDashboard(r);
		r.doctorloginWindow=new DoctorLoginWindow(r);
		r.doctorDashboard=new DoctorDashboard(r);
		r.addDoctor=new AddDoctor(r);
		r.addReceptionist=new AddReceptionist(r);
		r.addPatient=new AddPatient(r);
		r.doctorsearchForm=new DoctorSearchForm(r);
		r.patientsearchForm=new PatientSearchForm(r);
		r.receptionistsearchForm=new ReceptionistSearchForm(r);
        r.userChoice.setVisible(true);
		
    }
}