public class MissDistanceComparator implements java.util.Comparator<NearEarthObject>{

  public MissDistanceComparator(){

  }

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
