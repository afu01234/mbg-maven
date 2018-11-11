package com.atguigu.mapper;

import com.atguigu.bean.Locations;
import com.atguigu.bean.LocationsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LocationsMapper {
    int countByExample(LocationsExample example);

    int deleteByExample(LocationsExample example);

    int deleteByPrimaryKey(Integer locationId);

    int insert(Locations record);

    int insertSelective(Locations record);

    List<Locations> selectByExample(LocationsExample example);

    Locations selectByPrimaryKey(Integer locationId);

    int updateByExampleSelective(@Param("record") Locations record, @Param("example") LocationsExample example);

    int updateByExample(@Param("record") Locations record, @Param("example") LocationsExample example);

    int updateByPrimaryKeySelective(Locations record);

    int updateByPrimaryKey(Locations record);
}