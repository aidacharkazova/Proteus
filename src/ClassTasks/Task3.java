package ClassTasks;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("=========================================================");
        System.out.println("===== TƏDBİR İDARƏETMƏ SİSTEMİ İŞƏ SALINDI =====");
        System.out.println("=========================================================\n");

        // --- BÖLMƏ 1: ArrayList İstifadəsi (Konfrans Sessiyaları) ---
        System.out.println("---------- 1. ArrayList ilə Sessiyaların İdarə Edilməsi ----------");

        // 1. Konfrans sessiyalarının təfərrüatlarını saxlamaq üçün bir ArrayList yaradın.
        ArrayList<Session> conferenceSessions = new ArrayList<>();

        // 2. ArrayList-ə ən azı 6 sessiya əlavə edin.
        System.out.println("\n-> Sessiyalar əlavə edilir...");
        conferenceSessions.add(new Session("Java ilə Proqramlaşdırmanın Gələcəyi", "Əli Vəliyev", "09:00 - 10:00"));
        conferenceSessions.add(new Session("Süni İntellektin Etik Tərəfləri", "Leyla Quliyeva", "10:15 - 11:15"));
        conferenceSessions.add(new Session("Bulud Texnologiyaları: AWS vs Azure", "Samir Ağayev", "11:30 - 12:30"));
        conferenceSessions.add(new Session("Kibertəhlükəsizlik Trendləri 2025", "Aynur Məmmədova", "13:30 - 14:30"));
        conferenceSessions.add(new Session("Böyük Verilənlərin Analizi", "Ruslan Həsənov", "14:45 - 15:45"));
        conferenceSessions.add(new Session("Mobil Tətbiqlərin İnkişafı", "Nərgiz İbrahimova", "16:00 - 17:00"));

        System.out.println("Cari sessiyaların siyahısı:");
        conferenceSessions.forEach(System.out::println);

        // 3. get() istifadə edərək ilk və son sessiyanın təfərrüatlarını göstərin.
        System.out.println("\n-> İlk və son sessiyanın məlumatları (get metodu):");
        System.out.println("İlk Sessiya: " + conferenceSessions.get(0));
        System.out.println("Son Sessiya: " + conferenceSessions.get(conferenceSessions.size() - 1));

        // 4. remove() ilə bir sessiyanı silin və yenilənmiş siyahını çap edin.
        System.out.println("\n-> Bir sessiya ləğv edilir (remove metodu)...");
        Session removedSession = conferenceSessions.remove(2); // 3-cü sessiya (indeks 2) silinir
        System.out.println("Ləğv edildi: " + removedSession.title);
        System.out.println("Yenilənmiş sessiya siyahısı:");
        conferenceSessions.forEach(System.out::println);

        // 5. set() ilə sessiya məlumatlarını yeniləyin və yenilənmiş sessiya siyahısını göstərin.
        System.out.println("\n-> Bir sessiyanın məlumatları yenilənir (set metodu)...");
        Session sessionToUpdate = conferenceSessions.get(3); // 4-cü sessiya (yeni indeks 3)
        System.out.println("Əvvəl: " + sessionToUpdate);
        sessionToUpdate.speakerName = "Fidan Rəhimova";
        sessionToUpdate.time = "15:00 - 16:00";
        conferenceSessions.set(3, sessionToUpdate);
        System.out.println("Sonra: " + conferenceSessions.get(3));
        System.out.println("Yekun sessiya siyahısı:");
        conferenceSessions.forEach(System.out::println);

        System.out.println("\n---------- ArrayList ilə əməliyyatlar tamamlandı. ----------\n");


        // --- BÖLMƏ 2: LinkedList İstifadəsi (Sessiya İştirakçıları) ---
        System.out.println("---------- 2. LinkedList ilə İştirakçıların İdarə Edilməsi ----------");

        // 1. Bir sessiya seçək və ona iştirakçılar əlavə edək.
        Session javaSession = conferenceSessions.get(0); // İlk sessiyanı seçirik
        System.out.println("\n-> '" + javaSession.title + "' sessiyası üçün iştirakçılar qeydiyyatdan keçir:");
        javaSession.addAttendee(new Attendee("Orxan Abbasov", "orxan.a@mail.com"));
        javaSession.addAttendee(new Attendee("Sevinc Kərimova", "sevinc.k@mail.com"));
        javaSession.addAttendee(new Attendee("Elvin Cəfərov", "elvin.c@mail.com"));
        javaSession.addAttendee(new Attendee("Günel Əliyeva", "gunel.a@mail.com"));
        javaSession.addAttendee(new Attendee("Tural Babayev", "tural.b@mail.com"));

        // 2. Yeni bir iştirakçı qeydiyyatdan keçir və növbəyə əlavə edilir.
        System.out.println("\n-> Yeni iştirakçı qeydiyyatdan keçir...");
        javaSession.addAttendee(new Attendee("Zəhra Hüseynova", "zehra.h@mail.com"));

        // 3. removeFirst() istifadə edərək check-in prosesini simulyasiya edin.
        System.out.println("\n-> '" + javaSession.title + "' sessiyası üçün check-in prosesi başlayır...");
        while (!javaSession.attendees.isEmpty()) {
            javaSession.checkInNextAttendee();
        }

        // 4. Bütün iştirakçılar yoxlamadan keçdikdən sonra mesaj çap edin.
        // Bu mesaj checkInNextAttendee metodunun içində avtomatik olaraq sonuncu dəfə çağırıldıqda çap olunacaq.
        // Əlavə olaraq bir daha yoxlayaq:
        System.out.println("\n-> Check-in prosesi başa çatdı. Təkrar yoxlama cəhdi:");
        javaSession.checkInNextAttendee();

        System.out.println("===== SİSTEM İŞİNİ UĞURLA BAŞA ÇATDIRDI =====");
    }
}
