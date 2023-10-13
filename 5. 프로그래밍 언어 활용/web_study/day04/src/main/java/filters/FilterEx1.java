package filters;

import jakarta.servlet.*;

import java.io.IOException;

public class FilterEx1 implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("FilterEx1 - 요청 전");

        filterChain.doFilter(servletRequest, servletResponse);

        System.out.println("FilterEx1 - 응답 후");
    }
}
