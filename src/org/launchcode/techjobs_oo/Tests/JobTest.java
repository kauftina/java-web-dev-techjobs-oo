package org.launchcode.techjobs_oo.Tests;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.launchcode.techjobs_oo.*;

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

    }

}
