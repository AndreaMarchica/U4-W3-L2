package andreamarchica.entities;

import javax.persistence.*;

@Entity
@Table(name = "Pertecipazioni")
public class Partecipazione {
    /*ATTRIBUTI*/

    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    @JoinColumn(name = "persona_id", nullable = false)
    private Persona persona;


    @ManyToMany
    @JoinTable(name = "persona_partecipazione",
            joinColumns = @JoinColumn(name = "persona_id"),
            inverseJoinColumns = @JoinColumn(name = "partecipazione_id")
    )

    /*COSTRUTTORI*/

    public Partecipazione() {
    }

    public Partecipazione(Persona persona) {
        this.persona = persona;
    }
    /*METODI*/
}
