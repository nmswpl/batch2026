package in.co.nmsworks.training.week3.Day2;

public class MapPractice {
    Integer studendId;
    String studentName;

    public MapPractice(Integer studendId, String studentName) {
        this.studendId = studendId;
        this.studentName = studentName;
    }

    public Integer getStudendId() {
        return studendId;
    }

    public void setStudendId(Integer studendId) {
        this.studendId = studendId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "mapPractice{" +
                "studendId=" + studendId +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}
