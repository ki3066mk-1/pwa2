import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PwaServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		System.out.println("doGet");
	}
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("doPost");
		res.setContentType("application/json");
	    res.setCharacterEncoding("utf-8");
	    res.getWriter().println("{ '\"speech\": \"hello\", \"displayText\": \"hello!\"}");
	}
}
