package example;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloWorldServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        String name = request.getParameter("name");
        if (name == null || name.isEmpty()) {
            name = "Freewind";
        }
        request.setAttribute("name", name);
        request.getRequestDispatcher("/WEB-INF/pages/hello.jsp").forward(request, response);
    }

}
