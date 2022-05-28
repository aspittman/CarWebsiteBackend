package com.udacity.pricing;

import com.udacity.pricing.api.PricingController;
import com.udacity.pricing.domain.price.Price;
import com.udacity.pricing.service.PriceException;
import com.udacity.pricing.service.PricingService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PricingServiceApplicationTests {

	long carId = 19;

	@Autowired
	private PricingController pricingController;

	@Test
	public void controllerSmokeTest() {
		assertThat(pricingController).isNotNull();
		assertThat(pricingController.get(carId)).isNotNull();
	}

	@Test
	public void serviceTest() throws PriceException {
		assertThat(PricingService.getPrice(carId)).isNotNull();
	}
}
