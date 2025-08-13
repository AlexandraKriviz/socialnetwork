package org.telran.social.model;

import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "network_users")
public class NetworkUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String surname;

    private String login;

    private String password;
}

