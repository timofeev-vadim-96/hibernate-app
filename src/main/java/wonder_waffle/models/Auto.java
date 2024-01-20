package wonder_waffle.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "autos")
@NoArgsConstructor
@Getter
@EqualsAndHashCode
public class Auto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "auto_id")
    @EqualsAndHashCode.Exclude
    private int id;

    @Setter
    private String model;

    @Setter
    private String color;

    @Setter
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    public Auto(String model, String color) {
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return color + " " + model;
    }
}
