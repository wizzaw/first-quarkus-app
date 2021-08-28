package com.nayki.quarkus;

import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.jboss.logging.Logger;


@QuarkusMain
public class CommandRunner implements QuarkusApplication {

    private static final Logger LOG = Logger.getLogger(CommandRunner.class);

    @ConfigProperty(defaultValue="Students", name = "application.greeting.recipient")
     String recipient;

    @Override
    public int run(String... args) throws Exception {
        LOG.info("Starting application");
        System.out.println("Hello " + recipient);
        LOG.info("Completing application");
        return 0;
    }
}
