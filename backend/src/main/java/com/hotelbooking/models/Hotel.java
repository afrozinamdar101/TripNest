package com.hotelbooking.models;

import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Hotel implements Serializable {

  private static final long serialVersionUID = -4439114469417994311L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  @Column
  @NotBlank(message = "Hotel Name is mandatory")
  private String hotelName;

  @Column
  private String description;

  @Column
  @NotBlank(message = "Location is mandatory")
  private String location;

  @Column
  @NotBlank(message = "Hotel address is mandatory")
  private String hotelAddress;

  @Column
  @NotBlank(message = "Hotel email is mandatory")
  private String hotelEmail;

  @Column
  @NotBlank(message = "Hotel phone number is mandatory")
  private String hotelPhone;

  @Column
  @NotNull(message = "Hotel base price is mandatory")
  private double hotelBasePrice;

  @Column
  private String imageURL;
}
