import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



@WebServlet(name = "HelloWorld", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
        int counter = 0;
    protected void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException {
            counter += 1;
            String name = req.getParameter("name");
            res.getWriter().println("Hello," + name);
            res.getWriter().println(counter);

    }
}
