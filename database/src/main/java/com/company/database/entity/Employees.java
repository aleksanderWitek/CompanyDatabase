package com.company.database.entity;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "employees")
public class Employees {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull(message = "something went wrong with auto incrementation ID")
    @Column(name = "id")
    private int id;

    @NotNull(message = "Your first name can't be empty")
    @Size(min = 1, max = 20, message = "Your first name has to be between 1-20 chars")
    @Column(name = "first_name")
    private String firstName;

    @NotNull(message = "Your last name can't be empty")
    @Size(min = 1, max = 20, message = "Your last name has to be between 1-20 chars")
    @Column(name = "last_name")
    private String lastName;

    @Nullable
    @Column(name = "email")
    private String email;

    @Nullable
    @Column(name = "role")
    private String role;

    @NotNull(message = "something went wrong with getting info from Members table")
    @OneToOne(cascade = CascadeType.ALL,
              fetch = FetchType.LAZY)
    @JoinColumn(name = "members_id")
    private Members members;

    public Employees() {
    }

    public Employees(String firstName, String lastName, String email, String role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.role = role;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public Members getMembers() {
        return members;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
