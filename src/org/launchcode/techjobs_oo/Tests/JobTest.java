package org.launchcode.techjobs_oo.Tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    Job testJob1;
    Job testJob2;
    Job testJobFiveArg;
    Job testJobToString;
    Job testJobEmptyFields;

    @Before
    public void setUp() {
        testJob1 = new Job();
        testJob2 = new Job();
        testJobFiveArg = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        testJobToString = new Job("Validation engineer", new Employer("MilliporeSigma"), new Location("Saint Louis"), new PositionType("Validation"), new CoreCompetency("Attention to Detail"));
        testJobEmptyFields = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
    }

    @After
    public void tearDown() {
        testJob1 = null;
        testJob2 = null;
        testJobFiveArg = null;
        testJobToString = null;
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
        assertEquals(testJob2.getId() + 1, testJobFiveArg.getId());
        assertEquals("Product tester", testJobFiveArg.getName());
        assertEquals("ACME", testJobFiveArg.getEmployer().toString());
        assertEquals("Desert", testJobFiveArg.getLocation().toString());
        assertEquals("Quality control", testJobFiveArg.getPositionType().toString());
        assertEquals("Persistence", testJobFiveArg.getCoreCompetency().toString());

    }

    @Test
    public void testJobsForEquality() {
        Job testJob1 = new Job();
        Job testJob2 = new Job();
        assertFalse(testJob1.equals(testJob2));
    }

   @Test
   public void testJobsToStringBlankLinesBeforeAfter() {
        assertEquals('\n', testJobToString.toString().charAt(0));
        assertTrue(testJobToString.toString().endsWith("\n"));
   }

   @Test
    public void testJobsToStringLabelValue() {
        assertTrue(testJobToString.toString().contains("ID: " + testJobToString.getId() + "\n"));
        assertTrue(testJobToString.toString().contains("Name: " + testJobToString.getName() + "\n"));
        assertTrue(testJobToString.toString().contains("Employer: " + testJobToString.getEmployer() + "\n"));
        assertTrue(testJobToString.toString().contains("Location: " + testJobToString.getLocation() + "\n"));
        assertTrue(testJobToString.toString().contains("Position Type: " + testJobToString.getPositionType() + "\n"));
        assertTrue(testJobToString.toString().contains("Core Competency: " + testJobToString.getCoreCompetency() + "\n"));
    }

    @Test
    public void testJobsToStringEmptyFieldResponse() {
        assertTrue(testJobEmptyFields.toString().contains("Name: " + "Data not available" + "\n"));
        assertTrue(testJobEmptyFields.toString().contains("Employer: " + "Data not available" + "\n"));
        assertTrue(testJobEmptyFields.toString().contains("Location: " + "Data not available" + "\n"));
        assertTrue(testJobEmptyFields.toString().contains("Position Type: " + "Data not available" + "\n"));
        assertTrue(testJobEmptyFields.toString().contains("Core Competency: " + "Data not available" + "\n"));
    }
}
