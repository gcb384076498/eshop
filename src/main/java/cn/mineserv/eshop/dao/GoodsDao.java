package cn.mineserv.eshop.dao;

import cn.mineserv.eshop.model.Goods;
import cn.mineserv.eshop.example.GoodsExample;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GoodsDao {
    long countByExample(GoodsExample example);

    int deleteByExample(GoodsExample example);

    int deleteByPrimaryKey(Integer goodsId);

    int insert(Goods record);

    int insertOrUpdate(Goods record);

    int insertOrUpdateSelective(Goods record);

    int insertSelective(Goods record);

    List<Goods> selectByExample(GoodsExample example);

    Goods selectByPrimaryKey(Integer goodsId);

    int updateByExampleSelective(@Param("record") Goods record, @Param("example") GoodsExample example);

    int updateByExample(@Param("record") Goods record, @Param("example") GoodsExample example);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);

    List<Goods> findAll();

    List<Goods> findByAll(Goods goods);

    int updateBatch(List<Goods> list);

    int updateBatchSelective(List<Goods> list);

    int batchInsert(@Param("list") List<Goods> list);
}