package org.launchcode.codingevents.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.util.Date;
import java.util.Objects;

public class Event {

    private int id;
    private static int nextId = 1;
   @NotBlank(message = "Name is required.")
   @Size(min = 3, max = 50, message = "Name must be between 3-50 characters.")
    private String name;
   @NotBlank(message = "Please enter a location.")
   @Size(max = 500, message = "Description too long!")
   private String location;

   @Size(max = 500, message = "Description too long!")
    private String description;
   @NotBlank(message = "Email is required.")
   @Email(message = "Invalid email. Try again.")
   private String contactEmail;
   private boolean mustRegister = true;

   @Positive(message = "Invalid number of attendees. Must be one or more.")
   private int numberOfAttendees;

    public Event() {}
    public Event(String name, String location, String description, String contactEmail, int numberOfAttendees) {
        this.name = name;
        this.location = location;
        this.description = description;
        this.contactEmail = contactEmail;
        this.numberOfAttendees = numberOfAttendees;
        this.id = nextId;
        nextId++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public int getNumberOfAttendees() {
        return numberOfAttendees;
    }

    public void setNumberOfAttendees(int numberOfAttendees) {
        this.numberOfAttendees = numberOfAttendees;
    }


    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
