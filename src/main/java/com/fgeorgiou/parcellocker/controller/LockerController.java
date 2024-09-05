package com.fgeorgiou.parcellocker.controller;

import com.fgeorgiou.parcellocker.service.LockerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${api.base-path}/v1/lockers")
public class LockerController {

    private final LockerService lockerService;

    @Autowired
    public LockerController(LockerService lockerService) {
        this.lockerService = lockerService;
    }

}
