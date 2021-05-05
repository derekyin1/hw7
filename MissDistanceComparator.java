/** Derek Yin 113251504 Recitation Section 1
*  This class defines a comparator that comapres two NearEarthObjects based on their miss Distances
*  @author Derek Yin
*/
public class MissDistanceComparator implements java.util.Comparator<NearEarthObject>{
/**
*This is the constructor for the MissDistanceComparator
*
*/
  public MissDistanceComparator(){

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
    if (n1.getMissDistance() == n2.getMissDistance()){
      return 0;
    }
    else if (n1.getMissDistance() > n2.getMissDistance()){
      return 1;
    }
    else return -1;
  }
}
