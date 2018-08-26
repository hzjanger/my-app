package com.hzj.jsumoocjava.service.impl;

import com.hzj.jsumoocjava.dao.ITaskListsDAO;
import com.hzj.jsumoocjava.entity.Tasklists;
import com.hzj.jsumoocjava.service.ITaskListsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskListsService implements ITaskListsService {

    @Autowired
    private ITaskListsDAO taskListsDAO;

    /**
     * 用户添加任务列表的实现
     * @param tasklists
     * @return
     */
    @Override
    public int add(Tasklists tasklists) {
        return taskListsDAO.add(tasklists);
    }

    /**
     * 用户删除任务列表的实现
     * @param tasklists
     * @return
     */
    @Override
    public int delete(Tasklists tasklists) {
        return taskListsDAO.delete(tasklists);
    }

    /**
     * 查找用户的任务列表的实现
     * @param userId
     * @return
     */
    @Override
    public List<Tasklists> findByuserId(Integer userId) {
        return taskListsDAO.findByuserId(userId);
    }

    /**
     * 查找一条数据, 判断该数据是否存在数据库中
     * @param tasklists
     * @return
     */
    @Override
    public Tasklists findOne(Tasklists tasklists) {
        return taskListsDAO.findOne(tasklists);
    }

    /**
     * 更改任务列表名称
     * @param newTaskLists
     * @param oldTaskLists
     * @return
     */
    @Override
    public int update(Tasklists newTaskLists, Tasklists oldTaskLists) {
        return taskListsDAO.update(newTaskLists, oldTaskLists);
    }
}
