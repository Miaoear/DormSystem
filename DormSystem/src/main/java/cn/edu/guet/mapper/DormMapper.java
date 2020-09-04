package cn.edu.guet.mapper;

import cn.edu.guet.model.SsDorm;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DormMapper {
    List<SsDorm> selectDorm() throws Exception;
    void updateDorm(SsDorm ssDorm)throws Exception;
    void deleteDorm(String dorNo);
    void saveDorm(SsDorm dorm) throws Exception;
}
