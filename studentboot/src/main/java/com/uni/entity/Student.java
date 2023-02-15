package com.uni.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name="sname")
public class Student {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="sid",length=10)
private Long id;
@Column(name="sname",length=15)
private String name;
@Column(name="semail",length=20,unique=true)
private String email;
@Column(name="saddress",length=20)
private String address;
@Column(name="smobileno",length=11,unique=true)
private Long mobileno;
}
