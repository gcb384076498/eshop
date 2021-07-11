package cn.mineserv.eshop.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.mineserv.eshop.example.GoodsExample;
import java.util.List;
import cn.mineserv.eshop.dao.GoodsDao;
import cn.mineserv.eshop.model.Goods;
@Service
public class GoodsService{

    @Resource
    private GoodsDao goodsDao;

    
    public long countByExample(GoodsExample example) {
        return goodsDao.countByExample(example);
    }

    
    public int deleteByExample(GoodsExample example) {
        return goodsDao.deleteByExample(example);
    }

    
    public int deleteByPrimaryKey(Integer goodsId) {
        return goodsDao.deleteByPrimaryKey(goodsId);
    }

    
    public int insert(Goods record) {
        return goodsDao.insert(record);
    }

    
    public int insertOrUpdate(Goods record) {
        return goodsDao.insertOrUpdate(record);
    }

    
    public int insertOrUpdateSelective(Goods record) {
        return goodsDao.insertOrUpdateSelective(record);
    }

    
    public int insertSelective(Goods record) {
        return goodsDao.insertSelective(record);
    }

    
    public List<Goods> selectByExample(GoodsExample example) {
        return goodsDao.selectByExample(example);
    }

    
    public Goods selectByPrimaryKey(Integer goodsId) {
        return goodsDao.selectByPrimaryKey(goodsId);
    }

    
    public int updateByExampleSelective(Goods record,GoodsExample example) {
        return goodsDao.updateByExampleSelective(record,example);
    }

    
    public int updateByExample(Goods record,GoodsExample example) {
        return goodsDao.updateByExample(record,example);
    }

    
    public int updateByPrimaryKeySelective(Goods record) {
        return goodsDao.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(Goods record) {
        return goodsDao.updateByPrimaryKey(record);
    }

    
    public List<Goods> findAll() {
        return goodsDao.findAll();
    }

    
    public List<Goods> findByAll(Goods goods) {
        return goodsDao.findByAll(goods);
    }

    
    public int updateBatch(List<Goods> list) {
        return goodsDao.updateBatch(list);
    }

    
    public int updateBatchSelective(List<Goods> list) {
        return goodsDao.updateBatchSelective(list);
    }

    
    public int batchInsert(List<Goods> list) {
        return goodsDao.batchInsert(list);
    }

}
