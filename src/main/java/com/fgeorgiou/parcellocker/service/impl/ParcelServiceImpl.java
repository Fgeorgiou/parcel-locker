package com.fgeorgiou.parcellocker.service.impl;

import com.fgeorgiou.parcellocker.repository.ParcelDao;
import com.fgeorgiou.parcellocker.service.ParcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParcelServiceImpl implements ParcelService {

    private final ParcelDao parcelDao;

    @Autowired
    public ParcelServiceImpl(ParcelDao parcelDao) {
        this.parcelDao = parcelDao;
    }
}
