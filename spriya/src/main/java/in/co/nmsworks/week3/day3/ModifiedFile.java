package in.co.nmsworks.week3.day3;

import java.io.*;

public class ModifiedFile {

    public void readAndModify() {
        BufferedReader bufferedReader=null;
        BufferedWriter bufferedWriter=null;
        try {
            bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Desktop/original.txt"));
            bufferedWriter = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/modified.txt"));

            String line = "";

            while ((line = bufferedReader.readLine()) != null) {
                String[] arr = line.split(" ");
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i].equals("old")) {
                        String str = arr[i].replace("old", "new");
                        bufferedWriter.write(str+" ");

                    } else {
                        bufferedWriter.write(arr[i]+" ");
                    }

                }
              bufferedWriter.write("\n");

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                bufferedWriter.close();
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
