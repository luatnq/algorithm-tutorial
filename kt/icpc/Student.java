package kt.icpc;

public class Student {
  private String code;
  private String name;
  private String teamName;
  private String schoolName;

  public Student() {
  }

  public Student(String code, String name, String teamName, String schoolName) {
    this.code = code;
    this.name = name;
    this.teamName = teamName;
    this.schoolName = schoolName;
  }

  @Override
  public String toString() {
    return  code + " "+ name + " " + teamName + " " + schoolName;
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

  public String getTeamName() {
    return teamName;
  }

  public void setTeamName(String teamName) {
    this.teamName = teamName;
  }

  public String getSchoolName() {
    return schoolName;
  }

  public void setSchoolName(String schoolName) {
    this.schoolName = schoolName;
  }
}
