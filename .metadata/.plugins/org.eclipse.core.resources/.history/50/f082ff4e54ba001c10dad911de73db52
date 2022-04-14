package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseDao {
	public ResultSet getDate(String sql)
	{
		ResultSet rs=null;
		
		try {
			Connection con=getCon();
			//创建状态集
			Statement stmt=con.createStatement();
			//执行sql操作
			rs=stmt.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rs;
	}
	
	public int update(String sql)
	{
		int result =0;
		
		try {
			Connection con=getCon();
			//创建状态集
			Statement stmt=con.createStatement();
			
			//执行sql操作
			result = stmt.executeUpdate(sql);
			
			//关闭资源
			stmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
	public void closeResource(Connection con,Statement stmt,ResultSet rs)
	{
		try {
			if (con!=null&&!con.isClosed()) {
				con.close();
			}
			if (stmt!=null&&!stmt.isClosed()) {
				stmt.close();
			}
			if(rs!=null&&!rs.isClosed())
			{
				rs.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	Connection getCon()
	{
		Connection con=null;
		
		try {
			//加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			//创建数据库连接
			String db_name="jdbc:mysql://localhost:3306/db_2004?useUnicode=true&characterEncoding=UTF-8";
			String db_username="root";
			String db_pwd="1234";
			con=DriverManager.getConnection(db_name,db_username,db_pwd);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
}
