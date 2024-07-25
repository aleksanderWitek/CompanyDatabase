package com.company.database.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "members")
public class Members {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "pw")
    private String password;

    @Column(name = "active")
    private int isActive;

    @OneToOne(mappedBy = "members",
              cascade = CascadeType.ALL)
    private Employees employees;

    public Members() {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIsActive() {
        return isActive;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }

    public int getId() {
        return id;
    }

    public Employees getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        return "Members{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
