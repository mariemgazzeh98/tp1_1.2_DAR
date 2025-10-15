package clientPackage;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.*;
import java.net.Socket;
public class Client {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			//Creation de l'objet Socket côté client
			System.out.println("Je suis un client pas encore connecté…");
			Socket socket=new Socket("localhost",1234);
			System.out.println("Je suis connecté"); 
			//saisie l'entier x
			Scanner sc=new Scanner(System.in);
			
			
			OutputStream os=socket.getOutputStream();
			System.out.println("donner x:");
			int x=sc.nextInt();
			os.write(x);
			
			InputStream is=socket.getInputStream();
			int nb=is.read();
			
			System.out.println("le resultat="+nb);
			
			//Fermeture de la Socket
			socket.close();
			sc.close();
			
		
		}catch(IOException e) {
			e.printStackTrace();
		}
		

	}

}
