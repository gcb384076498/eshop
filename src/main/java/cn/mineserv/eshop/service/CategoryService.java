package cn.mineserv.eshop.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import cn.mineserv.eshop.dao.CategoryDao;
import cn.mineserv.eshop.model.Category;
import cn.mineserv.eshop.example.CategoryExample;
@Service
public class CategoryService{

    @Resource
    private CategoryDao categoryDao;

    
    public long countByExample(CategoryExample example) {
        return categoryDao.countByExample(example);
    }

    
    public int deleteByExample(CategoryExample example) {
        return categoryDao.deleteByExample(example);
    }

    
    public int deleteByPrimaryKey(Integer cateId) {
        return categoryDao.deleteByPrimaryKey(cateId);
    }

    
    public int insert(Category record) {
        return categoryDao.insert(record);
    }

    
    public int insertOrUpdate(Category record) {
        return categoryDao.insertOrUpdate(record);
    }

    
    public int insertOrUpdateSelective(Category record) {
        return categoryDao.insertOrUpdateSelective(record);
    }

    
    public int insertSelective(Category record) {
        return categoryDao.insertSelective(record);
    }

    
    public List<Category> selectByExample(CategoryExample example) {
        return categoryDao.selectByExample(example);
    }

    
    public Category selectByPrimaryKey(Integer cateId) {
        return categoryDao.selectByPrimaryKey(cateId);
    }

    
    public int updateByExampleSelective(Category record,CategoryExample example) {
        return categoryDao.updateByExampleSelective(record,example);
    }

    
    public int updateByExample(Category record,CategoryExample example) {
        return categoryDao.updateByExample(record,example);
    }

    
    public int updateByPrimaryKeySelective(Category record) {
        return categoryDao.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(Category record) {
        return categoryDao.updateByPrimaryKey(record);
    }

    
    public List<Category> findAll() {
        return categoryDao.findAll();
    }

    
    public List<Category> findByAll(Category category) {
        return categoryDao.findByAll(category);
    }

    
    public int updateBatch(List<Category> list) {
        return categoryDao.updateBatch(list);
    }

    
    public int updateBatchSelective(List<Category> list) {
        return categoryDao.updateBatchSelective(list);
    }

    
    public int batchInsert(List<Category> list) {
        return categoryDao.batchInsert(list);
    }

}
