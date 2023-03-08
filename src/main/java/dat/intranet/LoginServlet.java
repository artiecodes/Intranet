package dat.intranet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // We receive request values
        String login = request.getParameter("login");
        String pass = request.getParameter("password");

        //TODO check login+password exists in DB

        // Save the request value in the request object
        request.setAttribute("login", login);
        // We send the request values forward
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
