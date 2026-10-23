import java.sql.*;
import java.util.*;
class Deletepre
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn=DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/javadb","root","");
			String sql = "DELETE FROM stud2 WHERE GRNo = ?";
			 PreparedStatement pstmt=cn.prepareStatement(sql);
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter GRNo.for the  record which you want to delete ");
			 int GRNo=sc.nextInt();
			 
			 pstmt.setInt(1, GRNo);
			
				int x=pstmt.executeUpdate();
				System.out.println("No of Rows Affected :"+x);
			
			cn.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}