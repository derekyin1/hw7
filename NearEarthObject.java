import java.util.*;
public class NearEarthObject{
  private int referenceID;
  private String name;
  private double absoluteMagnitude;
  private double averageDiameter;
  private boolean isDangerous;
  private Date closestApproachDate;
  private double missDistance;
  private String orbitingBody;

  public NearEarthObject(int referenceIDInit, String nameInit, double absoluteMagnitudeInit, double minDiameter, double maxDiameter, boolean isDangerousInit, long closestDateTimestamp, double missDistanceInit, String orbitingBodyInit){
    referenceID = referenceIDInit;
    name = nameInit;
    absoluteMagnitude = absoluteMagnitudeInit;
    averageDiameter = (minDiameter + maxDiameter) / 2;
    isDangerous = isDangerousInit;
    closestApproachDate = new Date(closestDateTimestamp);
    missDistance = missDistanceInit;
    orbitingBody = orbitingBodyInit;
  }

  public int getReferenceID(){
    return referenceID;
  }

  public void setReferenceID(int newID){
    referenceID = newID;
  }

  public String getName(){
    return name;
  }

  public void setName(String newName){
    name = newName;
  }

  public double getAbsoluteMagnitude(){
    return absoluteMagnitude;
  }

  public void setAbsoluteMagnitude(double newMagnitude){
    absoluteMagnitude = newMagnitude;
  }

  public double getAverageDiameter(){
    return averageDiameter;
  }

  public void setAverageDiameter(double newDiameter){
    averageDiameter = newDiameter;
  }

  public boolean getIsDangerous(){
    return isDangerous;
  }

  public void setIsDangerous(boolean newBool){
    isDangerous = newBool;
  }

  public Date getClosestApproachDate(){
    return closestApproachDate;
  }

  public void setClosestApproachDate(Date newDate){
    closestApproachDate = newDate;
  }

  public double getMissDistance(){
    return missDistance;
  }

  public void setMissDistance(double newDistance){
    missDistance = newDistance;
  }

  public String getOrbitingBody(){
    return orbitingBody;
  }

  public void setOrbitingBody(String newBody){
    orbitingBody = newBody;
  }





}
