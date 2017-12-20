import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name="AdsServlet", urlPatterns="/ads")
public class AdsServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        // use the DaoFactory to get the AdsDao
        // use the .all method to get a list of ads
        Ads adDao = DaoFactory.getAdsDao();
        List<Ad> allAds=adDao.all();

        // pass the list of ads to the jsp
        // forward the request to a jsp
        request.setAttribute("allAds", allAds);
        request.getRequestDispatcher("/ads/index.jsp").forward(request, response);

    }

}
