package com.hospital.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class PatientRequest {
    @NotBlank(message = "Name is a mandatory field.")
    private String name;

    @NotNull(message = "Age is a mandatory field.")
    private Integer age;
    @NotBlank(message = "Phone is a mandatory field.")
    @Size(min = 10, message = "Minimum 10 digits required")
    private String phone;

    @NotNull(message="DOB is a mandatory field")
    private Date dob;

    @NotBlank(message ="Aadhar is a mandatory input." )
    private String aadhar;
}
