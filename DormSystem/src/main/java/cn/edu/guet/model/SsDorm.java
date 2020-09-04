package cn.edu.guet.model;

import lombok.Data;


public class SsDorm {
    private String dorNo;
    private String dorManage;
    private String bedNum;

    public String getDorNo() {
        return dorNo;
    }

    public void setDorNo(String dorNo) {
        this.dorNo = dorNo;
    }

    public String getDorManage() {
        return dorManage;
    }

    public void setDorManage(String dorManage) {
        this.dorManage = dorManage;
    }

    public String getBedNum() {
        return bedNum;
    }

    public void setBedNum(String bedNum) {
        this.bedNum = bedNum;
    }
}
