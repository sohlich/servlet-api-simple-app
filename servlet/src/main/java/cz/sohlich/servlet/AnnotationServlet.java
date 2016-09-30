package cz.sohlich.servlet;

import cz.sohlich.servlet.base.SimpleServletBase;

import javax.servlet.annotation.WebServlet;

/**
 * Created by Radomir Sohlich on 9/29/16.
 */
@WebServlet(name = "AnnotationServlet", urlPatterns = "/annotation")
public class AnnotationServlet extends SimpleServletBase {

    @Override
    protected String servletOutput() {
        return "annotation";
    }
}
