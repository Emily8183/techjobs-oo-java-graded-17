package org.launchcode.techjobs.oo;

import java.util.Objects;

public class CoreCompetency extends JobField {

//    private int id;
//    private static int nextId = 1;
//    private String value;

//    no need to assign a setter for Id as the id's value is set by the constructor;
//    public int getId() {
//        return id;
//    }

//    public String getValue() {
//        return value;
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }

//    public CoreCompetency() {
//        this.id = nextId;
//        nextId++;
//    }

//    public CoreCompetency(String value) {
//        this();
//        this.value = value;
//    }


    public CoreCompetency(String value) {
        super(value);
    }

    // Custom toString, equals, and hashCode methods:

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CoreCompetency)) return false;
        CoreCompetency that = (CoreCompetency) o;
        return getId() == that.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

}
