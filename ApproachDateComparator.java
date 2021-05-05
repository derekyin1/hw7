public class ApproachDateComparator implements java.util.Comparator<NearEarthObject>{

  public ApproachDateComparator(){

  }

  public int compare(NearEarthObject n1, NearEarthObject n2){
    return n1.getClosestApproachDate().compareTo(n2.getClosestApproachDate());
  }
}
