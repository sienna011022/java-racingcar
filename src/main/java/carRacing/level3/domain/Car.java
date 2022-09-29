package carRacing.level3.domain;

import carRacing.level3.service.MovingStartegy;
public class Car {

	private static final Integer DEFAULT_LOCATION = 1;
	private static final Integer MOVE_LOCATION = 1;
	private Integer location;
	private MovingStartegy movingStartegy = new MovingStartegy();
	public Car() {
		this.location = DEFAULT_LOCATION;
	}

	public int carLocation() {
		return location;
	}

	public void moveLocation() {
		if(movingStartegy.isMovable())
		this.location += MOVE_LOCATION;
	}


}
