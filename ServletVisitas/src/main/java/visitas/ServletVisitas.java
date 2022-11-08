package visitas;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletVisitas")
public class ServletVisitas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Cookie visita = new Cookie("Visitas", "1");
        if( request.getCookies() != null) {
			for(Cookie cookie : request.getCookies())
				if(cookie.getName().equals("Visitas")) {
					visita = new Cookie("Visitas", (Integer.valueOf(Integer.parseInt(cookie.getValue()) + 1)).toString());
				}
        }
//        else {
//			visita = new Cookie("Visitas", (Integer.valueOf(Integer.parseInt(visita.getValue()) + 1)).toString());
//        }
        
		visita.setMaxAge(10);
		response.addCookie(visita);
        

		
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
        
        if( request.getCookies() != null) {
			for (Cookie cookie : request.getCookies())
				if(cookie.getName().equals("Visitas"))
					pw.println("<p>" + cookie.getName() + " : " + cookie.getValue() + "</p>");
		}
		else {
			pw.println("<p>" + visita.getName() + " : " + visita.getValue() + "</p>");
			visita = new Cookie("Visitas", (Integer.valueOf(Integer.parseInt(visita.getValue()) + 1)).toString());
		}
		
        pw.println("</body>\r\n"
        		+ "\r\n"
        		+ "</html>");
        
        pw.close();
	}

}
