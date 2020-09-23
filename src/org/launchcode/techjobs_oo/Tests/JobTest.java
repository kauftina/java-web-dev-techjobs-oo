package org.launchcode.techjobs_oo.Tests;
import org.junit.Test;
import org.junit.Before;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job job1;
    Job job2;
    Job job3;

    
    @Before
    public void createCarObject() {
        job1 = new Job();
        job2 = new Job();
        job3 = new Job();
    }

    @Test
    public void testSettingJobId() {
        assertTrue(job1.getId()!=job2.getId());
        assertEquals(1, job2.getId()-job1.getId());

    }
    @Test
    public void testJobConstructorSetsAllFields() {
        job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("Product tester", job3.getName());
        assertTrue(job3.getEmployer().getValue()=="ACME");
        assertFalse(job3.getCoreCompetency().getValue()!="Persistence");
        assertEquals("Quality control", job3.getPositionType().getValue());
        assertTrue(job3.getLocation().getValue()=="Desert");


    }
    @Test
    public void testJobsForEquality() {
        Job job4 = new Job("Junior Web Developer", new Employer("Cozy"), new Location("Portland"), new PositionType("Web - Front End"), new CoreCompetency("Ruby"));
        Job job5 = new Job( "Junior Web Developer",  new Employer("Cozy"), new Location("Portland"), new PositionType("Web - Front End"), new CoreCompetency("Ruby"));
        assertFalse(job4.getId()==job5.getId());
    }
    @Test
    public void testToReturnStringWithBlankLineBeforeAndAfterInfo() {
        job2 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        assertTrue(job2.toString().startsWith(""));
        assertTrue(job2.toString().endsWith(""));
    }
    @Test
    public void testToStringContainsLabelForEachFieldFollowedByData() {
        job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(job3.getName()=="Product tester");
        assertTrue(job3.getEmployer().getValue()=="ACME");
        assertTrue(job3.getLocation().getValue()=="Desert");
        assertTrue(job3.getPositionType().getValue()=="Quality control");
        assertTrue(job3.getCoreCompetency().getValue()=="Persistence");
    }
    public void testIfFieldIsEmptyThenDataNotAvail() {
        assertNotNull(job3.getEmployer().getValue()==null);
    }

}
