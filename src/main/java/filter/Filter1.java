package filter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * @author xueleixi
 * @date 2019-11-14 15:29
 */
public class Filter1 implements Filter
{
  @Override
  public void init(FilterConfig filterConfig) throws ServletException
  {
    System.out.println("filter init");
  }

  @Override
  public void doFilter(
      ServletRequest request, ServletResponse response, FilterChain chain
  ) throws IOException, ServletException
  {
    System.out.println("doFilter before");
    chain.doFilter(request,response);
    System.out.println("doFilter after");
  }

  @Override
  public void destroy()
  {
    System.out.println("filter destroy");
  }
}
