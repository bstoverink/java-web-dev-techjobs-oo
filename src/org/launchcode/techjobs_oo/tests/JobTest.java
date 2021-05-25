package org.launchcode.techjobs_oo.tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;



public class JobTest {

    Job test_job1;
    Job test_job2;
    Job test_job3;
    Job test_job4;

    @Before
    public void createTestJobObjects() {
        test_job1 = new Job();
        test_job2 = new Job();
        test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job4 = new Job("", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }
 @Test
    public void testSettingJobId() {

        assertEquals(1, test_job2.getId() - test_job1.getId());
    }

 @Test
    public void testJobConstructorSetsAllFields() {

        assertTrue(test_job3 instanceof Job);
        assertEquals("Product tester", test_job3.getName());
        assertEquals("ACME", test_job3.getEmployer().getValue());
        assertEquals("Desert", test_job3.getLocation().getValue());
        assertEquals("Quality control", test_job3.getPositionType().getValue());
        assertEquals("Persistence", test_job3.getCoreCompetency().getValue());

 }

 @Test
    public void testJobsForEquality() {

        assertFalse(test_job1.equals(test_job2));
    }

 @Test
    public void shouldReturnJobStringWithBlankLinesBeforeAndAfter() {
    String newJobString = test_job3.toString();

    assertTrue(newJobString.startsWith("\n"));
    assertTrue(newJobString.endsWith("\n"));
 }

 @Test
    public void jobContainsLabelAndContentOnNewLinesForEachField() {
        String newJobString = test_job3.toString();

        assertTrue(newJobString.contains(
                "ID: " + test_job3.getId() + "\n" +
                "Name: " + test_job3.getName() + "\n" +
                "Location: " + test_job3.getLocation() + "\n" +
                "Employer: " + test_job3.getEmployer() + "\n" +
                "Position Type: " + test_job3.getPositionType() + "\n" +
                "Core Competency: " + test_job3.getCoreCompetency() + "\n"));
 }

    @Test
    public void emptyJobFieldPrintsNotAvailable() {
        String newJobString = test_job4.toString();

        assertTrue(newJobString.contains("Data not available"));
    }

 }


