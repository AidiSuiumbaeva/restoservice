package kg.megacom.restoservice.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "restaurants")
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "restaurant_id")
    private Long id;
    private String  name;
    private String address;
    private double lat;
       private double lon;
    private boolean active;
    private String logo;
    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "phone_id")
    private Set<Phones> phones;

}
