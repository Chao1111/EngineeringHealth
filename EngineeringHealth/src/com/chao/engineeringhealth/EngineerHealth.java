package com.chao.engineeringhealth;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * Engineer usually has a lot of pressure on delivering project on time. And he usually need to work
 * overtime to have his job done. A engineer needs to maintainer a certain level work and life
 * balance to keep him working efficiently and relaxing at the same time.
 * 
 * Assume each engineer can efficient work on a task for n hours, then need to take a rest to make
 * sure he can continue working efficient and have enough rest for this brain health. And he need to
 * take a rest during each task to refresh his brain for new task.
 * </p>
 *
 * @author Chao Shen
 */
public class EngineerHealth{
    public List<WorkTask> takeBreaks(List<WorkTask> taskList, int maxTaskLength){
        List<WorkTask> result = new ArrayList<WorkTask>();
        for(WorkTask task: taskList){
            takeRest(task, maxTaskLength, result);
        }
        return result; // Need to take a break after each task in this result list.
    }
    public void takeRest(WorkTask task, int maxTaskLength, List<WorkTask> taskList){
        if(task.taskLength > maxTaskLength){
            taskList.add(new WorkTask(maxTaskLength, task.taskName));
            takeRest(new WorkTask(task.taskLength - maxTaskLength, task.taskName), maxTaskLength, taskList);
        }else{
            taskList.add(task);
        }
    }
}

class WorkTask{
    int taskLength;
    String taskName;
    public WorkTask(int taskLength, String taskName){
        this.taskLength = taskLength;
        this.taskName = taskName;
    }
}