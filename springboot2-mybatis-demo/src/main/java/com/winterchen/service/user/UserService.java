package com.winterchen.service.user;


import com.github.pagehelper.PageInfo;
import com.winterchen.model.UserDomain;
/*
 * 
     * @ClassName: UserService
     * @Description: TODO(这里用一句话描述这个类的作用)
     * @author hemin
     * @date 2020年7月2日
     *
 */
public interface UserService {

    int addUser(UserDomain user);

    PageInfo<UserDomain> findAllUser(int pageNum, int pageSize);

	void delUser(Integer userId);
    
	 UserDomain selectUser(Integer userId);
	 
	  void updateUser( UserDomain userDomain);
}
