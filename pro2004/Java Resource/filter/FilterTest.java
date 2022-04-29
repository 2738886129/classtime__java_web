package filter;

import java.io.IOException;
import java.rmi.ServerException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;

/**
 * Servlet Filter implementation class FilterTest
 */
@WebFilter(filterName = "./FilterTest",urlPatterns = {"*"})
public class FilterTest extends HttpFilter {
       
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * @see HttpFilter#HttpFilter()
     */
    public FilterTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @throws ServletException 
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServerException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		
		response.setContentType("text/html; charset=UTF-8");
		
		chain.doFilter(request, response);
//		System.out.println("FileterTest");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(Filter fConfig) throws ServerException {
		// TODO Auto-generated method stub
	}

}
