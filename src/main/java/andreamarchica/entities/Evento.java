package andreamarchica.entities;

import javax.persistence.*;

@Entity
@Table(name = "eventi")
public class Evento {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String titolo;

    @Column
    private String dataEvento;

    @Column
    private String descrizione;

    @Column(name = "tipoEvento")
    @Enumerated(EnumType.STRING)
    private tipoEvento tipoEvento;

    @Column
    private int numeroMassimoPartecipanti;


    public Evento() {}

    public Evento(String titolo, String dataEvento, String descrizione, andreamarchica.entities.tipoEvento tipoEvento, int numeroMassimoPartecipanti) {
        this.titolo = titolo;
        this.dataEvento = dataEvento;
        this.descrizione = descrizione;
        this.tipoEvento = tipoEvento;
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(String dataEvento) {
        this.dataEvento = dataEvento;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public andreamarchica.entities.tipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(andreamarchica.entities.tipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public int getNumeroMassimoPartecipanti() {
        return numeroMassimoPartecipanti;
    }

    public void setNumeroMassimoPartecipanti(int numeroMassimoPartecipanti) {
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", dataEvento='" + dataEvento + '\'' +
                ", descrizione='" + descrizione + '\'' +
                ", tipoEvento=" + tipoEvento +
                ", numeroMassimoPartecipanti=" + numeroMassimoPartecipanti +
                '}';
    }
}
