package gr.aueb.cf.ch13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Participant {
    private User user;
    private List<Seminar> seminars = new ArrayList<>();
    private List<SeminarResponse> seminarResponses = new ArrayList<>();

    public Participant() {}

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    List<Seminar> getSeminars() {
        return seminars;
    }

    public void setSeminars(List<Seminar> seminars) {
        this.seminars = seminars;
    }

    public List<Seminar> getAllSeminars() {
        return Collections.unmodifiableList(this.seminars);
    }

    List<SeminarResponse> getSeminarResponses() {
        return seminarResponses;
    }

    public void setSeminarResponses(List<SeminarResponse> seminarResponses) {
        this.seminarResponses = seminarResponses;
    }

    public List<SeminarResponse> getAllSeminarResponses() {
        return Collections.unmodifiableList(this.seminarResponses);
    }

    public boolean addSeminar(Seminar seminar) {
        if (seminar == null) return false;
        for (Participant participant: seminar.getParticipants()) {
            if (participant == this) {
                return false;
            }
        }

        this.seminars.add(seminar);
        seminar.getParticipants().add(this);
        return true;
    }

    public boolean addSeminarInvitation(SeminarResponse seminarResponse) {
        if (seminarResponse == null) return false;
        if (seminarResponse.getSender(this) == this) return false;

        this.seminarResponses.add(seminarResponse);
        seminarResponse.getSender(this);
        return true;
    }
}
