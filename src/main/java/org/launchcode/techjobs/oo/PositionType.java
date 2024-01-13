package org.launchcode.techjobs.oo;

import java.util.Objects;

public class PositionType {

    private int id;
    private static int nextId = 1;
    private String value;

    public PositionType() {
        id = nextId;
        nextId++;
    }

    public PositionType(String value) {
        this();
        this.value = value;
    }

    // Custom toString that returns Value:
    @Override
    public String toString() {
        return "PositionType{" +
                "value='" + value + '\'' +
                '}';
    }
    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.

    //Custom equals and hashCode methods. Objects are "equal" when ID fields are matching:
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PositionType that)) return false;
        return getId() == that.getId() && Objects.equals(getValue(), that.getValue());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getValue());
    }

    // Getters and Setters:

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
