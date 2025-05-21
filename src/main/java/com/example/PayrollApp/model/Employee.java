package com.example.PayrollApp.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     int id;
     String name;
     long salary;
	public void setName(String name2) {
		// TODO Auto-generated method stub
		
	}
	public void setSalary(long salary2) {
		// TODO Auto-generated method stub
		
	}
}
