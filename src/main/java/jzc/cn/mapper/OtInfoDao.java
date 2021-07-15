package jzc.cn.mapper;


import jzc.cn.OtInfo;
import jzc.cn.SearchOtInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: LiangYF
 * @Date: 2018/5/30 16:02
 */

@Mapper
public interface OtInfoDao {
    public List<OtInfo> selectOtsBySearchInfo(SearchOtInfo searchOtInfo);

    public OtInfo selectById(@Param("id") Integer id);

}
