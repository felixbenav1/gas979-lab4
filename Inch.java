package length;

/**
 * This class is an extension
 * of the Length superclass and
 * handles lengths of the Inch
 * unit<br>
 * @author Felix
 *
 */
public class Inch extends Length {
	
	  /**
	   * 1 inch = 0.0254 meters
	   */
	  public static final double METERS_PER_INCH = 0.0254;
	  
	  public Inch(double length) {
		super(length);
		
	}

	  	/**
	  	 * adds length of another object to
	  	 * this object<br>
	  	 */
		public void add(Length other){
			double meters = other.toMeters();
			this.setLength((this.toMeters() + meters)/METERS_PER_INCH);
		}
		
		/**
		 * gets units of current object<br>
		 */
		public String getUnit(){
			if(this.getLength() == 1.0){
				String units = "inch";
				return units;
			}
			else{
				String units = "inches";
				return units;
			}
		}
		
		/**
		 * Converts object length to meters<br>
		 */
		public double toMeters(){
			double intomet = this.getLength()*Inch.METERS_PER_INCH;
			return intomet;
		}
	  
	 
}
