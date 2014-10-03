/**
 * 
 */
package com.chao.engineeringhealth;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * Test EngineerHealth.
 * </p>
 *
 * @author Chao Shen
 */
public class Test
{
    public static void main(String[] args)
    {
        WorkTask task1 = new WorkTask(5, "Task1");
        WorkTask task2 = new WorkTask(4, "Task2");
        WorkTask task3 = new WorkTask(1, "Task3");
        EngineerHealth health = new EngineerHealth();
        List<WorkTask> taskList = new ArrayList<WorkTask>(); 
        List<WorkTask> result= new ArrayList<WorkTask>(); 
        taskList.add(task1);
        taskList.add(task2);
        taskList.add(task3);
        result = health.takeBreaks(taskList, 3);
        for(WorkTask task: result){
            System.out.println("Work on " + task.taskName + " for "+ task.taskLength + " hours");
            System.out.println("Take a break");
        }
    }

}
