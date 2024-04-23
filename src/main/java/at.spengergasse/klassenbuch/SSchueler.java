package at.spengergasse.klassenbuch;

import jakarta.persistence.*;

@Entity
public class SSchueler {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String nachname;
    private String klasse;
    private double note;

    @ManyToOne
    @JoinColumn(name = "lehrer_id")
    private LLehrer lehrer;

    public SSchueler() {
    }

    public SSchueler(String name, String nachname, String klasse, double note, LLehrer lehrer) {
        this.name = name;
        this.nachname = nachname;
        this.klasse = klasse;
        this.note = note;
        this.lehrer = lehrer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getKlasse() {
        return klasse;
    }

    public void setKlasse(String klasse) {
        this.klasse = klasse;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    public LLehrer getLehrer() {
        return lehrer;
    }

    public void setLehrer(LLehrer lehrer) {
        this.lehrer = lehrer;
    }
}
