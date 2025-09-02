package ClassTasks;

import java.util.LinkedList;

public class Session {
    String title;
    String speakerName;
    String time;
    LinkedList<Attendee> attendees; // Hər sessiyanın öz iştirakçı növbəsi var

    public Session(String title, String speakerName, String time) {
        this.title = title;
        this.speakerName = speakerName;
        this.time = time;
        this.attendees = new LinkedList<>(); // Hər yeni sessiya üçün boş iştirakçı siyahısı yaradılır
    }

    // Sessiyaya yeni iştirakçı əlavə edən metod
    public void addAttendee(Attendee attendee) {
        attendees.add(attendee);
        System.out.println("'" + attendee.name + "' iştirakçısı '" + this.title + "' sessiyasına uğurla əlavə edildi.");
    }

    // Növbədəki ilk iştirakçını yoxlamadan keçirən (check-in) metod
    public void checkInNextAttendee() {
        if (!attendees.isEmpty()) {
            Attendee checkedInAttendee = attendees.removeFirst();
            System.out.println("Check-in: '" + checkedInAttendee.name + "' iştirakçısı '" + this.title + "' sessiyasına daxil oldu.");
        } else {
            System.out.println("'" + this.title + "' sessiyası üçün bütün iştirakçılar artıq daxil olub. Sessiya doludur.");
        }
    }

    @Override
    public String toString() {
        return "Sessiya: '" + title + "' | Spiker: " + speakerName + " | Vaxt: " + time;
    }
}
