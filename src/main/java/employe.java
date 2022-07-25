

import java.io.IOException;



import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class employe extends HttpServlet {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
	
	 
	//here we  have collected the response and send back as response . 
//	PrintWriter out;
//	out=res.getWriter();
//	out.println("result is "+sum);
//
//	 
//**here we have used request dispatcher interface to redirect to another servlet	 
//	 
//	 req.setAttribute("sum", sum);
//	 RequestDispatcher rd=req.getRequestDispatcher("sq");
//	 rd.forward(req, res);
//	 
		
	
	
	//-> session management  Declaring golbale varailbe that can be used throught the whole project and can be accessed any where in one session.
//	 HttpSession session=req.getSession();
//	 session.setAttribute("sum",sum);
	
	 
	 
		
		HttpSession session= req.getSession(); 
		String name=req.getParameter("name");
		String id=req.getParameter("id");
		session.setAttribute("name", name);
		session.setAttribute("id", id);
		

	
	
	
	}
	
	
}
		