package com.rigan.purnama.geekseat.witchsaga.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Person {
    @ApiModelProperty(notes = "Age of Death", example = "10", required = true)
    private int ageOfDeath;
    @ApiModelProperty(notes = "Year of Death", example = "13", required = true)
    private int yearOfDeath;

}
