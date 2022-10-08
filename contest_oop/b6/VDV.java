package contest_oop.b6;

public class VDV {
  private String code;
  private String name;
  private String unit;
  private double averageSpeed;

  public VDV() {
  }

  public VDV(String code, String name, String unit, double averageSpeed) {
    this.code = code;
    this.name = name;
    this.unit = unit;
    this.averageSpeed = averageSpeed;
  }

  @Override
  public String toString() {
    return code + " " + name + " " + unit + " " + String.format("%.0f", averageSpeed)+" Km/h";
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public double getAverageSpeed() {
    return averageSpeed;
  }

  public void setAverageSpeed(double averageSpeed) {
    this.averageSpeed = averageSpeed;
  }
}
