package cookie;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletCookie")
public class ServletCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		for (Map.Entry<String, String[]> parametro : request.getParameterMap().entrySet()) {
			Cookie cookie;
			
			if (Arrays.asList(parametro.getValue()).size() == 1)
				cookie = new Cookie(parametro.getKey(), Arrays.asList(parametro.getValue()).get(0).toString());
			else
				cookie = new Cookie(parametro.getKey(), Arrays.asList(parametro.getValue()).toString());
				
			cookie.setMaxAge(24*60*60);
			response.addCookie(cookie);
		}

		PrintWriter pw = response.getWriter();

        pw.println("<!DOCTYPE html>\r\n"
         		+ "<html lang=\"en\">\r\n"
         		+ "\r\n"
         		+ "<head>\r\n"
         		+ "    <title></title>\r\n"
         		+ "    <meta charset=\"UTF-8\">\r\n"
         		+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n"
         		+ "    <link href=\"css/style.css\" rel=\"stylesheet\">\r\n"
         		+ "</head>\r\n"
         		+ "\r\n"
         		+ "<body>\r\n");
        
		for (Cookie cookie : request.getCookies()) {
			pw.println("<p>" + cookie.getName() + " : " + cookie.getValue() + "</p>");
		}
		
        pw.println("</body>\r\n"
        		+ "\r\n"
        		+ "</html>");

		pw.close();
	}
}
