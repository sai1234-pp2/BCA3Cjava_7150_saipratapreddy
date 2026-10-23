import java.sql.*;
import java.util.*;
class Update
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn=DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/javadb","root","");
			Statement stmt=cn.createStatement();
			Scanner sc=new Scanner(System.in);
			int GRNo=0;
			String Name="";
			System.out.println("Enter GRNo.for which you want to change the Name");
			GRNo=sc.nextInt();
			System.out.println("Enter new Name");
			Name=sc.next();
			try{
				int x=stmt.executeUpdate("Update into stud Name='"+Name+"'where GRNo="+GRNo);
				System.out.println("No of row Affected :"+x);
			}
			catch(Exception e)
			{
				System.out.println("Exception :"+e);
			}
			cn.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
