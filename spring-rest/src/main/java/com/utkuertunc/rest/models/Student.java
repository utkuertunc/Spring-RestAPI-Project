package com.utkuertunc.rest.models;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student")
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    
    @NotEmpty(message = "First name is required")
    @Size(min = 2, message = "First Name should have atleast 2 characters")
    private String firstname;
    
    @NotEmpty(message = "Last name is required")
    @Size(min = 2, message = "Last Name should have atleast 2 characters")
    private String lastname;
    
    @Column(nullable = true, name = "email")
    @Email
    private String email;
}