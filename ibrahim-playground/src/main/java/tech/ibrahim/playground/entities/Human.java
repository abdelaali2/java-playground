package tech.ibrahim.playground.entities;

import jakarta.persistence.*;
import lombok.*;
import tech.ibrahim.playground.enums.Country;
import tech.ibrahim.playground.enums.Gender;

import java.util.Date;

@Entity // Means that this class maps a database table
//By default the table name will match the class name
@Table(name = "MyHuman")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Human {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    private String name;

    private Integer age;

    private Date birthDate;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Enumerated(EnumType.STRING)
    private Country country;

}
