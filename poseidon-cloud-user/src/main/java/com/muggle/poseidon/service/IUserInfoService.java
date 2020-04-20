package com.muggle.poseidon.service;

import com.muggle.poseidon.user.pojo.UserInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author muggle
 * @since 2019-12-06
 */
public interface IUserInfoService extends IService<UserInfo> {

    void registration(String userDO);

    void insert();

    void test();

    void test0();

}
