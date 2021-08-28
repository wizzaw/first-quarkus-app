package com.nayki.quarkus;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class FizzBuzzPrinter {

    @ConfigProperty(defaultValue = "100", name = "application.fizzbuzz.maxvalue")
    int maxValue;

    private static final Logger LOG = Logger.getLogger(FizzBuzzPrinter.class);

    public void calculateAndPrint(){
        final int calculatedNumber = (int) (Math.random() * maxValue);
        LOG.info("Generated number" + calculatedNumber);
        if (calculatedNumber % 3 == 0)
            LOG.info("Fizz");
        if (calculatedNumber % 5 == 0)
            LOG.info("Buzz");
    }
}
