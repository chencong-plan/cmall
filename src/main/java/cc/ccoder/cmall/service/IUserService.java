package cc.ccoder.cmall.service;

import cc.ccoder.cmall.pojo.User;

/**
 * @author : ChenCong
 * @date : Created in 15:56 2018/2/27
 */
public interface IUserService {

    User selectByPrimaryKey(Integer id);
}
