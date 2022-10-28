package com.yohesu.ultimate_retail.model;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.*;

@Entity
@Table(name = "tbl_users")
@EntityListeners(AuditingEntityListener.class)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @NotEmpty(message = "Please enter your name")
    @Size(min = 3, max = 50)
    @Column(name = "name")
    private String name;

    @NotNull(message = "Please enter your birth date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "dob")
    private Date dob;

    @NotNull
    @Column(name = "gender")
    private String gender;

    @NotNull(message = "Please enter your phone number")
    @Size(min = 8, max = 19)
    @Column(name = "phone")
    private String phone;

    @NotNull(message = "Please enter your email")
    @Size(min = 5, max = 50)
    @Email(message = "Please enter a valid email")
    @Column(name = "email")
    private String email;

    @Column(name = "description")
    private String description;

    @Column(name = "created_at")
    @CreatedDate
    private Date createdAt;

    @Column(name = "updated_at")
    @LastModifiedDate
    private Date updatedAt;

}
