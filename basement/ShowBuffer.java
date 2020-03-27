public class ShowBuffer{
	public String record[];
	
	public ShowBuffer(int s){
		record=new String[s];
	}
	public void addData(String s,int idx){
			record[idx]=s;
	}
	public void addData(String s){
		for(int i=0;i<record.length;i++){
			if(record[i]==null){
				record[i]=s;
				break;
			}
		}
	}
	public void deleteData(int idx){
			record[idx]=null;
	}
	public void loadNames(String sql){
		try{
			DataAccess da=new DataAccess();
			ResultSet rs=da.getData(sql);
			while(rs.next()){
				addData(rs.getString("name"));
				addData(rs.getString("phone"));
				addData(rs.getString("address"));
				addData(rs.getString("address"));
				addData(rs.getString("dob"));
				addData(rs.getString("salary"));
				addData(rs.getString("gender"));
				addData(rs.getString("doj"));
				addData(rs.getString("email"));
				addData(rs.getString("dept"));
				addData(rs.getString("ms"));
				addData(rs.getString("bg"));
			}
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
	public void showNames(Label l){
		printAll();
		String s="";
		for(String r:record){
			if(r!=null){
				s=s+r+",";
			}
		}
		l.setText(s);
	}
	public void printAll(){
		for(String r:record){
			if(r!=null){
				System.out.println(r);
			}
		}
	}
}