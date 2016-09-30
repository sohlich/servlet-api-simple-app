package cz.sohlich.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import java.util.Set;

/**
 * Created by Radomir Sohlich on 9/29/16.
 */
public class ApplicationInitializer implements ServletContainerInitializer {

    Logger log = LoggerFactory.getLogger(ApplicationInitializer.class);

    @Override
    public void onStartup(Set<Class<?>> set, ServletContext ctx) throws
            ServletException {

        log.info("######### APPLICATION CONFIG ##########");

        ctx.addServlet("InitializerServlet",
                "cz.sohlich.servlet.InitializerServlet")
                .addMapping("/initializer");

        log.info("InitializerServlet registered");

        ctx.addFilter("InitializerFilter", "cz.sohlich.filter" +
                ".InitializerFilter").addMappingForUrlPatterns(null, true,
                "/*");

        log.info("InitializerFilter registered");

    }
}
