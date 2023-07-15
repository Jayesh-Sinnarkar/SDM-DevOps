package testers;
import static utils.DBUtils.openConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Students {
	
	
	private int rollNo;
	private String name;
	private String course;

	

	public Students(int rollNo, String name, String course) {
		
		this.rollNo = rollNo;
		this.name = name;
		this.course = course;
	}
	
	



	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", course=" + course + "]";
	}

	public static void main(String[] args) {
		String url = "jdbc:mysqldb://localhost:3306/advjava?createDatabaseIfNotExist=true&useSSL=false&allowPublicKeyRetrieval=true";
		try {
			Connection cn = DriverManager.getConnection(url, "root", "root");
			PreparedStatement pst1 = cn.prepareStatement("select * from students");
		
			List<Students> studs = new ArrayList<>();
		
			try (ResultSet rst = pst1.executeQuery()) {
			
			while (rst.next())
				studs.add(new Students(rst.getInt(1), rst.getString(2), 
						rst.getString(3)));
		}
		//print list using foreach
		for(Students s: studs)
				System.out.println(s);
		
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
	


}
