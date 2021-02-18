import java.util.ArrayList;

public class ControlCenter {

	private String building;
	private final Size buildingSize;
	private ArrayList<Sensor> sensors;

	//Constructor
	public ControlCenter( String building,Size chosenSize) {
		this.building = building;
		this.sensors = new ArrayList<>();
		buildingSize = chosenSize;
	}
	//Setters & Getters
	public String getBuilding() { return this.building; }
	public void setBuilding(String building) {
		this.building = building;
	}
	//Other methods
	public void addSensor(Sensor newSensor ) {
		boolean add = true;
		if (sensors.size()!= 0) {
			for (Sensor sensor : sensors) {
				if (newSensor.equals(sensor)) {
					add = false;
					break;
				}
			}
		}
		if(add) {
			sensors.add(newSensor);
		}
	}
	public void testSensor(Sensor testSensor ) {
		if(testSensor.getActive()) {
			testSensor.alarmProcedure();
			System.out.println(sensors.indexOf(testSensor));

		}
		else {
			System.out.println(-1);
		}
	}
	public int testAllSensors() {
		int activeSensors = 0;
		for (Sensor s : sensors) {
			if(s.getActive()) {
				s.alarmProcedure();
				activeSensors++;
			}
		}
		return activeSensors;
	}
	public void Overview(){
		System.out.println("Overview of all sensors @ "+building+" ( "+buildingSize+" )");
		for(Sensor s : sensors){
			System.out.println(" ");
			System.out.println(s);
		}


	}
}