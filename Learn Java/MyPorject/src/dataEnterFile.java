import java.io.FileWriter;

class dataEnterfile{
    public static void main(String[] args){

        try {
            FileWriter fs = new FileWriter("C:\\01...Third_Year\\SCS3204 Management\\Activity 02\\Thilina.txt");
            fs.write("Hi, I am Thilina Lakshan Hewage");
            fs.close();
            System.out.println("File is created and have been written it");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("error" + e);
        }

    }
}