package com.xworkz.modemDto;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString


@Entity
@Table(name="modem_app_table")

public class ModemDTO implements Serializable {
@Id
@Column(name="mid")
private int mid;
@Column(name="brand")

private String brand;
@Column(name="type")
private String type;


	
}