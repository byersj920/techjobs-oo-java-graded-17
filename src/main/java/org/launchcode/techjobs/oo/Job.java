package org.launchcode.techjobs.oo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

import static java.lang.System.lineSeparator;

public class Job {

    final int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    //Created constructor based on the other classes unique ID constructors.
    public Job (){
        id = nextId;
        nextId++;
    }

    //The second constructor takes in all the class arguments. But also includes a this() method to use the default
    //constructor above. That way, it still makes a unique ID. Arguments or not.
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    //This method is used to ensure the toString() method prints the correct string of "Data not Available"
    //whenever a value is left empty.
    private String emptyChecker(String value){
        if(value.isEmpty()){return "Data not available";}
        else{return value;}
    }

    //Custom toString() method
    @Override
    public String toString() {
        return String.format("\nID: %s\n" +
                "Name: %s\n"+
                "Employer: %s\n" +
                "Location: %s\n" +
                "Position Type: %s\n"+
                "Core Competency: %s\n",
                id, emptyChecker(name), emptyChecker(employer.getValue()),
                emptyChecker(location.getValue()), emptyChecker(positionType.getValue()),
                emptyChecker(coreCompetency.getValue()));
    }


    // <~~~~~~~~~~Equals and HashCode Methods~~~~~~~~~~>

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job job)) return false;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }


    //v~~~ Getters and Setters ~~~v

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

    //ID has a getter, but no setter.
    public int getId() {
        return id;
    }
}
