package filter;

import model.User;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by andr_ on 24.09.2017.
 */
@WebFilter(filterName = "AdminFilter", urlPatterns = "/adminPages/startAdminp.jsp, /startAdmin")
public class AdminFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        User user = (User) request.getSession().getAttribute("user");
        if(user != null && user.getRole().equals(User.AccessRight.valueOf("Admin"))){
            chain.doFilter(req, resp);
        } else{
            request.getSession().setAttribute("url", request.getRequestURI());
            request.getSession().setAttribute("message", "You have to be an admin!");
            response.sendRedirect(request.getContextPath() + "/logform.jsp");
        }

    }

    public void init(FilterConfig config) throws ServletException {

    }

}
