package length;

/**
 * This class is an extension
 * of the Length and handles
 * lengths of the Meter unit<br>
 * @author Felix
 *
 */
public class Meter extends Length {

	public Meter(double length) {
		super(length);
		
	}
	
	/**
	 * Adds length of another object
	 * to this object<br>
	 */
	public void add(Length other){
		double meters = other.toMeters();
		this.setLength((this.getLength() + meters));
	}
	
	/**
	 * Gets units of this object<br>
	 */
	public String getUnit(){
		if(this.getLength() == 1.0){
			String units = "meter";
			return units;
		}
		else{
			String units = "meters";
			return units;
		}
	}
	
	/**
	 * Converts current length to meters<br>
	 */
	public double toMeters(){
		return this.getLength();
	}

}
