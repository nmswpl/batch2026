package in.co.nmsworks.training.week3.day3;


import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class ReadFiles {
    public static void main(String[] args) throws IOException {
        readOriginalFile();
        countInFile();
        checkLenghtFive();
    }

    private static void checkLenghtFive() throws IOException {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            bufferedReader = new BufferedReader( new FileReader( "/home/nms-training/Desktop/India.txt") );
            bufferedWriter = new BufferedWriter( new FileWriter("/home/nms-training/Desktop/India.txt", true));
            String line = "";
            int i=1, count = 0;
            Set<String> uniqueWords = new HashSet<>();

            while ((line = bufferedReader.readLine())!=null)
            {
                String[] text = line.split(" ");
                for (String s : text) {

                    if(s.length() > 5)
                    {
                        count++;
                        System.out.println((i++) + s);
                    }

                    uniqueWords.add(s);

                }
            }
            bufferedWriter.write("\nTotal words longer than 5 letters : "+count);
            bufferedWriter.flush();
            bufferedWriter.write("\nNo.of unique words in the paragraph : "+uniqueWords.size());
            bufferedWriter.flush();

            System.out.println("Count = "+count);
            System.out.println("Unique words count = "+uniqueWords.size());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if(bufferedReader != null )
            {
                bufferedReader.close();
            }
            if(bufferedWriter!=null)
            {
                bufferedWriter.close();
            }
        }
    }

    private static void countInFile() throws IOException {
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader( new FileReader( "/home/nms-training/Desktop/countWords.txt" ) );

            String line = "";
            int ch;
            int wordCount = 0;
            int sentenceCount = 0;
            while ( ( line = bufferedReader.readLine() )!= null)
            {
                wordCount = wordCount + line.split(" ").length;
                sentenceCount = sentenceCount + line.split("\\.").length;
            }


            System.out.println("Word count = "+ wordCount);
            System.out.println("Sentence count = "+sentenceCount);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if( bufferedReader != null)
            {
                bufferedReader.close();
            }
        }

    }

    private static void readOriginalFile() throws IOException {

        BufferedWriter bufferedWriter = null;
        BufferedReader bufferedReader1 = null;

        bufferedWriter = new BufferedWriter( new FileWriter("/home/nms-training/Desktop/modified.txt"));
        bufferedReader1 = new BufferedReader( new FileReader("/home/nms-training/Desktop/original.txt") );


        String line = "";

        while( (line = bufferedReader1.readLine())!= null)
        {
            String[] words = line.split(" ");

            for (String word : words) {
                if ( word.equals("old") )
                {
                    bufferedWriter.write("new ");
                    continue;
                }
                bufferedWriter.write(word+" ");
            }
            System.out.println();

//            bufferedWriter.write(line+"\n");
//            System.out.println("WRITE : "+line);
        }
        System.out.println("Write Complete !!!");

        bufferedReader1.close();
        bufferedWriter.close();

    }
}
