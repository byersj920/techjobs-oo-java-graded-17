package org.launchcode.techjobs.oo;

import org.junit.Test;

import static java.lang.System.lineSeparator;
import static org.junit.Assert.*;

public class JobTest {
    @Test
    public void testSettingJobId(){
        Job BerryPicking = new Job();
        Job ApplePicking = new Job();
        assertNotEquals(BerryPicking, ApplePicking);
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job ProductTester = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        //Class checking tests
        assertTrue(ProductTester.getEmployer() instanceof Employer);
        assertTrue(ProductTester.getLocation() instanceof Location);
        assertTrue(ProductTester.getPositionType() instanceof PositionType);
        assertTrue(ProductTester.getCoreCompetency() instanceof CoreCompetency);
        assertTrue(ProductTester instanceof Job);

        //Value Checking Tests
        assertEquals(ProductTester.getName(), "Product tester");
        assertEquals(ProductTester.getLocation().getValue(), "Desert");
        assertEquals(ProductTester.getEmployer().getValue(), "ACME");
        assertEquals(ProductTester.getPositionType().getValue(), "Quality control");
        assertEquals(ProductTester.getCoreCompetency().getValue(), "Persistence");
    }

    @Test
    public void testJobsForEquality(){
        Job BerryPicking = new Job();
        Job ApplePicking = new Job();
        assertNotEquals(BerryPicking, ApplePicking);
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job BerryPicking = new Job("Berry Picker", new Employer("Grape.inc"),
                new Location("West Farmlands"), new PositionType("Professional Forager"),
                new CoreCompetency("Doesn't eat product"));
        assertTrue(BerryPicking.toString().startsWith("\n"));
        assertTrue(BerryPicking.toString().endsWith("\n"));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job BerryPicking = new Job("Berry Picker", new Employer("Grapes Inc."),
                new Location("West Farmlands"), new PositionType("Professional Forager"),
                new CoreCompetency("Doesn't eat product"));
        assertEquals(BerryPicking.toString(), "\nID: 4\n"+
                "Name: Berry Picker\n"+
                "Employer: Grapes Inc.\n"+
                "Location: West Farmlands\n"+
                "Position Type: Professional Forager\n"+
                "Core Competency: Doesn't eat product\n");
    }

    @Test
    public void testToStringHandlesEmptyField(){
        Job BerryPicking = new Job("Berry Picker", new Employer(""),
                new Location("West Farmlands"), new PositionType("Professional Forager"),
                new CoreCompetency("Doesn't eat product"));
        assertEquals(BerryPicking.toString(), "\nID: 3\n"+
                "Name: Berry Picker\n"+
                "Employer: Data not available\n"+
                "Location: West Farmlands\n"+
                "Position Type: Professional Forager\n"+
                "Core Competency: Doesn't eat product\n");
    }
}
