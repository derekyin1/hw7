/** Derek Yin 113251504 Recitation Section 1
*  This class defines a comparator that comapres two NearEarthObjects based on their Approach dates
*  @author Derek Yin
*/
public class ApproachDateComparator implements java.util.Comparator<NearEarthObject>{
/**
*This is the constructor for the ApproachDateComparator
*
*/
  public ApproachDateComparator(){

  }
/**
*This method compares two NearEarthObjects.
*@param n1
* first NearEarthObject to compare
*@param n2
* second NearEarthObject to compare
*@return
*returns -1, 0, or 1 based on the java.util.Comparator logic
*/
  public int compare(NearEarthObject n1, NearEarthObject n2){
    return n1.getClosestApproachDate().compareTo(n2.getClosestApproachDate());
  }
}
