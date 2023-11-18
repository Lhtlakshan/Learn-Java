import java.io.File;

public class createFile{
    public static void main(String[] args){

        File f = new File("C:\\01...Third_Year\\SCS3204 Management\\Activity 02\\Activity 20.pdf");

        try {
            if(f.createNewFile())
                System.out.println("file created!");
            else
                System.out.println( "file exists!");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}

