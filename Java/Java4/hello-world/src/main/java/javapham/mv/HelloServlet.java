package javapham.mv;
import java.io.IOException;
import javax.annotation.WebServlet;
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException {
        response.getWriter().write("<h1>Hello</h1>");
    }
}
