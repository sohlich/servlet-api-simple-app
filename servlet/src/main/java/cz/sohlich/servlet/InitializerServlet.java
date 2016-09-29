package cz.sohlich.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Radomir Sohlich on 9/29/16.
 */
public class InitializerServlet extends HttpServlet {

    Logger log = LoggerFactory.getLogger(InitializerServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        log.info("Receiving request");
        try (PrintWriter wr = resp.getWriter()) {
            wr.write("initializer");
        }
    }
}
