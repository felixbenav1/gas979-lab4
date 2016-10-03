package length;

/**
 * This class is an extension
 * of the super class Length
 * and handles objects with the
 * Yard unit<br>
 * @author Felix
 *
 */
public class Yard extends Length {
	
	
	  /**
	   * 1 inch = 0.0254 meters
	   */
	  public static final double METERS_PER_YARD = 0.9144;

	public Yard(double length) {
		super(length);
	}

	/**
	 * Adds length of other object
	 * to current object<br>
	 */
	public void add(Length other){
		//convert length of both to meters
		//then, add them and convert back to yards
		double meters = other.toMeters();
		this.setLength((this.toMeters() + meters)/METERS_PER_YARD);
	}
	
	/**
	 * Gets units of current object<br>
	 */
	public String getUnit(){
		//single unit
		if(this.getLength() == 1.0){
			String units = "yard";
			return units;
		}
		//more than one unit
		else{
			String units = "yards";
			return units;
		}
	}
	
	/**
	 * Converts current objects length to
	 * meters<br>
	 */
	public double toMeters(){
		//convert number by using constant
		double yrdtomet = this.getLength()*Yard.METERS_PER_YARD;
		return yrdtomet;
	}
	  
	  
}
