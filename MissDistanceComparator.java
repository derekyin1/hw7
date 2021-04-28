public class MissDistanceComparator implements java.util.Comparator<NearEarthObject>{
  public int compare(Object o1, Object o2){
    NearEarthObject n1 = (NearEarthObject) o1;
    NearEarthObject n2 = (NearEarthObject) o2;
    if (n1.getMissDistance() == n2.getMissDistance()){
      return 0;
    }
    else if (n1.getMissDistance() > n2.getMissDistance()){
      return 1;
    }
    else return -1;
  }
}
