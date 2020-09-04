package cn.edu.guet.service;
import cn.edu.guet.model.Fangke;

import java.util.List;

public interface IFangkeService {
    void laifang(Fangke fangke) throws Exception;
    List<Fangke> chaxun();
    void bianji(Fangke fangke) throws Exception;
}
