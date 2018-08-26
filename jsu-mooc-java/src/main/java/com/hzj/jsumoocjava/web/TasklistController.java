package com.hzj.jsumoocjava.web;

import com.hzj.jsumoocjava.entity.Tasklists;
import com.hzj.jsumoocjava.service.ITaskListsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/taskList")
public class TasklistController {

    @Autowired
    private ITaskListsService taskListsService;

    /**
     * 添加任务列表 web层
     * @param tasklists
     * @return
     */
    @PostMapping(value = "/add")
    public int addTaskLists(@RequestBody Tasklists tasklists) {
        int result = taskListsService.add(tasklists);
        if (result == 1) {
            //返回 1 表示插入成功
            return 1;
        }
        if (taskListsService.findOne(tasklists) != null) {
            //返回2 表示要插入的数据已经存在
            return 2;
        }
        // 返回0 表示其他错误
        return 0;
    }

    /**
     * 删除任务列表  web层
     * @param tasklists
     */
    @PostMapping(value = "/delete")
    public int deleteTaskLists(@RequestBody Tasklists tasklists) {
        //返回值为0 或 1 , 1 表示删除成功, 0 表示删除失败
        return taskListsService.delete(tasklists);
    }


    /**
     * 查询用户所对应的任务列表
     * @param user_id
     * @return
     */
    @GetMapping(value = "/userTaskList")
    public List<Tasklists> selectUserTaskLists(@RequestParam("user_id") Integer user_id) {
        List<Tasklists> list = taskListsService.findByuserId(user_id);
        return list;
    }

    /**
     * 更新任务列表名称
     * @param tasklists
     */
    @PostMapping(value = "/update")
    public void updateTaskLists(@RequestBody List<Tasklists> tasklists) {
        //从前台传来两个tasklists对象数组, 第一个是更改之后的数据, 第二个是未更改的数据
        taskListsService.update(tasklists.get(0), tasklists.get(1));
    }
}
