/** Derek Yin 113251504 Recitation Section 1
*  This class defines a comparator that comapres two NearEarthObjects based on their Diameters
*  @author Derek Yin
*/
public class DiameterComparator implements java.util.Comparator<NearEarthObject>{
/**
*This is the constructor for the DiameterComparator
*
*/
  public DiameterComparator(){

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
    if (n1.getAverageDiameter() == n2.getAverageDiameter()){
      return 0;
    }
    else if (n1.getAverageDiameter() > n2.getAverageDiameter()){
      return 1;
    }
    else return -1;
  }
}
