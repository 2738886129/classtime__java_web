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
import java.util.ArrayList;
import java.util.List;

import dao.BaseDao;
import entity.User;

/**
 * Servlet implementation class GetUserServlet
 */
@WebServlet("/GetUserServlet")
public class GetUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		List<User> ulist=null;
		try {
			BaseDao bd=new BaseDao();
			//ִ��sql����
			String sql="Select * from tuser";
			ResultSet rs=bd.getDate(sql);
			
			//ÿ�����ݱ��浽�����У�����ŵ������ж�Ӧ���ݱ�
			
			ulist = new ArrayList<User>();
			while (rs.next()) {
				User user=new User();
				user.setId(rs.getInt(1));
				user.setUname(rs.getString("uname"));
				user.setUpwd(rs.getString("upwd"));
				user.setTruename(rs.getString("utruename"));
				user.setUage(rs.getInt("uage"));
				user.setUsex(rs.getString("usex"));
				user.setUfavor(rs.getString("ufavor"));
				
				ulist.add(user);
			}
			
			//�ر���Դ
			bd.closeResource(null, null, rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//�Ѷ��󼯺Ϸ���session
		HttpSession ses=request.getSession();
		
		ses.setAttribute("users", ulist);
		response.sendRedirect("login/result.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
