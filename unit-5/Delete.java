import java.sql.*;
import java.util.*;
class Delete
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
			System.out.println("Enter GRNo.for record which you want to delete ");
			GRNo=sc.nextInt();
			try{
				int x=stmt.executeUpdate("Delete from  stud where GRNo="+GRNo);
				System.out.println("No of Rows Affected :"+x);
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