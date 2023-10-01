package org.launchcode.techjobs.oo;

import java.util.HashMap;
import java.util.Objects;
import java.util.Map;

public class Job {

    private int id;
    private static int nextId = 1;
    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        String newline = System.lineSeparator();
        String result = "";

        if (getName() != null && !getName().equals("")) {
            result += "Name: " + getName() + newline ;
        } else {
            result += "Name: " + "Data not available" + newline ;
        }

//       if (!getEmployer().toString().equals("")) {
        if (getEmployer() != null && !getEmployer().toString().isEmpty()) {
            // either isEmpty() or .equals("") works, but needs to apply to a string
            result += "Employer: " + getEmployer() + newline ;
        } else {
            result += "Employer: " + "Data not available" + newline ;
        }

        if (getLocation() != null && !getLocation().toString().equals("")) {
            result += "Location: " + getLocation() + newline ;
        } else {
            result += "Location: " + "Data not available" + newline ;
        }

        if (getPositionType() != null && !getPositionType().toString().equals("")) {
            result += "Position Type: " + getPositionType() + newline ;
        } else {
            result += "Position Type: " + "Data not available" + newline ;
        }

        if (getCoreCompetency() != null && !getCoreCompetency().toString().equals("")) {
            result += "Core Competency: " + getCoreCompetency() + newline ;
        } else {
            result += "Core Competency: " + "Data not available" + newline ;
        }

         return newline+ "ID: " + getId() + newline + result; //at return, if there's one string, the result will auto-convert to a string
    }
}
