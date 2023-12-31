//A two way server, Where 2 users can chat with each other dynamically.

import java.io.*;
import java.net.*;

public class MyServer1 
{
    ServerSocket ss;
    Socket s;
    DataInputStream dis;
    DataOutputStream dos;

    public MyServer1()
    {
        try{
            System.out.println("Server Started");
            ss=new ServerSocket(10);
            s=ss.accept();
            System.out.println(s);
            System.out.println("Client Connected");
            dis=new DataInputStream(s.getInputStream());
            dos=new DataOutputStream(s.getOutputStream());
            serverChat();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String args[])
    {
        new MyServer1();
    }
    public void serverChat() throws IOException
    {
        String str,s1;
        do
        {
            str=dis.readUTF();
            System.out.println("Client Message: "+str);
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            s1=br.readLine();
            dos.writeUTF(s1);
            dos.flush();
        }
        while(!str.equals("Stop"));
    }

    
}
