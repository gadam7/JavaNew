package gr.aueb.cf.ch13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Seminar {
    private Long id;
    private String title;
    private String description;
    private Organizer organizer;
    private List<Participant> participants = new ArrayList<>();
    private SeminarRoom seminarRoom;
    private SchedulingPeriod schedulingPeriod;

    public Seminar() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Organizer getOrganizer() {
        return organizer;
    }

    public void setOrganizer(Organizer organizer) {
        this.organizer = organizer;
    }

    public List<Participant> getAllParticipants() {
        return Collections.unmodifiableList(this.participants);
    }

    List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }

    public SeminarRoom getSeminarRoom() {
        return seminarRoom;
    }

    public void setSeminarRoom(SeminarRoom seminarRoom) {
        this.seminarRoom = seminarRoom;
    }

    public boolean addSeminarRoom(SeminarRoom seminarRoom) {
        if (seminarRoom == null) return false;
        for (Seminar seminar : seminarRoom.getSeminars()) {
            if (this == seminar) {
                return false;
            }
        }

        this.seminarRoom = seminarRoom;
        seminarRoom.getSeminars().add(this);
        return true;
    }

    public SchedulingPeriod getSchedulingPeriod() {
        return schedulingPeriod;
    }

    public void setSchedulingPeriod(SchedulingPeriod schedulingPeriod) {
        this.schedulingPeriod = schedulingPeriod;
    }

    public boolean addParticipant(Participant participant) {
        if (participant == null) return false;
        for (Seminar seminar : participant.getSeminars()) {
            if (seminar == this) {
                return false;
            }
        }

        this.participants.add(participant);
        participant.getSeminars().add(this);
        return true;
    }
}
