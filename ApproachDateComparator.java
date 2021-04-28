public class ApproachDateComparator implements java.util.Comparator<NearEarthObject>{
  public int compare(Object o1, Object o2){
    NearEarthObject n1 = (NearEarthObject) o1;
    NearEarthObject n2 = (NearEarthObject) o2;
    return n1.getClosestApproachDate().compareTo(n2.getClosestApproachDate());
  }
}
