package org.example.collegemanagementsystem.Dtos;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentDto {

    private int id;

    private String departmentName;

    private long departmentBlockNumber;

}
