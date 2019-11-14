import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author xueleixi
 * @date 2019-11-14 10:30
 */
public class TestRequest extends HttpServlet
{
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
  {
    String path = req.getContextPath();
    System.out.println("path=" + path);
    resp.getWriter().println(req.getParameter("a"));
    String[] values = req.getParameterValues("a");
    System.out.println(Arrays.toString(values));
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
  {
    doGet(req, resp);
  }
}
