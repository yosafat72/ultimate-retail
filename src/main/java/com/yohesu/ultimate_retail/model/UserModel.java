package com.yohesu.ultimate_retail.model;

import javax.persistence.*;
import lombok.*;

@Entity
@Table(name = "tbl_user")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "id_user")
    private long idUser;

    @Column(name = "nm_user")
    private String nmUser;

    @Column(name = "dob_user")
    private String dobUser;

    @Column(name = "gender_user")
    private String genderUser;

    @Column(name = "phone_user")
    private String phoneUser;

    @Column(name = "email_user")
    private String emailUser;

    @Column(name = "desc_user")
    private String descUser;

    @Column(name = "created_at")
    private String createdAt;

    @Column(name = "updated_at")
    private String updatedAt;

}
