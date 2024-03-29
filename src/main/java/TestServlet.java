

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/test")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String data = request.getParameter("data");
	      response.setContentType( "text/html; charset=UTF-8" );
	      PrintWriter out = response.getWriter();
	      out.println("""
	              <html><head></head>
	              <body>
	              <h1>こんにちは、世界！</h1>
	              <h2>%s</h2>
	              </body></html>
	              """.formatted(data));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      request.setCharacterEncoding("UTF-8");
	      String data = request.getParameter("data");
	      response.setContentType( "text/html; charset=UTF-8" );
	      PrintWriter out = response.getWriter();
	      out.println("""
	              <html><head></head>
	              <body>
	              <h1>こんにちは、世界！</h1>
	              <h2>%s</h2>
	              </body></html>
	              """.formatted(data));
	}

}
