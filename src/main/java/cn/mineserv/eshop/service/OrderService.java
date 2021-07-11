package cn.mineserv.eshop.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import cn.mineserv.eshop.example.OrderExample;
import cn.mineserv.eshop.dao.OrderDao;
import cn.mineserv.eshop.model.Order;
@Service
public class OrderService{

    @Resource
    private OrderDao orderDao;

    
    public long countByExample(OrderExample example) {
        return orderDao.countByExample(example);
    }

    
    public int deleteByExample(OrderExample example) {
        return orderDao.deleteByExample(example);
    }

    
    public int deleteByPrimaryKey(Integer orderId) {
        return orderDao.deleteByPrimaryKey(orderId);
    }

    
    public int insert(Order record) {
        return orderDao.insert(record);
    }

    
    public int insertOrUpdate(Order record) {
        return orderDao.insertOrUpdate(record);
    }

    
    public int insertOrUpdateSelective(Order record) {
        return orderDao.insertOrUpdateSelective(record);
    }

    
    public int insertSelective(Order record) {
        return orderDao.insertSelective(record);
    }

    
    public List<Order> selectByExample(OrderExample example) {
        return orderDao.selectByExample(example);
    }

    
    public Order selectByPrimaryKey(Integer orderId) {
        return orderDao.selectByPrimaryKey(orderId);
    }

    
    public int updateByExampleSelective(Order record,OrderExample example) {
        return orderDao.updateByExampleSelective(record,example);
    }

    
    public int updateByExample(Order record,OrderExample example) {
        return orderDao.updateByExample(record,example);
    }

    
    public int updateByPrimaryKeySelective(Order record) {
        return orderDao.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(Order record) {
        return orderDao.updateByPrimaryKey(record);
    }

    
    public List<Order> findAll() {
        return orderDao.findAll();
    }

    
    public List<Order> findByAll(Order order) {
        return orderDao.findByAll(order);
    }

    
    public int updateBatch(List<Order> list) {
        return orderDao.updateBatch(list);
    }

    
    public int updateBatchSelective(List<Order> list) {
        return orderDao.updateBatchSelective(list);
    }

    
    public int batchInsert(List<Order> list) {
        return orderDao.batchInsert(list);
    }

}
