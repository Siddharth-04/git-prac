import java.io.*;

public class JavaStreams {
    public static void readFile(){
        try(FileInputStream fr = new FileInputStream("input.txt")){
            FileOutputStream fos = new FileOutputStream("output.txt");

            int data;

            while((data  = fr.read()) != -1){
                fos.write(data);
            }

            System.out.println("Done!");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
//        try(FileInputStream fis = new FileInputStream("input.txt")){
//            FileOutputStream fos = new FileOutputStream("output.txt");
//            int byteData;
//            while((byteData = fis.read()) != -1){
//                fos.write(byteData);
//            }
//
//            System.out.println("File Copied Successfully");
//        }
//        catch (IOException e){
//            e.printStackTrace();
//        }
        readFile();
    }
}

