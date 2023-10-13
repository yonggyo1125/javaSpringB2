package filters;

import jakarta.servlet.*;

import java.io.IOException;

public class FilterEx1 implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("FilterEx1");

        filterChain.doFilter(servletRequest, servletResponse);
    }
}
