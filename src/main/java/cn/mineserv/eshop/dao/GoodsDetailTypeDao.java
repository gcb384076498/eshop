package cn.mineserv.eshop.dao;

import cn.mineserv.eshop.model.GoodsDetailType;
import cn.mineserv.eshop.example.GoodsDetailTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GoodsDetailTypeDao {
    long countByExample(GoodsDetailTypeExample example);

    int deleteByExample(GoodsDetailTypeExample example);

    int deleteByPrimaryKey(Integer typeId);

    int insert(GoodsDetailType record);

    int insertOrUpdate(GoodsDetailType record);

    int insertOrUpdateSelective(GoodsDetailType record);

    int insertSelective(GoodsDetailType record);

    List<GoodsDetailType> selectByExample(GoodsDetailTypeExample example);

    GoodsDetailType selectByPrimaryKey(Integer typeId);

    int updateByExampleSelective(@Param("record") GoodsDetailType record, @Param("example") GoodsDetailTypeExample example);

    int updateByExample(@Param("record") GoodsDetailType record, @Param("example") GoodsDetailTypeExample example);

    int updateByPrimaryKeySelective(GoodsDetailType record);

    int updateByPrimaryKey(GoodsDetailType record);

    List<GoodsDetailType> findAll();

    List<GoodsDetailType> findByAll(GoodsDetailType goodsDetailType);

    int updateBatch(List<GoodsDetailType> list);

    int updateBatchSelective(List<GoodsDetailType> list);

    int batchInsert(@Param("list") List<GoodsDetailType> list);
}