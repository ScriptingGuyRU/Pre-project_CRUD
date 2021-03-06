package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

//@WebFilter(urlPatterns = "/user/*",
//        filterName = "userFilter",
//        description = "filter by user")
@WebFilter("/user/")
public class UserFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        final HttpServletRequest req = (HttpServletRequest) request;
        final HttpServletResponse resp = (HttpServletResponse) response;
        final HttpSession session = req.getSession();

        String userRole = (String) session.getAttribute("role");


        if (userRole.equals("user") || userRole.equals("admin")){
            chain.doFilter(request,response);
        } else {
            resp.sendRedirect("/logout");
        }

    }
}
