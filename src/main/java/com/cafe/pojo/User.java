package com.cafe.pojo;

import jakarta.persistence.*;
import lombok.Data;
@NamedQuery(name = "User.findByEmail",query = "select u from User u where u.email=:email")
@Data
@Entity
public class User {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String contactNumber;
    private String email;
    private String password;
    private String status;
    private String role;

}
