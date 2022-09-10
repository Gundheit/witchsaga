package com.rigan.purnama.geekseat.witchsaga.services;

import com.rigan.purnama.geekseat.witchsaga.entity.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;

@Service
@RequiredArgsConstructor
public class VillagerKilledService {
    public int countKilled(int year) {
        int num1 = 0;
        int num2 = 1;
        int counter = 0;
        int sum = 0;
        while (counter < year) {
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            sum = sum+num1;
            counter = counter + 1;
        }
        return sum;
    }

    public double getCountAverage(List<Person> personList) {
        ArrayList<Integer> initialData = new ArrayList<>();
        for(int i=0; i<personList.size(); i++){
            Person dataPerson = personList.get(i);
            if(!isDataValid(dataPerson)){
                return -1;
            }
            int killed=countKilled(dataPerson.getYearOfDeath()-dataPerson.getAgeOfDeath());
            initialData.add(killed);
        }
        IntSummaryStatistics stats = initialData.stream()
                .mapToInt(x -> x)
                .summaryStatistics();
        return stats.getAverage();
    }

    private boolean isDataValid(Person dataPerson){
        if(dataPerson.getAgeOfDeath()<0) {
            return false;
        }
        if(dataPerson.getYearOfDeath()<0) {
            return false;
        }
        return true;
    }

}
