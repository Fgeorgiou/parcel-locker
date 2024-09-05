package com.fgeorgiou.parcellocker.service.impl;

import com.fgeorgiou.parcellocker.repository.LockerDao;
import com.fgeorgiou.parcellocker.service.LockerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LockerServiceImpl implements LockerService {

    private final LockerDao lockerDao;

    @Autowired
    public LockerServiceImpl(LockerDao lockerDao) {
        this.lockerDao = lockerDao;
    }
}
