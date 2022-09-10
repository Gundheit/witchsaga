package com.rigan.purnama.geekseat.witchsaga.controller;

import com.rigan.purnama.geekseat.witchsaga.dto.PersonDto;
import com.rigan.purnama.geekseat.witchsaga.services.VillagerKilledService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MainController {

    private final VillagerKilledService villagerKilledService;

    @PostMapping("/countAverage")
    ResponseEntity countAverage(@RequestBody PersonDto persons){
        double average = villagerKilledService.getCountAverage(persons.getPersons());
        return ResponseEntity.ok(average);
    }
}
