package cz.sohlich.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * ApplicationContextListener is a demo implementation of {@link ServletContextListener}
 * <p>
 * Created by Radomir Sohlich on 9/30/16.
 */
@WebListener
public class ApplicationContextListener implements ServletContextListener {

    Logger log = LoggerFactory.getLogger(ApplicationContextListener.class);

    @Override
    public void contextInitialized(ServletContextEvent ctx) {

        log.info("Registering servlet with context listener");
        ctx.getServletContext()
                .addServlet("ListenerServlet",
                        "cz.sohlich.servlet.ListenerServlet")
                .addMapping("/listener");


    }

    @Override
    public void contextDestroyed(ServletContextEvent ctx) {

    }
}
