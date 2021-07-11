package cn.mineserv.eshop.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import cn.mineserv.eshop.dao.GoodsDetailDao;
import cn.mineserv.eshop.example.GoodsDetailExample;
import cn.mineserv.eshop.model.GoodsDetail;
@Service
public class GoodsDetailService{

    @Resource
    private GoodsDetailDao goodsDetailDao;

    
    public long countByExample(GoodsDetailExample example) {
        return goodsDetailDao.countByExample(example);
    }

    
    public int deleteByExample(GoodsDetailExample example) {
        return goodsDetailDao.deleteByExample(example);
    }

    
    public int deleteByPrimaryKey(Integer contentId) {
        return goodsDetailDao.deleteByPrimaryKey(contentId);
    }

    
    public int insert(GoodsDetail record) {
        return goodsDetailDao.insert(record);
    }

    
    public int insertOrUpdate(GoodsDetail record) {
        return goodsDetailDao.insertOrUpdate(record);
    }

    
    public int insertOrUpdateSelective(GoodsDetail record) {
        return goodsDetailDao.insertOrUpdateSelective(record);
    }

    
    public int insertSelective(GoodsDetail record) {
        return goodsDetailDao.insertSelective(record);
    }

    
    public List<GoodsDetail> selectByExample(GoodsDetailExample example) {
        return goodsDetailDao.selectByExample(example);
    }

    
    public GoodsDetail selectByPrimaryKey(Integer contentId) {
        return goodsDetailDao.selectByPrimaryKey(contentId);
    }

    
    public int updateByExampleSelective(GoodsDetail record,GoodsDetailExample example) {
        return goodsDetailDao.updateByExampleSelective(record,example);
    }

    
    public int updateByExample(GoodsDetail record,GoodsDetailExample example) {
        return goodsDetailDao.updateByExample(record,example);
    }

    
    public int updateByPrimaryKeySelective(GoodsDetail record) {
        return goodsDetailDao.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(GoodsDetail record) {
        return goodsDetailDao.updateByPrimaryKey(record);
    }

    
    public List<GoodsDetail> findAll() {
        return goodsDetailDao.findAll();
    }

    
    public List<GoodsDetail> findByAll(GoodsDetail goodsDetail) {
        return goodsDetailDao.findByAll(goodsDetail);
    }

    
    public int updateBatch(List<GoodsDetail> list) {
        return goodsDetailDao.updateBatch(list);
    }

    
    public int updateBatchSelective(List<GoodsDetail> list) {
        return goodsDetailDao.updateBatchSelective(list);
    }

    
    public int batchInsert(List<GoodsDetail> list) {
        return goodsDetailDao.batchInsert(list);
    }

}
