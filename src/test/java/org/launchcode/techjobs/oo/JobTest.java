package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotEquals;

public class JobTest {
    @Test
    public void testSettingJobId(){
        String jobEqualsMsg = "To verify that the IDs of the two objects are distinct";
        Job job1 = new Job();
        Job job2 = new Job();

        assertNotEquals(jobEqualsMsg, job1.getId(), job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(job3 instanceof Job);

        assertEquals("Product tester", job3.getName());
        assertEquals("ACME", job3.getEmployer().getValue());
        assertEquals("Desert", job3.getLocation().getValue());
        assertEquals("Quality control", job3.getPositionType().getValue());
        assertEquals("Persistence", job3.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality(){
        Job job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(job4.equals(job5));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {

        String newline = System.lineSeparator();

        Job job6 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String actualFormattedJob = job6.toString();

        String[] lines = actualFormattedJob.split(newline);

        assertEquals("",lines[0]);
        assertEquals("",lines[lines.length -1]);
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {

        Job job7 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String formattedData = job7.toString();

        assertEquals("", formattedData);
    }

}


