package staj.Entity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Data
@Entity
@Table(name = "benn", schema = "ben" )

public class StajEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "isim")
    private String isim;

    @Column(name = "soyisim")
    private String soyisim;

    @Column(name = "email")
    private String email;

    @Column (name = "githubLink")
    private String githubLink;
    public StajEntity(String isim, String soyisim, String email) {
        super();
        this.isim = isim;
        this.soyisim = soyisim;
        this.email = email;
        this.githubLink = githubLink;

    }



}
