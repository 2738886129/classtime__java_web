package action;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import dao.BaseDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		String name=request.getParameter("uname");
		String passerword=request.getParameter("upassword");
		
		
		
		boolean label=false;//是否存在该数据的标志量
		try {
			BaseDao bd=new BaseDao();
			
			String sql="Select uname,upwd from tuser where uname='"
					+ name +"'and upwd='"+passerword+"'";
			ResultSet rs=bd.getDate(sql);
			//检查结果
			if(rs.next())
			{
				label=true;
			}
			//关闭资源
			bd.closeResource(null, null, rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//		if("尚宇航".equals(name) && "1111".equals(passerword))
		if (label)
		{
			HttpSession session=request.getSession();
			session.setAttribute("uname",name);
//			response.sendRedirect("login/result.jsp");
			
			response.sendRedirect("GetUserServlet");
		}
		else
		{
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out=response.getWriter();
			out.write("<script>alert('用户名或密码错误！');</script>");
 			out.write("<script>history.go(-1);</script>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
