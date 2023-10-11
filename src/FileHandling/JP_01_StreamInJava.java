package FileHandling;

import java.io.*;
import java.util.Scanner;

//InputStream
public class JP_01_StreamInJava {
    public static void main(String[] args) {

        // InputStreamReader:

//        try(InputStreamReader isr=new InputStreamReader(System.in)){
//            System.out.println("Enter Some letters : ");
//            int letters=isr.read();
//            while(isr.ready()){
//                System.out.println((char)letters);
//                letters=isr.read();
//            }
//            isr.close();//here we don't need to write close because, new java feature try-catch block will automatically close it
//            System.out.println();
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }


//    FileReader:
//        try(FileReader fr=new FileReader("")){
//            int letters=fr.read();
//            while(fr.ready()){
//                System.out.print((char)letters);
//                letters=fr.read();
//            }
//            fr.close();
//            System.out.println();
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }

        //BufferReader:

        //Byte to char Stream then read char Stream
//       try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
//           while(br.ready()){
//               br.readLine();
//           }
//
//       }catch (IOException e){
//           System.out.println(e.getMessage());
//       }
    // new InputStreamReader because it converts byte to character



        //Creation of File:

//        File f0=new File("D:example.txt");
//        try {
//            if (f0.createNewFile()) {
//                System.out.println("File " + f0.getName() + " is created successfully");
//            } else {
//                System.out.println("File is already existed");
//            }
//        }catch (IOException f){
//            System.out.println(f.getMessage());
//        }
//        System.out.println("Is file writeable?: " + f0.canWrite());
//        System.out.println(f0.getAbsolutePath());

        // Read data from file using scanner class
//        try {
//            File f1 = new File("D:example.txt");
//            Scanner sc = new Scanner(f1);
//
//            while(sc.hasNextLine()){
//                String data=sc.nextLine();
//                System.out.println(data);
//            }
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }

//       output:
        OutputStream os=System.out;
       // os.write(🙂);//error illegal character range in exceeded --if we convert to string literal we can also print this
        try(OutputStreamWriter osw=new OutputStreamWriter(System.out)){
            osw.write("Hello World");
            osw.write(99);
            osw.write("\n");
            osw.write("\uD83D\uDE42"); //emoji in string literal
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
