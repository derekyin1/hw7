public class DiameterComparator implements java.util.Comparator<NearEarthObject>{

  public DiameterComparator(){

  }

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
