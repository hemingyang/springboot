package com.winterchen.service.user.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.winterchen.dao.UserDao;
import com.winterchen.model.UserDomain;
import com.winterchen.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/*
 * 
     * @ClassName: UserServiceImpl
     * @Description: TODO(这里用一句话描述这个类的作用)
     * @author hemin
     * @date 2020年7月2日
     *
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;//这里会报错，但是并不会影响

    @Override
    public int addUser(UserDomain user) {

        return userDao.insert(user);
    }

    /*
    * 这个方法中用到了我们开头配置依赖的分页插件pagehelper
    * 很简单，只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
    * pageNum 开始页数
    * pageSize 每页显示的数据条数
    * */
    @Override
    public PageInfo<UserDomain> findAllUser(int pageNum, int pageSize) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        List<UserDomain> userDomains = userDao.selectUsers();
        PageInfo<UserDomain> result = new PageInfo<UserDomain>(userDomains);
        return result;
    }

	
	    /* (非 Javadoc)
	     * 
	     * 
	     * @param userId
	     * @see com.winterchen.service.user.UserService#delUser(java.lang.Integer)
	     */
	    
	@Override
	public void delUser(Integer userId) {
		userDao.delUser(userId);
	}

	
	    /* (非 Javadoc)
	     * 
	     * 
	     * @param userId
	     * @return
	     * @see com.winterchen.service.user.UserService#selectUser(java.lang.Integer)
	     */
	    
	@Override
	public UserDomain selectUser(Integer userId) {
		
		return userDao.selectUser(userId);
	}

	
	    /* (非 Javadoc)
	     * 
	     * 
	     * @param userDomain
	     * @see com.winterchen.service.user.UserService#updateUser(com.winterchen.model.UserDomain)
	     */
	    
	@Override
	public void updateUser(UserDomain userDomain) {
		 userDao.updateUser(userDomain);
	}

	
	   
		
}
