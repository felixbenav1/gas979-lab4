package length;

/**
 * This object is an extension
 * of the length object and
 * handles units of feet<br>
 * @author Felix
 *
 */
public class Foot extends Length{
	  /**
	   * 1 inch = 0.0254 meters
	   */
	  public static final double METERS_PER_FOOT = 0.3048;

	  /**
	   * 
	   * @param length
	   */
	public Foot(double length) {
		super(length);
		
	}
	
	/**
	 * Adds length of another object
	 * to this object<br>
	 */
	public void add(Length other){
		double meters = other.toMeters();
		this.setLength((this.toMeters() + meters)/METERS_PER_FOOT);
	}
	
	/**
	 * Gets units of object<br>
	 */
	public String getUnit(){
		if(this.getLength() == 1.0){
			String units = "foot";
			return units;
		}
		else{
			String units = "feet";
			return units;
		}
	}
	
	/**
	 * converts object length to meters
	 */
	public double toMeters(){
		double yrdtomet = this.getLength()*Foot.METERS_PER_FOOT;
		return yrdtomet;
	}
	  

}
