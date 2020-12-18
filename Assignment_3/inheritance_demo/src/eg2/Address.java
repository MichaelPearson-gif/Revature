package eg2;

public class Address {

	private int aid;
	private String streetName;
	private String cityName;
	private int zip;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	
	public Address(int aid, String streetName, String cityName, int zip) {
		super();
		this.aid = aid;
		this.streetName = streetName;
		this.cityName = cityName;
		this.zip = zip;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}
	
	@Override
	public String toString() {

		return "Address [aid=" + aid + ", streetName=" + streetName + ", cityName=" + cityName + ", zip=" + zip + "]";
	}
	
	
}
