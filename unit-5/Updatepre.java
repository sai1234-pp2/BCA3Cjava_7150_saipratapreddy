import java.sql.*;
import java.util.*;
class Updatepre
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn=DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/javadb","root","");
			
			String sql= "UPDATE stud2 SET Name =? WHERE GRNo =?";
			PreparedStatement pstmt =cn.prepareStatement(sql);
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter GRNo.for which you want to change the Name:");
			 int GRNo=sc.nextInt();
			System.out.println("Enter new Name");
			 String Name=sc.next();
			 
			 pstmt.setString(1, Name);
			 pstmt.setInt(2, GRNo);
			 
			
			
				int x=pstmt.executeUpdate();
				System.out.println("No of Rows Affected :"+x);
				
				cn.close();
		}
		catch (Exception e)
				{
					System.out.println("Error:"+e);
			}
		}
	}

		

		
		
	

