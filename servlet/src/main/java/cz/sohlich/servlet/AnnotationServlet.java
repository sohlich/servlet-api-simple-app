package cz.sohlich.servlet;

import cz.sohlich.servlet.base.SimpleServletBase;

import javax.servlet.annotation.WebServlet;

/**
 * The most simpliest registration of servlet
 * by annotation {@link WebServlet}.
 *
 * Created by Radomir Sohlich on 9/29/16.
 */
@WebServlet(name = "AnnotationServlet", urlPatterns = "/annotation")
public class AnnotationServlet extends SimpleServletBase {

    @Override
    protected String servletOutput() {
        return "annotation";
    }
}
