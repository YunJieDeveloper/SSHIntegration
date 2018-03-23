package com.ssh.dao.impl;

import com.ssh.dao.IUserDao;
import com.ssh.dto.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("userDaoImp")
@Transactional
public class UserDaoImp extends BaseDaoImpl<User> implements IUserDao {
}
