package org.launchcode.techjobs_oo;

import java.util.Objects;

import static org.junit.Assert.assertTrue;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;
    private String printableNameValue;
    private String printableEmployerValue;
    private String printableLocationValue;
    private String printablePositionTypeValue;
    private String printableCoreCompetencyValue;


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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public String toString() {
        printableNameValue = this.getName().equals("") ? "Data not available" : this.getName();
        printableEmployerValue = this.getEmployer().toString().equals("") ? "Data not available" : this.getEmployer().toString();
        printableLocationValue = this.getLocation().toString().equals("") ? "Data not available": this.getLocation().toString();
        printablePositionTypeValue = this.getPositionType().toString().equals("") ? "Data not available": this.getPositionType().toString();
        printableCoreCompetencyValue = this.getCoreCompetency().toString().equals("") ? "Data not available": this.getCoreCompetency().toString();

        return new String ("\n" +
                "ID: " + this.getId() + "\n" +
                "Name: " + printableNameValue + "\n" +
                "Employer: " + printableEmployerValue + "\n" +
                "Location: " + printableLocationValue + "\n" +
                "Position Type: " + printablePositionTypeValue + "\n" +
                "Core Competency: " + printableCoreCompetencyValue + "\n" +
                "\n");
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public int getId() {
        return id;
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
}
