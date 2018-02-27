package cc.ccoder.cmall.service.impl;

import cc.ccoder.cmall.dao.UserMapper;
import cc.ccoder.cmall.pojo.User;
import cc.ccoder.cmall.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author : ChenCong
 * @date : Created in 15:57 2018/2/27
 */
@Service("iUserService")
@Transactional
public class UserServiceImpl implements IUserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
