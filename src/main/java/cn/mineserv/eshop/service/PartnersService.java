package cn.mineserv.eshop.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import cn.mineserv.eshop.example.PartnersExample;
import cn.mineserv.eshop.dao.PartnersDao;
import cn.mineserv.eshop.model.Partners;
@Service
public class PartnersService{

    @Resource
    private PartnersDao partnersDao;

    
    public long countByExample(PartnersExample example) {
        return partnersDao.countByExample(example);
    }

    
    public int deleteByExample(PartnersExample example) {
        return partnersDao.deleteByExample(example);
    }

    
    public int deleteByPrimaryKey(Integer id) {
        return partnersDao.deleteByPrimaryKey(id);
    }

    
    public int insert(Partners record) {
        return partnersDao.insert(record);
    }

    
    public int insertOrUpdate(Partners record) {
        return partnersDao.insertOrUpdate(record);
    }

    
    public int insertOrUpdateSelective(Partners record) {
        return partnersDao.insertOrUpdateSelective(record);
    }

    
    public int insertSelective(Partners record) {
        return partnersDao.insertSelective(record);
    }

    
    public List<Partners> selectByExample(PartnersExample example) {
        return partnersDao.selectByExample(example);
    }

    
    public Partners selectByPrimaryKey(Integer id) {
        return partnersDao.selectByPrimaryKey(id);
    }

    
    public int updateByExampleSelective(Partners record,PartnersExample example) {
        return partnersDao.updateByExampleSelective(record,example);
    }

    
    public int updateByExample(Partners record,PartnersExample example) {
        return partnersDao.updateByExample(record,example);
    }

    
    public int updateByPrimaryKeySelective(Partners record) {
        return partnersDao.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(Partners record) {
        return partnersDao.updateByPrimaryKey(record);
    }

    
    public List<Partners> findAll() {
        return partnersDao.findAll();
    }

    
    public List<Partners> findByAll(Partners partners) {
        return partnersDao.findByAll(partners);
    }

    
    public int updateBatch(List<Partners> list) {
        return partnersDao.updateBatch(list);
    }

    
    public int updateBatchSelective(List<Partners> list) {
        return partnersDao.updateBatchSelective(list);
    }

    
    public int batchInsert(List<Partners> list) {
        return partnersDao.batchInsert(list);
    }

}
