package cn.mineserv.eshop.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import cn.mineserv.eshop.example.PicExample;
import cn.mineserv.eshop.model.Pic;
import cn.mineserv.eshop.dao.PicDao;
@Service
public class PicService{

    @Resource
    private PicDao picDao;

    
    public long countByExample(PicExample example) {
        return picDao.countByExample(example);
    }

    
    public int deleteByExample(PicExample example) {
        return picDao.deleteByExample(example);
    }

    
    public int deleteByPrimaryKey(Integer picId) {
        return picDao.deleteByPrimaryKey(picId);
    }

    
    public int insert(Pic record) {
        return picDao.insert(record);
    }

    
    public int insertOrUpdate(Pic record) {
        return picDao.insertOrUpdate(record);
    }

    
    public int insertOrUpdateSelective(Pic record) {
        return picDao.insertOrUpdateSelective(record);
    }

    
    public int insertSelective(Pic record) {
        return picDao.insertSelective(record);
    }

    
    public List<Pic> selectByExample(PicExample example) {
        return picDao.selectByExample(example);
    }

    
    public Pic selectByPrimaryKey(Integer picId) {
        return picDao.selectByPrimaryKey(picId);
    }

    
    public int updateByExampleSelective(Pic record,PicExample example) {
        return picDao.updateByExampleSelective(record,example);
    }

    
    public int updateByExample(Pic record,PicExample example) {
        return picDao.updateByExample(record,example);
    }

    
    public int updateByPrimaryKeySelective(Pic record) {
        return picDao.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(Pic record) {
        return picDao.updateByPrimaryKey(record);
    }

    
    public List<Pic> findAll() {
        return picDao.findAll();
    }

    
    public List<Pic> findByAll(Pic pic) {
        return picDao.findByAll(pic);
    }

    
    public int updateBatch(List<Pic> list) {
        return picDao.updateBatch(list);
    }

    
    public int updateBatchSelective(List<Pic> list) {
        return picDao.updateBatchSelective(list);
    }

    
    public int batchInsert(List<Pic> list) {
        return picDao.batchInsert(list);
    }

}
