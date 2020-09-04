package cn.edu.guet.mapper;

import cn.edu.guet.model.Fangke;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FangkeMapper {
    void laifang(Fangke fangke) throws Exception;
    List<Fangke> chaxun();
    void bianji(Fangke fangke)throws Exception;
}

