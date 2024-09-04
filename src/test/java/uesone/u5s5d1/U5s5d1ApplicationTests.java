package uesone.u5s5d1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import uesone.u5s5d1.entities.Pizza;

import java.util.List;

import static java.awt.SystemColor.menu;

@SpringBootTest
class U5s5d1ApplicationTests {

	@Test
	public void testNumeroPizzeNelMenu() {
		List<Pizza> pizze = menu.getPizze();
		Assertions.assertEquals(3, pizze.size(), "Il menu dovrebbe contenere 3 pizze.");
	}
}
