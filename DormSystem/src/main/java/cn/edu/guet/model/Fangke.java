package cn.edu.guet.model;
public class Fangke {
    private int FKID;
    private String lFName;
    private String sFName;
    private String relation;
    private String startTime;
    private String endTime;

    public int getFKID() {
        return FKID;
    }

    public void setFKID(int FKID) {
        this.FKID = FKID;
    }

    public String getlFName() {
        return lFName;
    }

    public void setlFName(String lFName) {
        this.lFName = lFName;
    }

    public String getsFName() {
        return sFName;
    }

    public void setsFName(String sFName) {
        this.sFName = sFName;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
