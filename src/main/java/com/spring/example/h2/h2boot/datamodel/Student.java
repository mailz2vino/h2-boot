package com.spring.example.h2.h2boot.datamodel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "student")
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Student {

  @Id
  @GeneratedValue
  private int id;

  private String firstName;

  private String lastName;

  private String department;

}
