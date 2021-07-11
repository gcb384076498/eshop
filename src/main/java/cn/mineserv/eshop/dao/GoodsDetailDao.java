package cn.mineserv.eshop.dao;

import cn.mineserv.eshop.model.GoodsDetail;
import cn.mineserv.eshop.example.GoodsDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GoodsDetailDao {
    long countByExample(GoodsDetailExample example);

    int deleteByExample(GoodsDetailExample example);

    int deleteByPrimaryKey(Integer contentId);

    int insert(GoodsDetail record);

    int insertOrUpdate(GoodsDetail record);

    int insertOrUpdateSelective(GoodsDetail record);

    int insertSelective(GoodsDetail record);

    List<GoodsDetail> selectByExample(GoodsDetailExample example);

    GoodsDetail selectByPrimaryKey(Integer contentId);

    int updateByExampleSelective(@Param("record") GoodsDetail record, @Param("example") GoodsDetailExample example);

    int updateByExample(@Param("record") GoodsDetail record, @Param("example") GoodsDetailExample example);

    int updateByPrimaryKeySelective(GoodsDetail record);

    int updateByPrimaryKey(GoodsDetail record);

    List<GoodsDetail> findAll();

    List<GoodsDetail> findByAll(GoodsDetail goodsDetail);

    int updateBatch(List<GoodsDetail> list);

    int updateBatchSelective(List<GoodsDetail> list);

    int batchInsert(@Param("list") List<GoodsDetail> list);
}