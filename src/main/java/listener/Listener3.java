package listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * @author xueleixi
 * @date 2019-11-14 15:28
 */
public class Listener3 implements ServletRequestListener
{
  @Override
  public void requestDestroyed(ServletRequestEvent sre)
  {
    System.out.println("ServletRequestListener request destroyed");
  }

  @Override
  public void requestInitialized(ServletRequestEvent sre)
  {

    System.out.println("ServletRequestListener request initilize");
  }
}
