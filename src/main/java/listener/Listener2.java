package listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

/**
 * @author xueleixi
 * @date 2019-11-14 15:26
 */
public class Listener2 implements ServletContextAttributeListener
{
  @Override
  public void attributeAdded(ServletContextAttributeEvent scab)
  {
    System.out.println("ServletContextAttributeListener attr added");
  }

  @Override
  public void attributeRemoved(ServletContextAttributeEvent scab)
  {

  }

  @Override
  public void attributeReplaced(ServletContextAttributeEvent scab)
  {

  }
}
