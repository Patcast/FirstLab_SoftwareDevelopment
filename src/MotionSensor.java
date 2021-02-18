public class MotionSensor extends Sensor {

	private int distance;

	public MotionSensor (String type, String location,String manufacturer,int newDistance) {
		super(type,location,manufacturer);
		this.distance = newDistance;
	}
	////
	public int getDistance() {
		return this.distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	////
	@Override
	public void alarmProcedure() {
		super.alarmProcedure();
		System.out.println("The police has been contacted and siren is sounding");
	}
	@Override
	public String toString(){
		return "Info of "+ getActive() + " sensor (type = "+ getType()+" ), from "+getManufacturer()+" located at " + getLocation()+ "\nActive radius of: "+getDistance();
	}

}