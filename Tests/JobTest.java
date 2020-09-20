package Tests;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;

public class JobTest {
    Job job1;
    Job job2;

    @Before
    public void createCarObject() {
        job1 = new Job();
        job2 = new Job();
    }

    @Test
    public void testSettingJobId() {
        assertTrue(job1.getId()!=job2.getId());
        assertEquals(1, job2.getId()-job1.getId());

    }
}
