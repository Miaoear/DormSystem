package cn.edu.guet.service;

import cn.edu.guet.model.SsDorm;

import java.util.List;

public interface IDormService {
    List<SsDorm> selectDorm()throws Exception;
    void updateDorm(SsDorm ssDorm)throws Exception;
    void deleteDorm(String dorNo);
    void saveDorm(SsDorm dorm) throws Exception;
}
