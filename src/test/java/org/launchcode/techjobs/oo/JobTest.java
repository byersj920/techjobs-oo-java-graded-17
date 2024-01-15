package org.launchcode.techjobs.oo;

import org.junit.Test;

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
}
