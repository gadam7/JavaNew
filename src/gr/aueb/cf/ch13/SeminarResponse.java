package gr.aueb.cf.ch13;

public class SeminarResponse {
    private Participant sender;
    private Message message;

    public SeminarResponse() {}

    public Participant getSender(Participant participant) {
        return sender;
    }

    public void setSender(Participant sender) {
        this.sender = sender;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }
}
