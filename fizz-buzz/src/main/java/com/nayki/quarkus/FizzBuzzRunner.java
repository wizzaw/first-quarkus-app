package com.nayki.quarkus;


import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import org.jboss.logging.Logger;

import javax.inject.Inject;

@QuarkusMain
public class FizzBuzzRunner implements QuarkusApplication {

    private static final Logger LOG = Logger.getLogger(FizzBuzzRunner.class);

    @Inject
    FizzBuzzPrinter printer;

    @Override
    public int run(String... args) throws Exception {
        LOG.info("Starting the Fizz Buzz application");
        printer.calculateAndPrint();
        LOG.info("Completing the start");
        return 0;
    }
}
/**
 * pLan s
 * */