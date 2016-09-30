package cz.sohlich.servlet;

import cz.sohlich.servlet.base.SimpleServletBase;

import javax.servlet.annotation.WebServlet;

/**
 * WelcomeServlet is used in web.xml descriptor as default page. See
 * welcome-file-list element.
 *
 * Created by Radomir Sohlich on 9/30/16.
 */
@WebServlet(name = "Welcome", urlPatterns = "/welcome")
public class WelcomeServlet extends SimpleServletBase {
    @Override
    protected String servletOutput() {
        return "Welcome to demo for A7ATJ - Servlet API";
    }
}
