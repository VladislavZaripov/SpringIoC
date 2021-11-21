package configuration;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.Resource;

import java.io.*;

public class BeanH {

    public void execute(GenericXmlApplicationContext gctx) throws Exception {



        File file = File.createTempFile("test2", ".txt");
        file.deleteOnExit();

        Resource res1 = gctx.getResource(file.getPath());

        System.out.print("BeanH - first resource: ");
        System.out.print(res1.getClass() + " / ");
        System.out.println(res1.getFilename());

        Resource res2 = gctx.getResource("configuration/test.txt");

        System.out.print("BeanH - second resource: ");
        System.out.print(res2.getClass() + " / ");
        System.out.print(res2.getURL().getContent() + " / ");
        InputStream  in  = new FileInputStream(res2.getFile());
        int x; while ( ( x = in.read() )!= -1) System.out.print((char)x);
        System.out.println();


        Resource res3 = gctx.getResource("http://www.google.com");

        System.out.print("BeanH - third resource: ");
        System.out.print(res3.getClass() + " / ");
        System.out.print(res3.getURI() + " / ");
        try {
            System.out.println(res3.getURL().getContent());
        }
        catch (Exception e) {
            System.out.println("Need internet connection");
        }
    }
}