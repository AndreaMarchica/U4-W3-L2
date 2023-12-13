package andreamarchica.entities;

import javax.persistence.*;

@Entity
@Table(name = "Location")
public class Location {

    /*ATTRIBUTI*/
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "Nome")
    private String nome;
    @Column(name = "Città")
    private String citta;
    @OneToOne
    @JoinColumn(name = "evento_id")
    private Evento evento;


    /*COSTRUTTORI*/
    public Location() {
    }

    public Location(String nome, String citta, Evento evento) {
        this.nome = nome;
        this.citta = citta;
        this.evento = evento;
    }


    /*METODI*/
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }
}
