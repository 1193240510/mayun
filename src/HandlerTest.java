import handler.Handler;
import impl.Addname;
import impl.AddnameImpl;

public class HandlerTest {


    public static void main(String[] args) {


        Addname addname=(Addname)new Handler(new AddnameImpl(),"男").bunding();

        String string=addname.name("泰罗");

        System.out.println(string);
    }



}
