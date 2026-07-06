package in.co.nmsworks.training.week3.day5;

import java.util.Map;

public class FrequencyCounterRunner {
    public static void main(String[] args) {
        FrequencyCounter counterObj = new FrequencyCounter();
        Map<String,Integer> countMap = counterObj.countWordsFrequency("/home/nms-training/Downloads/Word_Frequency.txt");


    }
}
