/** Derek Yin 113251504 Recitation Section 1
*  This class defines a comparator that comapres two NearEarthObjects based on their reference ID
*  @author Derek Yin
*/
public class ReferenceIDComparator implements java.util.Comparator<NearEarthObject>{
/**
*This is the constructor for the ReferenceIDComparator
*
*/
  public ReferenceIDComparator(){

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
    if (n1.getReferenceID() == n2.getReferenceID()){
      return 0;
    }
    else if (n1.getReferenceID() > n2.getReferenceID()){
      return 1;
    }
    else return -1;
  }
}
