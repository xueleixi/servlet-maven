package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author xueleixi
 * @date 2019-11-14 15:24
 */
public class Listener1 implements ServletContextListener
{
  @Override
  public void contextInitialized(ServletContextEvent sce)
  {
    System.out.println("TestServletContextListener initialize");
  }

  @Override
  public void contextDestroyed(ServletContextEvent sce)
  {
    System.out.println("TestServletContextListener destroy");
  }
}
