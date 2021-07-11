package cn.mineserv.eshop.dao;

import cn.mineserv.eshop.model.Address;
import cn.mineserv.eshop.example.AddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AddressDao {
    long countByExample(AddressExample example);

    int deleteByExample(AddressExample example);

    int deleteByPrimaryKey(Integer addrId);

    int insert(Address record);

    int insertOrUpdate(Address record);

    int insertOrUpdateSelective(Address record);

    int insertSelective(Address record);

    List<Address> selectByExample(AddressExample example);

    Address selectByPrimaryKey(Integer addrId);

    int updateByExampleSelective(@Param("record") Address record, @Param("example") AddressExample example);

    int updateByExample(@Param("record") Address record, @Param("example") AddressExample example);

    int updateByPrimaryKeySelective(Address record);

    int updateByPrimaryKey(Address record);

    List<Address> findAll();

    List<Address> findByAll(Address address);

    int updateBatch(List<Address> list);

    int updateBatchSelective(List<Address> list);

    int batchInsert(@Param("list") List<Address> list);
}