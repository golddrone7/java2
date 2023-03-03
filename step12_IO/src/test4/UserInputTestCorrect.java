package test4;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class UserInputTestCorrect {
	public static void main(String[] args) throws FileNotFoundException, IOException  {
		User user;
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/test4/user.txt"));
		
		while(true) {
			try {
				user = (User)ois.readObject();
				System.out.println(user);
			} catch(EOFException e) {
				break;
			}
			catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
	}

}
