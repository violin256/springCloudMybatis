package jzc.cn.service;

import jzc.cn.OtInfo;
import jzc.cn.SearchOtInfo;
import jzc.cn.mapper.OtInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lhl98
 */
@Service("OtService")
public class OtService {

    @Autowired
    private OtInfoDao otInfoDao;

    public OtInfo selectOne(Integer id) {
        return otInfoDao.selectById(id);
    }

    public List<OtInfo> selectList(SearchOtInfo searchOtInfo) {
        List<OtInfo> temp = otInfoDao.selectOtsBySearchInfo(searchOtInfo);
        return temp;
    }
}
