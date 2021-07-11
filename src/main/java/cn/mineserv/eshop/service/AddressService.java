package cn.mineserv.eshop.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.mineserv.eshop.model.Address;
import cn.mineserv.eshop.example.AddressExample;
import java.util.List;
import cn.mineserv.eshop.dao.AddressDao;
@Service
public class AddressService{

    @Resource
    private AddressDao addressDao;

    
    public long countByExample(AddressExample example) {
        return addressDao.countByExample(example);
    }

    
    public int deleteByExample(AddressExample example) {
        return addressDao.deleteByExample(example);
    }

    
    public int deleteByPrimaryKey(Integer addrId) {
        return addressDao.deleteByPrimaryKey(addrId);
    }

    
    public int insert(Address record) {
        return addressDao.insert(record);
    }

    
    public int insertOrUpdate(Address record) {
        return addressDao.insertOrUpdate(record);
    }

    
    public int insertOrUpdateSelective(Address record) {
        return addressDao.insertOrUpdateSelective(record);
    }

    
    public int insertSelective(Address record) {
        return addressDao.insertSelective(record);
    }

    
    public List<Address> selectByExample(AddressExample example) {
        return addressDao.selectByExample(example);
    }

    
    public Address selectByPrimaryKey(Integer addrId) {
        return addressDao.selectByPrimaryKey(addrId);
    }

    
    public int updateByExampleSelective(Address record,AddressExample example) {
        return addressDao.updateByExampleSelective(record,example);
    }

    
    public int updateByExample(Address record,AddressExample example) {
        return addressDao.updateByExample(record,example);
    }

    
    public int updateByPrimaryKeySelective(Address record) {
        return addressDao.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(Address record) {
        return addressDao.updateByPrimaryKey(record);
    }

    
    public List<Address> findAll() {
        return addressDao.findAll();
    }

    
    public List<Address> findByAll(Address address) {
        return addressDao.findByAll(address);
    }

    
    public int updateBatch(List<Address> list) {
        return addressDao.updateBatch(list);
    }

    
    public int updateBatchSelective(List<Address> list) {
        return addressDao.updateBatchSelective(list);
    }

    
    public int batchInsert(List<Address> list) {
        return addressDao.batchInsert(list);
    }

}
