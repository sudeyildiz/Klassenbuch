package at.spengergasse.klassenbuch;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class LLehrer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String nachname;
    private String klasseZustaendigkeit;

    @OneToMany(mappedBy = "lehrer", cascade = CascadeType.ALL)
    private List<SSchueler> schuelerList;

    public LLehrer() {
    }

    public LLehrer(String name, String nachname, String klasseZustaendigkeit) {
        this.name = name;
        this.nachname = nachname;
        this.klasseZustaendigkeit = klasseZustaendigkeit;
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

    public String getKlasseZustaendigkeit() {
        return klasseZustaendigkeit;
    }

    public void setKlasseZustaendigkeit(String klasseZustaendigkeit) {
        this.klasseZustaendigkeit = klasseZustaendigkeit;
    }

    public List<SSchueler> getSchuelerList() {
        return schuelerList;
    }

    public void setSchuelerList(List<SSchueler> schuelerList) {
        this.schuelerList = schuelerList;
    }
}
