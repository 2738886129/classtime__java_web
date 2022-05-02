package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaseDao {
	public static String url="jdbc:mysql://localhost:3306/authsystem-2004?useUnicode=true&characterEncoding=UTF-8";
	public static String db_name="root";
	public static String db_pwd="1234";
	
	public Connection getCon()throws Exception{
		Class.forName("con.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(url,db_name,db_pwd);
		
		return con;
	}
	
	public int update(String sql) {
		
		int result=0;
		try {
			Connection con =getCon();
			PreparedStatement preparedStatement=con.prepareStatement(sql);
			result = preparedStatement.executeUpdate();
			preparedStatement.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public List<Map> getDate(String sql) {
		List<Map> rList=new ArrayList<Map>();
		try {
			Connection con =getCon();
			PreparedStatement pstmt =con.prepareStatement(sql);
			ResultSet rs =pstmt.executeQuery();
			
			ResultSetMetaData mdata= rs.getMetaData();//获取表头
			int count =mdata.getColumnCount();//获取列数
			while (rs.next()) {
				Map row=new HashMap();
				for(int i=0;i<count;i++){
					row.put(mdata.getColumnClassName(i), rs.getObject(i));
				}
				rList.add(row);
			}
			rs.close();
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rList;
	}
}
