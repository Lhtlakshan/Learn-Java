import java.io.File;

public class file{
    public static void main(String[] args){

        File f = new File("C:\\01...Third_Year\\SCS3204 Management\\Activity 02\\Activity 1.pdf");

        if(f.exists())
            System.out.println(f.getName()+ " file exists!");
        else
            System.out.println( "file does not exists!");
    }
}