package com.rigan.purnama.geekseat.witchsaga.dto;

import com.rigan.purnama.geekseat.witchsaga.entity.Person;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor
public class PersonDto {
    List<Person> persons;
}
