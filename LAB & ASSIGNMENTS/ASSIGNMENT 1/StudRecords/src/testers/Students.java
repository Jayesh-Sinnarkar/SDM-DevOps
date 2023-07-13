package testers;
import static utils.DBUtils.openConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Student {
	
	
	private int rollNo;
	private String name;
	private String course;

	

	public Student(int rollNo, String name, String course) {
		
		this.rollNo = rollNo;
		this.name = name;
		this.course = course;
	}



	public static void main(String[] args) {
		Connection cn = openConnection();
		PreparedStatement pst1 = cn.prepareStatement("select * from students");
		
List<Student> studs = new ArrayList<>();
		
		try (ResultSet rst = pst1.executeQuery()) {
			
			while (rst.next())
				studs.add(new Student(rst.getInt(1), rst.getString(2), 
						rst.getString(3)));
		}
		
		//print list using foreach

	}
	
	


}
