package com.hzj.jsumoocjava.dao;

import com.hzj.jsumoocjava.entity.Tasklists;

import java.util.List;

public interface ITaskListsDAO {

    /**
     * 创建用户  (增)
     * @param tasklists
     * @return
     */
    int add(Tasklists tasklists);

    /**
     * 删除用户信息 (删)
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
     * 通过任务列表的主键, 查找任务  (查:　查找单个)
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
