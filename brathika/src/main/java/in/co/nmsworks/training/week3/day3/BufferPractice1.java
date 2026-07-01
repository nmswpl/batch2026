package in.co.nmsworks.training.week3.day3;

import java.io.*;

public class BufferPractice1 {
    public static void main(String[] args) {
        BufferPractice1 bufferPractice1 = new BufferPractice1();
        bufferPractice1.reanAndUpdateTheFile();
    }

    private void reanAndUpdateTheFile() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("/home/nms-training/Desktop/Original.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/modified.txt"));
            String text = "";
            while ((text = reader.readLine()) != null){
                System.out.println(text);
                String[] array = text.split(" ");
                String newText = "";
                for (String s : array) {
                    if (s.equals("old")) {

                        newText += "new ";
                    }
                    else {
                        newText += s+" ";
                    }
                    if (s.equals("old")) {
                        s.replace("old","new");
                    }
                }
//                System.out.println(newText);
                writer.write(newText+"\n");
                writer.flush();
            }

            reader.close();
            writer.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
