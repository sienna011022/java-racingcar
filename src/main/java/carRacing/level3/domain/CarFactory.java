package carRacing.level3.domain;

import java.util.HashMap;

public class CarFactory {

	public static final Integer DEFAULT_STATUS = 1;
	public static HashMap<Integer, Integer> carMap = new HashMap<>();

	public void setInitStatus(int carNum) {
		carMap.put(carNum, DEFAULT_STATUS);
	}

	public Integer getCarStatus(int carNum) {
		return carMap.get(carNum);
	}

	public void saveStatus(int carNum, int newStatus) {
		carMap.put(carNum, newStatus);
	}

}
