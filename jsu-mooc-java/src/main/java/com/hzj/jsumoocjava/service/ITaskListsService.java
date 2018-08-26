package com.hzj.jsumoocjava.service;

import com.hzj.jsumoocjava.entity.Tasklists;

import java.util.List;

public interface ITaskListsService {
    /**
     * 创建用户 service层
     * @param tasklists
     * @return
     */
    int add(Tasklists tasklists);

    /**
     * 删除用户信息 service层
     * @param tasklists
     * @return
     */
    int delete(Tasklists tasklists);

    /**
     * 通过用户id, 查找用户的所有任务列表 (查: 查找多个)
     * @return
     */
    List<Tasklists> findByuserId(Integer userId);

    /**
     * 查找单个任务列表
     * @param tasklists
     * @return
     */
    Tasklists findOne(Tasklists tasklists);

    /**
     * 更新用户信息  (改)
     * @param newTaskLists
     * @param oldTaskLists
     * @return
     */
    int update(Tasklists newTaskLists, Tasklists oldTaskLists);


}
