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
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
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
		String id=request.getParameter("id");
		String uname=request.getParameter("uname");
		String upwd=request.getParameter("upassword");
		String utruename=request.getParameter("utruename");
		String usex=request.getParameter("usex");
		String uage=request.getParameter("uage");
		String ufavor=String.join("_", request.getParameterValues("ufavor"));
		
		
		int result=0;
		
		BaseDao bd=new BaseDao();
			
		//执行sql操作
		String sql="update tuser set uname='"+uname
					+ "',upwd='"+upwd+"',uage='"+uage+"',usex='"
					+usex+"',ufavor='"+ufavor+"',utruename='"+utruename+"' where uid="+id;
			
		result = bd.update(sql);
			
		
		if(result>0)
		{
			response.sendRedirect("GetUserServlet");
		}
		else {
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out=response.getWriter();
			out.write("<script>alert('更新失败！');</script>");
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
