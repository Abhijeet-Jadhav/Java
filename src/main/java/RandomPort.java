import java.io.IOException;
import java.net.ServerSocket;
import java.util.Random;

/**
 * Created by root on 3/23/17.
 */
public class RandomPort {

    static final Random RAND = new Random();

    public static int randomPort() throws IOException {
        int maxValue = 49151 - 1024;
        ServerSocket serverSocket = null;
        for(int i=0; i<5000; i++) {
            try {
                serverSocket = new ServerSocket(RAND.nextInt(maxValue) + 1024);
                return serverSocket.getLocalPort();
            } catch (IOException ex) {
                continue; // try next port
            } finally {
                serverSocket.close();
            }
        }
       return -1;
    }

    public static int getRandomPort()
    {
        ServerSocket server = null;
        try
        {
            server = new ServerSocket(0);
            return server.getLocalPort();
        }
        catch ( IOException e )
        {
            throw new Error(e);
        }
        finally
        {
            if ( server != null )
            {
                try
                {
                    server.close();
                }
                catch ( IOException ignore )
                {
                    // ignore
                }
            }
        }
    }

    public static void main(String arg[]) throws IOException {
        for (int i = 0; i < 100; i++)
            System.out.println(getRandomPort());
    }


}
