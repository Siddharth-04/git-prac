import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayEx {
    public static void main(String[] args) {
        String data  = "Hello, ByteStreams";
        byte [] bytes = data.getBytes();

        try(ByteArrayInputStream bais = new ByteArrayInputStream(bytes)) {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();

            int byteData;

            while((byteData = bais.read()) != -1){
                bos.write(Character.toUpperCase((char) byteData));
            }

            System.out.println("Original:  " + data);
            System.out.println("Transformed : " + bos.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
