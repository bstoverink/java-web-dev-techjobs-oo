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

    @Before
    public void createTestJobObjects(){
        test_job1 = new Job();
        test_job2 = new Job();
        test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

 @Test
    public void testSettingJobId() {

        assertEquals(1, test_job2.getId() - test_job1.getId());
    }

 @Test
    public void testJobConstructorSetsAllFields() {

        assertTrue(test_job3 instanceof Job);
        assertEquals("Product tester", test_job3.getName());
        assertEquals("ACME", test_job3.getEmployer());
        assertEquals("Desert", test_job3.getLocation());
        assertEquals("Quality control", test_job3.getPositionType());
        assertEquals("Persistence", test_job3.getCoreCompetency());

 }

 @Test
    public void testJobsForEquality() {

        assertFalse(test_job1.equals(test_job2));
    }

 @Test
    public void testToStringMethod() {


 }

 }


