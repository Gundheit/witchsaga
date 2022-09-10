package com.rigan.purnama.geekseat.witchsaga;

import com.rigan.purnama.geekseat.witchsaga.entity.Person;
import com.rigan.purnama.geekseat.witchsaga.services.VillagerKilledService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class WitchSagaApplicationTests {
	VillagerKilledService underTestVillagerService = new VillagerKilledService();

	@Test
	public void countKilled_true(){
		int year = 10;
		int killed = underTestVillagerService.countKilled(year);
		int expectedValues = 143;
		Assertions.assertThat(killed).isEqualTo(expectedValues);
	}

	@Test
	void countKilled_false(){
		int year = 10;
		int killed = underTestVillagerService.countKilled(year);
		int notExpectedValue = 500;
		Assertions.assertThat(killed).isNotEqualTo(notExpectedValue);
	}

	@Test
	void getCountAverage(){
		Person john = new Person();
		john.setAgeOfDeath(10);
		john.setYearOfDeath(12);

		Person dane = new Person();
		dane.setAgeOfDeath(13);
		dane.setYearOfDeath(17);

		List<Person> personList = new ArrayList<>();
		personList.add(john);
		personList.add(dane);

		double countavg = underTestVillagerService.getCountAverage(personList);
		System.out.println(countavg);
		double expectedResult=4.5;
		Assertions.assertThat(countavg).isEqualTo(expectedResult);
	}





}
