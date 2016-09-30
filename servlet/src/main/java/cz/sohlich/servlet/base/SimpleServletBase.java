package cz.sohlich.servlet.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Radomir Sohlich on 9/30/16.
 */
public abstract class SimpleServletBase extends HttpServlet {

    protected Logger log = LoggerFactory.getLogger(getClass());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        log.info("Receiving request");
        try (PrintWriter wr = resp.getWriter()) {
            wr.write(servletOutput());
        }
    }

    protected abstract String servletOutput();
}
