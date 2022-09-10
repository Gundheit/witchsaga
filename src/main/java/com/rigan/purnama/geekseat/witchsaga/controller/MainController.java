package com.rigan.purnama.geekseat.witchsaga.controller;

import com.rigan.purnama.geekseat.witchsaga.dto.PersonDto;
import com.rigan.purnama.geekseat.witchsaga.services.VillagerKilledService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@RequiredArgsConstructor
public class MainController {

    private final VillagerKilledService villagerKilledService;

    @ApiIgnore
    @GetMapping("/")
    public RedirectView redirectWithUsingRedirectView() {
        return new RedirectView("/swagger-ui/");
    }

    @ApiOperation(value = "Get a count average of villager killed by list of persons", notes = "average would be count from as much person defined in persons object (not limited to 2)")
    @PostMapping("/countAverage")
    ResponseEntity countAverage(@RequestBody PersonDto persons){
        double average = villagerKilledService.getCountAverage(persons.getPersons());
        return ResponseEntity.ok(average);
    }
}
