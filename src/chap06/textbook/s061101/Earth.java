package chap06.textbook.s061101;

public class Earth {
	static final double EARTH_RADIUS = 6400;
	final static double EARTH_SURFACE_AREA; //final static은 위치 바뀌어도 상관x
	
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
}
