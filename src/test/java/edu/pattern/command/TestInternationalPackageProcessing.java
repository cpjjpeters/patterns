package edu.pattern.command;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestInternationalPackageProcessing {

    @Test
    public void test() {


        // Create an InternationalPackageProcessing class that allows handling international orders
        // The class must allow to process all orders except those going to Mordor

        // Uncomment the code and run the test


        PackageProcessing processKO = new InternationalPackageProcessing(new InternationalPackage("Mordor", 100));
        assertFalse(processKO.process());

        PackageProcessing processOK = new InternationalPackageProcessing(new InternationalPackage("The Shire", 100));
        assertTrue(processOK.process());


    }

}
