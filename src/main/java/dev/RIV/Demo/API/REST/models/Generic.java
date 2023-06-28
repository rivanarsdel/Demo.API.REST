package dev.RIV.Demo.API.REST.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//See notes from "GenericObjectDTO"
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

//Tells JPA that this is to be made permanent. This also lets me customize how the table will present in SQL.
@Entity
@Table(name = "Generic_Object")

public class Generic {

    //All such annotations are essentially directives to SQL
    //ID specifies primary key. Generated value tells SQL to accept it, generation type "identity" will serialize the objects according to their index
    //Personally, I much prefer generating hashes. They will be unique across virtually all databases, so marrying datasets together using hashes as Ids will preserve their uniqueness.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "genericId")
    int genericId;
    //Ensures this column can be used as a foreign key for defining relationships (one to many, etc)
    @Column(name = "genericHash", nullable = false, unique = true)
    String genericHash;
    @Column(name = "genericName")
    String genericName;
    //Cool thing about strings: all data is binary, this is just an interpretation of it and is quite flexible. It can be an image or w/e, once created one can use regular expressions to sort through literally anything.
    @Column(name = "genericPayload")
    String genericPayload;
}
