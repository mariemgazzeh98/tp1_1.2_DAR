package serverPackage;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.ServerSocket;

public class Server {
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		try {
				
			//Creation de l'objet ServerSocket
			ServerSocket serversocket=new ServerSocket(1234);
			System.out.println("Je suis un serveur en attente la connexion d'un client");
			
			//Creation de l'objet Socket côté serveur suite à la connexion du client
			Socket socket=serversocket.accept();
			System.out.println("un client est connecté");
			
			InputStream is=socket.getInputStream();
			int x=is.read();
			System.out.println("x="+x);
			
			int nb=x*5;
			OutputStream os=socket.getOutputStream();
			os.write(nb);
			
			
			//Fermeture de la Socket et la ServerSocket
			socket.close();
			serversocket.close();
		
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		

	}

}
