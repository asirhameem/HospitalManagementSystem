public class User{
	private String uname;
	private String pass;
	public User(String un, String p){
		uname=un;pass=p;
	}
	public String getPassword(){
		return pass;
	}
	public String getUName(){
		return uname;
	}
	
	//public void print(){
		//System.out.print(uname+" is from "+dept);
		//System.out.println(" with cgpa: "+cgpa);
	}
