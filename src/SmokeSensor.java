public class SmokeSensor extends Sensor {

	private boolean heatDetection;

	public SmokeSensor(String type, String location,String manufacturer,boolean heatDetection) {
		super(type,location,manufacturer);
		this.heatDetection=heatDetection;
	}
	////
	public boolean getHeatDetection() {
		return this.heatDetection;
	}
	public void setHeatDetection(boolean heatDetection) {
		this.heatDetection = heatDetection;
	}
	////

	@Override
	public void alarmProcedure() {
		super.alarmProcedure();
		System.out.println("The windows are closing and the siren is sounding");
	}
	@Override
	public String toString(){
		return "Info of "+ getActive() + " sensor (type = "+ getType()+" ), from "+getManufacturer()+" located at " + getLocation()+ "\nSmokeOnly = true : "+getHeatDetection();
	}


}