package cn.mineserv.eshop.dao;

import cn.mineserv.eshop.model.Pic;
import cn.mineserv.eshop.example.PicExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PicDao {
    long countByExample(PicExample example);

    int deleteByExample(PicExample example);

    int deleteByPrimaryKey(Integer picId);

    int insert(Pic record);

    int insertOrUpdate(Pic record);

    int insertOrUpdateSelective(Pic record);

    int insertSelective(Pic record);

    List<Pic> selectByExample(PicExample example);

    Pic selectByPrimaryKey(Integer picId);

    int updateByExampleSelective(@Param("record") Pic record, @Param("example") PicExample example);

    int updateByExample(@Param("record") Pic record, @Param("example") PicExample example);

    int updateByPrimaryKeySelective(Pic record);

    int updateByPrimaryKey(Pic record);

    List<Pic> findAll();

    List<Pic> findByAll(Pic pic);

    int updateBatch(List<Pic> list);

    int updateBatchSelective(List<Pic> list);

    int batchInsert(@Param("list") List<Pic> list);
}