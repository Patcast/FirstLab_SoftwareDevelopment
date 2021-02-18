public class COSensor extends Sensor {

	private float concentration;

	public COSensor (String type, String location,String manufacturer,float newConcentration) {
		super(type,location,manufacturer);
		this.concentration = newConcentration;
	}
	//Setters & Getters
	public float getConcentration() {
		return this.concentration;
	}
	public void setConcentration(float concentration) {
		this.concentration = concentration;
	}
	//Other methods

	@Override
	public void alarmProcedure() {
		super.alarmProcedure();
		System.out.println("Windows are being opened and siren is sounding");
	}
	@Override
	public String toString(){
		return "Info of "+ getActive() + " sensor (type = "+ getType()+" ), from "+getManufacturer()+" located at " + getLocation()+ "\nMinimum concentration: "+getConcentration();
	}



}