package com.ragnar.Heap;

import java.util.Collections;
import java.util.PriorityQueue;


public class HeapImplementation {

    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        int[] nums = {20,30,3,45,6,78,2};
        for (int i : nums) {
            minHeap.add(i);
            maxHeap.add(i);
        }
        System.out.println("Min Heap ---->");
        while(!minHeap.isEmpty()){
            System.out.print(minHeap.poll() + " ");
        }
        System.out.println("\nMax Heap ---->");
        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.poll()+ " ");
        }
    }

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < k; i++) {
            maxHeap.add(nums[i]);
        }
        for (int i = k; i < nums.length; i++) {
            if (nums[i] > maxHeap.peek()) {
                maxHeap.poll();
                maxHeap.add(nums[i]);
            }
        }
        return maxHeap.poll();
    }
    
}