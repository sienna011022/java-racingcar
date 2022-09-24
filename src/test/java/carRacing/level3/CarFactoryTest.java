package carRacing.level3;

import carRacing.level3.repository.CarFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarFactoryTest {

	public static final Integer CARNUM = 1;

	CarFactory carFactory = new CarFactory();

	@Test
	@DisplayName("처음 라운드는 모두 한칸씩 이동하여 현재 이동 상태는 1이다.")
	void setInitTest() {
		carFactory.initStatus(CARNUM);
		int status = carFactory.carStatus(CARNUM);
		Assertions.assertEquals(status, 1);
	}

	@Test
	@DisplayName("새로운 이동 상태를 저장한다.")
	void saveStatus() {
		int status = 2;
		carFactory.saveStatus(CARNUM, status);
		int new_status = carFactory.carStatus(CARNUM);
		Assertions.assertEquals(new_status, 2);
	}

	@Test
	@DisplayName("한번 이동 후 이동 상태를 +1하여 수정한다.")
	void updateStatus() {
		carFactory.saveStatus(CARNUM,1);
		int new_status = carFactory.updateStatus(CARNUM);
		Assertions.assertEquals(new_status,  2);
	}
}
