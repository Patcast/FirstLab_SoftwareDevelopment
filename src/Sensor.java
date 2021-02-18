public abstract class Sensor {

	private String type;
	private String location;
	private String manufacturer;
	private boolean active;

	public Sensor (String type, String location,String manufacturer){
		this.type = type;
		this.location= location;
		this.manufacturer=manufacturer;
		active = false;

	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLocation() {
		return this.location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getManufacturer() {
		return this.manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public boolean getActive() {
		return this.active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}

	public void alarmProcedure(){
		System.out.println("Alarm of the"+ getType() +" at the " + getLocation() + " is activated. Sensor made by "+ getManufacturer());
	}

	@Override
	public boolean equals(Object o) {
		if(o== this){
			return true; }
		if(o.getClass() != this.getClass()){
			return false;
		}
		//Introducing type casting
		Sensor guest = (Sensor)o;
		return ( ((this.type.equals(guest.type))&&(this.location.equals(guest.location)))&&(this.manufacturer.equals(guest.manufacturer)));
	}


}