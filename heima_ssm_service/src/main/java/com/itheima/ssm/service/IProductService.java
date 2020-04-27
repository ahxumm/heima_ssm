package com.itheima.ssm.service;

import com.itheima.ssm.domain.Product;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IProductService {

    // 查询所有
    public List<Product> findAll() throws Exception;

    // 保存产品
    void save(Product product) throws Exception;
}
