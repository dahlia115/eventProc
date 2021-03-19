package eventProc.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import eventProc.memberDTO.MemDTO;

public class DatabaseServiceImpl implements DatabaseService{
	
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String id = "jwoo";
	String pwd = "1234";

	public DatabaseServiceImpl() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public int saveMember(MemDTO dto) {
		String sql = "INSERT INTO saveMember(id,pw,name,gender,age,address) VALUES(?,?,?,?,?,?)";
		int result = 0;
		
		try {
			Connection con = DriverManager.getConnection(url,id,pwd);
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getPw());
			ps.setString(3, dto.getName());
			ps.setInt(4, dto.getGender());
			ps.setString(5, dto.getAge());
			ps.setString(6, dto.getAddr());
		
			result = ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public String loginCheck(String userId) {
		
		return null;
	}

}
