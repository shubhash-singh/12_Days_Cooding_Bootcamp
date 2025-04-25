package com.ragnar.Data_Structure.Queue;

import java.util.*;

public class TaskScheduling {
    public static void main(String[] args) {
        int[] tasks = {10,5,8};
        int timeSlice = 4;
        System.out.println(taskSchedulingAlgorithm(tasks, timeSlice));


    }
    private static int taskSchedulingAlgorithm(int[] tasks, int time){
        Deque<ArrayList<Integer>> queue = new ArrayDeque<>();


        for(int i=0;i<tasks.length;i++){
            ArrayList<Integer> task = new ArrayList<>();
            task.add(tasks[i]);
            task.add(i+1);
            queue.offer(task);
        }


        int totalTime = 0;
        while (!queue.isEmpty()) {
            ArrayList<Integer> value = queue.pollFirst();

            int difference = value.get(0) - time;

            if (difference > 0) {
                totalTime += time;
                System.out.println("Task:"+value.get(1)+" runs for "+ time + " unit :- "+ totalTime);
                value.set(0, difference);
                queue.offerLast(value);
            }

            else if(difference <= 0){

                totalTime += value.get(0);
                System.out.println("Task:"+value.get(1)+" runs for "+ value.get(0) + " unit :- "+ totalTime);
            }
        }
        
        
        return totalTime;
    }
}
