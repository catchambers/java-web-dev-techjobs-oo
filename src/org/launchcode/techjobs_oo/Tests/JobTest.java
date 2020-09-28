package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    Job testJob1;
    Job testJob2;
    Job testJobFiveArg;

    @Before
    public void initializeJobObjects() {
        testJob1 = new Job();
        testJob2 = new Job();
        testJobFiveArg = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void testSettingJobId() {
        assertEquals(1, testJob2.getId() - testJob1.getId(), 0);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        //Check classes correctly assigned
        assertTrue(testJobFiveArg.getName() instanceof String);
        assertTrue(testJobFiveArg.getEmployer() instanceof Employer);
        assertTrue(testJobFiveArg.getLocation() instanceof Location);
        assertTrue(testJobFiveArg.getPositionType() instanceof PositionType);
        assertTrue(testJobFiveArg.getCoreCompetency() instanceof CoreCompetency);

        //Check values correctly assigned
        assertEquals(3, testJobFiveArg.getId());
        assertEquals("Product tester", testJobFiveArg.getName());
        assertEquals("ACME", testJobFiveArg.getEmployer().toString());
        assertEquals("Desert", testJobFiveArg.getLocation().toString());
        assertEquals("Quality control", testJobFiveArg.getPositionType().toString());
        assertEquals("Persistence", testJobFiveArg.getCoreCompetency().toString());

    }

    @Test
    public void testJobsForEquality() {
        assertFalse(testJob1.equals(testJob2));
    }
}
