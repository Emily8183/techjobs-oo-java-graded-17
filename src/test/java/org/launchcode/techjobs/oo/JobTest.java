package org.launchcode.techjobs.oo;

import org.junit.Test;

import static java.lang.System.lineSeparator;
import static org.junit.Assert.*;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertEquals;

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

        String result = job6.toString();

        assertTrue(result.startsWith(newline));
        assertTrue(result.endsWith(newline));

//        char sample = result.charAt(0);
//        assertEquals(result.charAt(0),newline);
//        assertEquals(result.charAt(result.length()-1),newline);
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {

        String newline = System.lineSeparator();

        String msg = "testToStringContainsCorrectLabelsAndData";

        Job job7 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String expected =  newline + "ID: " + job7.getId() + newline +
                "Name: " + job7.getName() + newline +
                "Employer: " + job7.getEmployer() + newline +
                "Location: " + job7.getLocation() + newline +
                "Position Type: " + job7.getPositionType() + newline +
                "Core Competency: " + job7.getCoreCompetency() + newline;

        String actual = job7.toString();

        assertEquals(msg, expected, actual);

    }

    @Test
    public void testToStringHandlesEmptyField(){
        String msg = "test To String Handles Empty Field";

        String newline = System.lineSeparator();

        Job job8 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));

//        String expected = "ID: " + job8.getId() + newline + "Name: Data not available" + "Employer: Data not available" + newline + "Location: Data not available" + newline + "Position Type: Data not available" + newline + "Core Competency: Data not available";

        String actual = job8.toString();

        assertTrue(actual.contains("Name: Data not available"));
        assertTrue(actual.contains("Employer: Data not available"));
        assertTrue(actual.contains("Location: Data not available"));
        assertTrue(actual.contains("Position Type: Data not available"));
        assertTrue(actual.contains("Core Competency: Data not available"));
    }



}


