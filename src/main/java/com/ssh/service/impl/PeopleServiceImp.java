package com.ssh.service.impl;

import com.ssh.dao.IPeopleDao;
import com.ssh.dto.People;
import com.ssh.service.IPeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

@Service("peopleServiceImp")
public class PeopleServiceImp implements IPeopleService {

    @Autowired
    IPeopleDao peopleDao;

    @Transactional
    public int addPeople(People people){
        return (Integer) peopleDao.save(people);
    }
}
