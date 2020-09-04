package cn.edu.guet.service.impl;

import cn.edu.guet.mapper.FangkeMapper;
import cn.edu.guet.model.Fangke;
import cn.edu.guet.service.IFangkeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FangkeServiceImpl implements IFangkeService {
    @Autowired
    FangkeMapper fangkeMapper;
    @Override
    public void laifang(Fangke fangke)throws Exception {
        fangkeMapper.laifang(fangke);
    }

    @Override
    public List<Fangke>  chaxun() {
        return fangkeMapper.chaxun();
    }

    @Override
    public void bianji(Fangke fangke) throws Exception {
        fangkeMapper.bianji(fangke);
    }
}
