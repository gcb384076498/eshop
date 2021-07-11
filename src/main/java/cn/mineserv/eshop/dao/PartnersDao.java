package cn.mineserv.eshop.dao;

import cn.mineserv.eshop.model.Partners;
import cn.mineserv.eshop.example.PartnersExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PartnersDao {
    long countByExample(PartnersExample example);

    int deleteByExample(PartnersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Partners record);

    int insertOrUpdate(Partners record);

    int insertOrUpdateSelective(Partners record);

    int insertSelective(Partners record);

    List<Partners> selectByExample(PartnersExample example);

    Partners selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Partners record, @Param("example") PartnersExample example);

    int updateByExample(@Param("record") Partners record, @Param("example") PartnersExample example);

    int updateByPrimaryKeySelective(Partners record);

    int updateByPrimaryKey(Partners record);

    List<Partners> findAll();

    List<Partners> findByAll(Partners partners);

    int updateBatch(List<Partners> list);

    int updateBatchSelective(List<Partners> list);

    int batchInsert(@Param("list") List<Partners> list);
}