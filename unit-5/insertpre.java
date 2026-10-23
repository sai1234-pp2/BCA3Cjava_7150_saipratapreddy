import java.sql.*;
import java.util.*;
class insertpre
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn=DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/javadb","root","");
		
			String sql="INSERT INTO stud2 (GRNo,Name) VALUES (?,?)";
			PreparedStatement pstmt= cn.prepareStatement(sql);
			Scanner sc=new Scanner(System.in);
			int GRNo=0;
			String Name="";
			System.out.println("Enter GRNo.");
			GRNo=sc.nextInt();
			System.out.println("Enter Name");
			Name=sc.next();
			
			pstmt.setInt(1,GRNo);
			pstmt.setString(2,Name);
			
			int x=pstmt.executeUpdate();
			System.out.println("Number of rows inseted: "+ x);
			
			cn.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

			