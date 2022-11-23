package org.launchcode.codingevents.models;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

@Entity
public class EventDetails extends AbstractEntity {

    @OneToOne(mappedBy = "eventDetails")
    private Event event;
    @NotBlank(message = "Please enter a location.")
    @Size(max = 500, message = "Description too long!")
    private String location;

    @Size(max = 500, message = "Description too long!")
    private String description;
    @NotBlank(message = "Email is required.")
    @Email(message = "Invalid email. Try again.")
    private String contactEmail;

    @Positive(message = "Invalid number of attendees. Must be one or more.")
    private int numberOfAttendees;

    public EventDetails(String location, String description, String contactEmail, int numberOfAttendees) {
        this.location = location;
        this.description = description;
        this.contactEmail = contactEmail;
        this.numberOfAttendees = numberOfAttendees;
    }

    public EventDetails() {
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }


    public int getNumberOfAttendees() {
        return numberOfAttendees;
    }

    public void setNumberOfAttendees(int numberOfAttendees) {
        this.numberOfAttendees = numberOfAttendees;
    }
}
