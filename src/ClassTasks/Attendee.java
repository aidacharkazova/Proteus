package ClassTasks;

public class Attendee {
    String name;
    String email;

    public Attendee(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return name + " (" + email + ")";
    }
}
