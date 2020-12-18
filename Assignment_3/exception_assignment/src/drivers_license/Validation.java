package drivers_license;

public class Validation {

	public boolean isValidDL(String license) {
		if (!license.matches("[A-Z][0-9]{7}")) {
			throw new InvalidLicenseException("Drivers License: " + license + " is INVALID");
		}
		return true;
	}
	
}
