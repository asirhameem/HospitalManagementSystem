import java.sql.ResultSet;
import java.sql.SQLException;
public class Buffer{
	private User userList[];
	
	
	public Buffer(int size){
		userList=new User[size];
		
	}
	public void loadUser(String sql)throws SQLException{
		DataAccess da=new DataAccess();
		ResultSet rs=da.getData(sql);
		User u=null;
		String uname,pass;
		while(rs.next()){
			uname=rs.getString("name");
			pass=rs.getString("password");
			u=new User(uname,pass);
			addUser(u);
		}
	}
	
	
	public boolean checkUserAuth(String un,String pass){
		boolean flag=false;
		for(User u:userList){
			if(u!=null){
				if(u.getUName().equals(un) && u.getPassword().equals(pass)){
					flag=true;
				}
			}
		}
		return flag;
	}
	public void addUser(User u){
		for(int i=0;i<userList.length;i++){
			if(userList[i]==null){
				userList[i]=u;break;
			}
		}
	}
}
	