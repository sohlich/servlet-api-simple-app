package cz.sohlich.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import java.util.Set;

/**
 * ApplicationInitializer is demo implementation of
 * {@link ServletContainerInitializer} interface.
 * The implementation must be also exposed via
 * META-INF/services/javax.servlet.ServletContainerInitializer
 * file.
 *
 * Created by Radomir Sohlich on 9/29/16.
 */
public class ApplicationInitializer implements ServletContainerInitializer {

    Logger log = LoggerFactory.getLogger(ApplicationInitializer.class);

    @Override
    public void onStartup(Set<Class<?>> set, ServletContext ctx) throws
            ServletException {

        log.info("######### APPLICATION CONFIG ##########");

        //Servlet registration
        ctx.addServlet("InitializerServlet",
                "cz.sohlich.servlet.InitializerServlet")
                .addMapping("/initializer");

        //Filter registration
        FilterRegistration.Dynamic filter = ctx.addFilter("InitializerFilter",
                "cz.sohlich.filter.InitializerFilter");
        filter.addMappingForUrlPatterns(null, true, "/*");
        filter.setAsyncSupported(true);


    }
}
