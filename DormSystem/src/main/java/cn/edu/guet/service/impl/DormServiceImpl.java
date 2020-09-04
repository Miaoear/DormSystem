package cn.edu.guet.service.impl;

import cn.edu.guet.mapper.DormMapper;
import cn.edu.guet.model.SsDorm;
import cn.edu.guet.service.IDormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DormServiceImpl implements IDormService {

    @Autowired
    DormMapper dormMapper;
    @Override
    public List<SsDorm> selectDorm()throws Exception {
        return dormMapper.selectDorm();
    }
    @Override
    public void saveDorm(SsDorm dorm) throws Exception{
        dormMapper.saveDorm(dorm) ;
    }

    @Override
    public void updateDorm(SsDorm ssDorm)throws Exception {
         dormMapper.updateDorm(ssDorm);
    }

    @Override
    public void deleteDorm(String dorNo){
        dormMapper.deleteDorm(dorNo);
    }
}
