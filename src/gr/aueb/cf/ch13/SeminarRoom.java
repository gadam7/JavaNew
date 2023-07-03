package gr.aueb.cf.ch13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SeminarRoom {
    private Long id;
    private String alias;
    private String url;
    private List<Seminar> seminars = new ArrayList<>();

    public SeminarRoom() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    List<Seminar> getSeminars() {
        return seminars;
    }

    public List<Seminar> getAllSeminars() {
        return Collections.unmodifiableList(this.seminars);
    }

    public void setSeminars(List<Seminar> seminars) {
        this.seminars = seminars;
    }
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean addSeminar(Seminar seminar) {
        if (seminar == null) return false;
        this.seminars.add(seminar);
        seminar.setSeminarRoom(this);
        return true;
    }
}
