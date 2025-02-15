package org.example.collegemanagementsystem.Dtos;


import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {

    private int departmentId;

    private String studentName;

    private String address;

    private String city;

}
