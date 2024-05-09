package com.ex.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// NOTE:
// Entity Annotation,
// this class is a JPA entity.
// db의 테이블에 대응되는 클래스.
@Entity
public class Customer {

    @Id // 오브젝트의 아이디
    @GeneratedValue(strategy = GenerationType.AUTO) // 아이디를 자동 생성
    private Integer id;

    private String firstName;
    private String lastName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
}
