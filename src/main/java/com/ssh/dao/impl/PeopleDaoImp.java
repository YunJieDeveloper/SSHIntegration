package com.ssh.dao.impl;

import com.ssh.dao.IPeopleDao;
import com.ssh.dto.People;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("peopleDaoImp")
@Transactional
public class PeopleDaoImp extends BaseDaoImpl<People> implements IPeopleDao {
}
