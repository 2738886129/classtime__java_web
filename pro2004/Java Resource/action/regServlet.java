package action;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import dao.BaseDao;

/**
 * Servlet implementation class regServlet
 */
@WebServlet("/regServlet")
public class regServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public regServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//接收数据
		String uname=request.getParameter("uname");
		String upwd=request.getParameter("upassword");
		String utruename=request.getParameter("utruename");
		String usex=request.getParameter("usex");
		String uage=request.getParameter("uage");
		String[] ufavor=request.getParameterValues("ufavor");
		String favor=String.join("_", ufavor);
		
		int result=0;
		
		BaseDao bd=new BaseDao();
			
		String sql="insert into tuser(uname,upwd,utruename,usex,uage,ufavor)"
					+ "values('"+uname+"','"+upwd+"','"+utruename+"','"+usex+"',"+uage+",'"+favor+"')";
			
		result=bd.update(sql);
		
		response.setContentType("text/html;sharset=utf-8");
		PrintWriter out=response.getWriter();
		if (result>0) {
			out.write("<script>alert('注册成功！');</script>");
			out.write("<script>location.href='login/login.jsp';</script>");
		}
		else {
			out.write("<script>alert('注册失败！');</script>");
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
