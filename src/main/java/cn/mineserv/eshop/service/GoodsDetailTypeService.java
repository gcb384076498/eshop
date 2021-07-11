package cn.mineserv.eshop.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.mineserv.eshop.example.GoodsDetailTypeExample;
import java.util.List;
import cn.mineserv.eshop.model.GoodsDetailType;
import cn.mineserv.eshop.dao.GoodsDetailTypeDao;
@Service
public class GoodsDetailTypeService{

    @Resource
    private GoodsDetailTypeDao goodsDetailTypeDao;

    
    public long countByExample(GoodsDetailTypeExample example) {
        return goodsDetailTypeDao.countByExample(example);
    }

    
    public int deleteByExample(GoodsDetailTypeExample example) {
        return goodsDetailTypeDao.deleteByExample(example);
    }

    
    public int deleteByPrimaryKey(Integer typeId) {
        return goodsDetailTypeDao.deleteByPrimaryKey(typeId);
    }

    
    public int insert(GoodsDetailType record) {
        return goodsDetailTypeDao.insert(record);
    }

    
    public int insertOrUpdate(GoodsDetailType record) {
        return goodsDetailTypeDao.insertOrUpdate(record);
    }

    
    public int insertOrUpdateSelective(GoodsDetailType record) {
        return goodsDetailTypeDao.insertOrUpdateSelective(record);
    }

    
    public int insertSelective(GoodsDetailType record) {
        return goodsDetailTypeDao.insertSelective(record);
    }

    
    public List<GoodsDetailType> selectByExample(GoodsDetailTypeExample example) {
        return goodsDetailTypeDao.selectByExample(example);
    }

    
    public GoodsDetailType selectByPrimaryKey(Integer typeId) {
        return goodsDetailTypeDao.selectByPrimaryKey(typeId);
    }

    
    public int updateByExampleSelective(GoodsDetailType record,GoodsDetailTypeExample example) {
        return goodsDetailTypeDao.updateByExampleSelective(record,example);
    }

    
    public int updateByExample(GoodsDetailType record,GoodsDetailTypeExample example) {
        return goodsDetailTypeDao.updateByExample(record,example);
    }

    
    public int updateByPrimaryKeySelective(GoodsDetailType record) {
        return goodsDetailTypeDao.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(GoodsDetailType record) {
        return goodsDetailTypeDao.updateByPrimaryKey(record);
    }

    
    public List<GoodsDetailType> findAll() {
        return goodsDetailTypeDao.findAll();
    }

    
    public List<GoodsDetailType> findByAll(GoodsDetailType goodsDetailType) {
        return goodsDetailTypeDao.findByAll(goodsDetailType);
    }

    
    public int updateBatch(List<GoodsDetailType> list) {
        return goodsDetailTypeDao.updateBatch(list);
    }

    
    public int updateBatchSelective(List<GoodsDetailType> list) {
        return goodsDetailTypeDao.updateBatchSelective(list);
    }

    
    public int batchInsert(List<GoodsDetailType> list) {
        return goodsDetailTypeDao.batchInsert(list);
    }

}
