package CSBS.Batch2;
import java.sql.*;
import java.util.Scanner;

public class JdbcConnection{
	public static void main(String args[]) {
		String url="jdbc:mysql://localhost:3306/student";
		String username="root";
		String password="";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,username,password);
			System.out.println("Connected");
			
//			1.read operations
//			String query="Select * from person";
//			PreparedStatement ps = con.prepareStatement(query);
//			ResultSet rs=ps.executeQuery();
//			while(rs.next()) {
//				String s=rs.getString("name");
//				System.out.println(s);
//				System.out.println(rs.getString(3)); 
//				
//			}
//			
//			2.create operations
//			Scanner sc=new Scanner(System.in);
//			String names=sc.next();
//			int ages=sc.nextInt();
//			int heights=sc.nextInt();
//			String cities= sc.next();
//			String fav_color=sc.next();
//			String query="Insert into person(name,age,height,city,favorite_color) values(?,?,?,?,?)";
//			PreparedStatement ps = con.prepareStatement(query);
//			ps.setString(1, names);
//			ps.setInt(2,ages);
//			ps.setInt(3, heights);
//			ps.setString(4, cities);
//			ps.setString(5, fav_color);
//			int rows = ps.executeUpdate();
//
//			if (rows > 0) {
//			    System.out.println("Data Inserted Successfully");
//			}
			
//			3.updates operations
//			Scanner sc=new Scanner(System.in);
//			String names=sc.next();
//			int id=sc.nextInt();
//			String query="Update  person SET name= ? where Persons_id= ?";
//			PreparedStatement ps=con.prepareStatement(query);
//			ps.setString(1,names);
//			ps.setInt(2, id);
//			int row=ps.executeUpdate();
//			if(row>0) {
//				System.out.println("Updated exisiting datas");
//			}
			
//           4.Delete operation
//			Scanner sc=new Scanner(System.in);
//			int id=sc.nextInt();
//			String query="Delete from person where Persons_id= ?";
//			
//			PreparedStatement ps=con.prepareStatement(query);
//			ps.setInt(1, id);
//			int row=ps.executeUpdate();
//			if(row==1) {
//				System.out.println("Delete successs");
//			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}