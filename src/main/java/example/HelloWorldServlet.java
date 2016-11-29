package example;

import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        String name = request.getParameter("name");
        if (StringUtils.isEmpty(name)) {
            name = "Freewind";
        }
        request.setAttribute("name", name);
        request.getRequestDispatcher("/WEB-INF/pages/hello.jsp").forward(request, response);
    }

}
