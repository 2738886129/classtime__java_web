package action;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import dao.BaseDao;
import entity.User;

/**
 * Servlet implementation class GetCurUser
 */
@WebServlet("/GetCurUser")
public class GetCurUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetCurUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String id=request.getParameter("id");
		
		User user=null;
		try {
			BaseDao bd=new BaseDao();
			String sql="Select * from tuser where uid ="+id;
			ResultSet rs=bd.getDate(sql);
			user = new User();
			if(rs.next())
			{
				user.setId(rs.getInt("uid"));
				user.setUname(rs.getString("uname"));
				user.setUpwd(rs.getString("upwd"));
				user.setTruename(rs.getString("utruename"));
				user.setUage(rs.getInt("uage"));
				user.setUsex(rs.getString("usex"));
				user.setUfavor(rs.getString("ufavor"));
			}
			//?ر???Դ
			bd.closeResource(null, null, rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		HttpSession ses=request.getSession();
		ses.setAttribute("user", user);
		response.sendRedirect("login/update.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
