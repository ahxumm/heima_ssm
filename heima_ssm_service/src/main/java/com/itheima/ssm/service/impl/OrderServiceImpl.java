package com.itheima.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.itheima.ssm.dao.IOrderDao;
import com.itheima.ssm.domain.Orders;
import com.itheima.ssm.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class OrderServiceImpl implements IOrderService {

    @Autowired
    private IOrderDao iOrderDao;
    @Override
    public List<Orders> findAll(int page, int size) throws Exception {

        PageHelper.startPage(page, size);
        return iOrderDao.findAll();
    }

    @Override
    public Orders findById(String ordersId) {
        return iOrderDao.findById(ordersId);
    }
}
