import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try{
             in = new FileInputStream(new File("flower.png"));
             out = new FileOutputStream(new File("output.png"));
            int c;
            while( (c = in.read())!=-1){ //sets c equal to the next byte and writes it to the png.  If c is negative one then stop writing
                out.write(c);
            }
        }
        finally {
            if(in!=null) { //prevent null pointer exception from occuring
                in.close();
            }
            if(out!=null){  //same here
                out.close();
            }
        }
    }
}
