package kg.megacom.restoservice.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "dishes")
public class Dishes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "dish_id")
    private Long id;
    private String name;
    private double size;
    private String img;

    @ManyToOne
    @JoinColumn(name = "menu_id")
    private Menu menu;

}
