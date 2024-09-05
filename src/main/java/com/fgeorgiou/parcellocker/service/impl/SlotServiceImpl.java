package com.fgeorgiou.parcellocker.service.impl;

import com.fgeorgiou.parcellocker.repository.SlotDao;
import com.fgeorgiou.parcellocker.service.SlotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SlotServiceImpl implements SlotService {

    private final SlotDao slotDao;

    @Autowired
    public SlotServiceImpl(SlotDao slotDao) {
        this.slotDao = slotDao;
    }
}
