package com.fgeorgiou.parcellocker.service.impl;

import com.fgeorgiou.parcellocker.repository.OrderDao;
import com.fgeorgiou.parcellocker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements UserService {

    private final OrderDao orderDao;

    @Autowired
    public OrderServiceImpl(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

}
