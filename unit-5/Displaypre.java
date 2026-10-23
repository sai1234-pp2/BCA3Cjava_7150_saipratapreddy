import java.sql.*;
import java.util.*;
class Displaypre
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn=DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/javadb","root","");
		
			String sql="SELECT *FROM stud2";
			PreparedStatement pstmt= cn.prepareStatement(sql);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt("GRNo")+" "+rs.getString("Name"));
			}
			
			
			
			cn.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

			