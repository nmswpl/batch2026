package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class MyQueue {
    List<Integer> queueList = new ArrayList<>();

    public Integer deQueue() {
        Integer elementOnFirst = queueList.get(0);
        queueList.remove(elementOnFirst);
        return elementOnFirst;
    }

    public void enQueue(int element) {
        List<Integer> queueList = getListQueue();
        queueList.add(element);
    }

    public List<Integer> getListQueue() {
        return queueList;
    }

    public void printQueue() {
        List<Integer> queueStack = getListQueue();
        for (int i = 0; i <= queueStack.size()-1 ; i++) {
            System.out.println(queueStack.get(i));
        }
    }

    public Integer peak() {
        Integer elementOnTop = queueList.get(0);
        return elementOnTop;

    }

    public int size() {
        List<Integer> listQueue = getListQueue();
        return listQueue.size();
    }
}
