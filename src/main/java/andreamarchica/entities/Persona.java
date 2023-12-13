package andreamarchica.entities;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Persona")
public class Persona {
    /*ATTRIBUTI*/


    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "Nome")
    private String nome;
    @Column(name = "Cognome")
    private String cognome;
    @Column(name = "Email")
    private String email;
    @Column(name = "Data di nascita")
    private String data;
    @Column(name = "Sesso")
    @Enumerated(EnumType.STRING)
    private Sesso sesso;
/*    @Column(name = "Lista partecipazioni")
    @OneToMany
    private List<Partecipazione> listaPartecipazioni;*/
    @ManyToMany
    @JoinTable(name = "persona_partecipazione",
            joinColumns = @JoinColumn(name = "partecipazione_id"),
            inverseJoinColumns = @JoinColumn(name = "persona_id")
    )
    private List<Partecipazione> listaPartecipazioni;

    /*COSTRUTTORI*/
    public Persona() {
    }

    public Persona(String nome, String cognome, String email, String data, Sesso sesso) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.data = data;
        this.sesso = sesso;
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

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Sesso getSesso() {
        return sesso;
    }

    public void setSesso(Sesso sesso) {
        this.sesso = sesso;
    }

    public List<Partecipazione> getListaPartecipazioni() {
        return listaPartecipazioni;
    }

    public void setListaPartecipazioni(List<Partecipazione> listaPartecipazioni) {
        this.listaPartecipazioni = listaPartecipazioni;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", email='" + email + '\'' +
                ", data='" + data + '\'' +
                ", sesso=" + sesso +
                ", listaPartecipazioni=" + listaPartecipazioni +
                '}';
    }
}
