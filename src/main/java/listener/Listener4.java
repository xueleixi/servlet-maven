package listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

/**
 * @author xueleixi
 * @date 2019-11-14 15:29
 */
public class Listener4 implements ServletRequestAttributeListener
{
  @Override
  public void attributeAdded(ServletRequestAttributeEvent srae)
  {
    System.out.println("ServletRequestAttributeListener added");
  }

  @Override
  public void attributeRemoved(ServletRequestAttributeEvent srae)
  {

  }

  @Override
  public void attributeReplaced(ServletRequestAttributeEvent srae)
  {

  }
}
