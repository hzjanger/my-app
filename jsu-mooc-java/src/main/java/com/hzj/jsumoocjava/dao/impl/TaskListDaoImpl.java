package com.hzj.jsumoocjava.dao.impl;


import com.hzj.jsumoocjava.dao.ITaskListsDAO;
import com.hzj.jsumoocjava.entity.Tasklists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TaskListDaoImpl implements ITaskListsDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 创建用户  (增)
     * @param tasklists
     * @return
     */
    @Override
    public int add(Tasklists tasklists) {
        int result = 0;
        try {
            result = jdbcTemplate.update("insert into tasklists(taskListName, userId) value (?,?)",
                    tasklists.getTaskListName(), tasklists.getUserId());
        } catch (Exception e) {
            result = 0;
        }
        return result;
    }

    /**
     * 删除用户信息 (删)
     * @param tasklists
     * @return
     */
    @Override
    public int delete(Tasklists tasklists) {
        return jdbcTemplate.update("delete from tasklists where taskListName=? and userId=?",
                tasklists.getTaskListName(), tasklists.getUserId());
    }

    /**
     * 通过用户id, 查找用户的所有任务列表 (查: 查找多个)
     * @param userId
     * @return
     */
    @Override
    public List<Tasklists> findByuserId(Integer userId) {
        List<Tasklists> list = jdbcTemplate.query("select * from tasklists where userId=?", new Object[]{userId}, new BeanPropertyRowMapper(Tasklists.class));
        if (list != null && list.size() > 0) {
            return list;
        }
        return null;
    }

    /**
     * 查找单个任务列表
     * @param tasklists
     * @return
     */
    @Override
    public Tasklists findOne(Tasklists tasklists) {
        List<Tasklists> list = jdbcTemplate.query("select * from tasklists where taskListName=? and userId=?", new Object[]{}, new BeanPropertyRowMapper(Tasklists.class));
        if (list != null && list.size() > 0) {
            Tasklists result = list.get(0);
            return result;
        }
        return null;
    }

    /**
     * 更新用户信息  (改)
     * @param newTaskLists
     * @param oldTaskLists
     * @return
     */
    @Override
    public int update(Tasklists newTaskLists, Tasklists oldTaskLists) {
        return jdbcTemplate.update("update tasklists set taskListName=?, userId=? where taskListName=? and userId=?",
                newTaskLists.getTaskListName(), newTaskLists.getUserId(), oldTaskLists.getTaskListName(), oldTaskLists.getUserId());
    }
}
