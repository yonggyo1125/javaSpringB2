package filters;

import jakarta.servlet.ServletRequest;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;

import java.io.UnsupportedEncodingException;

public class CommonRequestWrapper extends HttpServletRequestWrapper {
    
    public CommonRequestWrapper(ServletRequest request) throws UnsupportedEncodingException {
       super((HttpServletRequest)request);
       
       // 요청 전 공통 부분
        HttpServletRequest req = (HttpServletRequest) request;
        String method = req.getMethod().toUpperCase();
        if (method.equals("POST")) {
            req.setCharacterEncoding("UTF-8");
        }
    }

    @Override
    public String getParameter(String name) {
        String value = super.getParameter(name);

        return value == null? null : value.toUpperCase();
    }
}
