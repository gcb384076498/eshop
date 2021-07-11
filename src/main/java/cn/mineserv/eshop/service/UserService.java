package cn.mineserv.eshop.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import cn.mineserv.eshop.model.User;
import cn.mineserv.eshop.example.UserExample;
import cn.mineserv.eshop.dao.UserDao;
@Service
public class UserService{

    @Resource
    private UserDao userDao;

    
    public long countByExample(UserExample example) {
        return userDao.countByExample(example);
    }

    
    public int deleteByExample(UserExample example) {
        return userDao.deleteByExample(example);
    }

    
    public int deleteByPrimaryKey(Integer userId) {
        return userDao.deleteByPrimaryKey(userId);
    }

    
    public int insert(User record) {
        return userDao.insert(record);
    }

    
    public int insertOrUpdate(User record) {
        return userDao.insertOrUpdate(record);
    }

    
    public int insertOrUpdateSelective(User record) {
        return userDao.insertOrUpdateSelective(record);
    }

    
    public int insertSelective(User record) {
        return userDao.insertSelective(record);
    }

    
    public List<User> selectByExample(UserExample example) {
        return userDao.selectByExample(example);
    }

    
    public User selectByPrimaryKey(Integer userId) {
        return userDao.selectByPrimaryKey(userId);
    }

    
    public int updateByExampleSelective(User record,UserExample example) {
        return userDao.updateByExampleSelective(record,example);
    }

    
    public int updateByExample(User record,UserExample example) {
        return userDao.updateByExample(record,example);
    }

    
    public int updateByPrimaryKeySelective(User record) {
        return userDao.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(User record) {
        return userDao.updateByPrimaryKey(record);
    }

    
    public List<User> findAll() {
        return userDao.findAll();
    }

    
    public List<User> findByAll(User user) {
        return userDao.findByAll(user);
    }

    
    public int updateBatch(List<User> list) {
        return userDao.updateBatch(list);
    }

    
    public int updateBatchSelective(List<User> list) {
        return userDao.updateBatchSelective(list);
    }

    
    public int batchInsert(List<User> list) {
        return userDao.batchInsert(list);
    }

}
