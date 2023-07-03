package gr.aueb.cf.ch13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Organizer {
    private User user;
    private List<Seminar> seminars = new ArrayList<>();
    private List<SeminarInvitation> seminarInvitations = new ArrayList<>();

    public Organizer() {}

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Seminar> getAllSeminars() {
        return Collections.unmodifiableList(this.seminars);
    }

    List<Seminar> getSeminars() {
        return seminars;
    }

    public void setSeminars(List<Seminar> seminars) {
        this.seminars = seminars;
    }

    public List<SeminarInvitation> getAllSeminarInvitations() {
        return Collections.unmodifiableList(this.seminarInvitations);
    }

    List<SeminarInvitation> getSeminarInvitations() {
        return seminarInvitations;
    }

    public void setSeminarInvitations(List<SeminarInvitation> seminarInvitations) {
        this.seminarInvitations = seminarInvitations;
    }

    public boolean addSeminar(Seminar seminar) {
        if (seminar == null) return false;
        if (seminar.getOrganizer() == this) return false;

        this.seminars.add(seminar);
        seminar.setOrganizer(this);
        return true;
    }

    public boolean addSeminarInvitation(SeminarInvitation seminarInvitation) {
        if (seminarInvitation == null) return false;
        if (seminarInvitation.getSender() == this) return false;

        this.seminarInvitations.add(seminarInvitation);
        seminarInvitation.setSender(this);
        return true;
    }
}
