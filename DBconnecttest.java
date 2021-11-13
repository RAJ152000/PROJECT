
import java.sql.*;
import java.util.*;
import java.util.Date;
public class DBconnecttest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=DBconnects.getDBconnects();
		try
		{
			PreparedStatement pst=con.prepareStatement("select * from studentsw");
		
		ResultSet rs=pst.executeQuery();
		ArrayList<Integer> ob=new ArrayList<Integer>();
		ArrayList<String> ob1=new ArrayList<String>();
		ArrayList<Date> ob2=new ArrayList<Date>();
		ArrayList<String> ob3=new ArrayList<String>();
	
		while(rs.next())
		{
		ob.add(rs.getInt("sid"));
		ob1.add(rs.getString("name"));
		ob2.add(rs.getDate("dob"));
		ob3.add(rs.getString("dept"));

		
		}
		int i=ob2.indexOf(Collections.min(ob2));
		System.out.println(ob.get(i)+"\t"+ob1.get(i)+"\t"+ob2.get(i)+"\t"+ob3.get(i));
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}
		finally
		{
		
			
			
			System.out.println("Exception handled and connection close");
		}
		

	}

}
