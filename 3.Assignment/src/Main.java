import java.io.File;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


/**
 * Main Class.
 * 
 * @author Damla Unal
 */
public class Main {
	
	static Date now = new Date();
	static SimpleDateFormat tarih=new SimpleDateFormat("dd/M/yyyy");
	/**
	 * This method reading users.txt.
	 * @param arguman0 users.txt
	 */
	public static void usersreading(String arguman0){
		try 
		{       
			 Scanner scanner = new Scanner(new File(arguman0));
			 while(scanner.hasNextLine())
			 {       
				 String line = scanner.nextLine();	
				 String[] s_line=line.split("	");
				 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy", Locale.ENGLISH);
				 LocalDate date = LocalDate.parse(s_line[3], formatter);
				 UserCollection.addUser(s_line[0],s_line[1],s_line[2],date,s_line[4]);
			 }scanner.close();
		}catch(Exception e){
		System.out.println("hata : "+e.getMessage());
		}
	}
	/**
	 * This method reading commands.txt.
	 * @param arguman1 commands.txt
	 */
	public static void commandsreading(String arguman1){
		try {
			Scanner scanner = new Scanner(new File(arguman1));
			while (scanner.hasNextLine()) {
				
				String line = scanner.nextLine();
				String[] s_line = line.split("	");
				if(s_line[0].equals("ADDUSER")){
					System.out.println("----------------------------------------------");
					System.out.println("Command  : "+s_line[0]+"\t"+s_line[1]+"\t"+s_line[2]+"\t"+s_line[3]+"\t"+s_line[4]+"\t"+s_line[5]);
					DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy", Locale.ENGLISH);
					 LocalDate date = LocalDate.parse(s_line[4], formatter);
					UserCollection.addUser(s_line[1], s_line[2], s_line[3], date, s_line[5]);
					System.out.println(s_line[0]+ " has been succesfully added.");
				}
				else if(s_line[0].equals("REMOVEUSER")){
					System.out.println("----------------------------------------------");
					System.out.println("Command  : "+s_line[0]+"\t"+s_line[1]);
					UserCollection.removeUser(Integer.parseInt(s_line[1]));
				}
				else if("SIGNIN".equals(s_line[0])){
					System.out.println("----------------------------------------------");
					System.out.println("Command  : "+s_line[0]+"\t"+s_line[1]+"\t"+s_line[2]);
					UserCollection.UserSignIn(s_line[1], s_line[2]);
				}
				else if(s_line[0].equals("LISTUSERS")){
					System.out.println("----------------------------------------------");
					System.out.println("Command  : "+s_line[0]);
					boolean durum1=true;
					for(int i=0;i<UserCollection.userList.size();i++){
						if((UserCollection.userList).get(i).signedin){
							UserCollection.userList.get(i).LISTUSERS();
							durum1=false;
						}
					} if(durum1) System.out.println("Error: Please sign in and try again");	
				}
				else if (s_line[0].equals("UPDATEPROFILE")){
					System.out.println("----------------------------------------------");
					System.out.println("Command  : "+s_line[0]+"\t"+s_line[1]+"\t"+s_line[2]+"\t"+s_line[3]);
					boolean durum1=true;
					for(int i=0;i<UserCollection.userList.size();i++){
						if((UserCollection.userList).get(i).signedin){
							DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy", Locale.ENGLISH);
							 LocalDate date = LocalDate.parse(s_line[2], formatter);
							UserCollection.userList.get(i).UPDATEPROFILE(s_line[1], date, s_line[3]);
							durum1=false;
						}
					} if(durum1) System.out.println("Error: Please sign in and try again");	
				}
				else if(s_line[0].equals("CHPASS")){
					System.out.println("----------------------------------------------");
					System.out.println("Command  : "+s_line[0]+"\t"+s_line[1]+"\t"+s_line[2]);
					boolean durum1=true;
					for(int i=0;i<UserCollection.userList.size();i++){
						if((UserCollection.userList).get(i).signedin){
							UserCollection.userList.get(i).CHPASS(s_line[1], s_line[2]);
							durum1=false;
						}
					} if(durum1) System.out.println("Error: Please sign in and try again");	
				}
				else if(s_line[0].equals("ADDFRIEND")){
					System.out.println("----------------------------------------------");
					System.out.println("Command  : "+s_line[0]+"\t"+s_line[1]);
					boolean durum1=true;
					for(int i=0;i<UserCollection.userList.size();i++){
						if((UserCollection.userList).get(i).signedin){
							UserCollection.userList.get(i).ADDFRIEND(s_line[1]);
							durum1=false;
						}
					} if(durum1) System.out.println("Error: Please sign in and try again");
				}
				else if (s_line[0].equals("REMOVEFRIEND")){
					System.out.println("----------------------------------------------");
					System.out.println("Command  : "+s_line[0]+"\t"+s_line[1]);
					boolean durum1=true;
					for(int i=0;i<UserCollection.userList.size();i++){
						if((UserCollection.userList).get(i).signedin){
							UserCollection.userList.get(i).REMOVEFRIEND(s_line[1]);
							durum1=false;
						}
					} if(durum1) System.out.println("Error: Please sign in and try again");
				}
				else if(s_line[0].equals("LISTFRIENDS")){
					System.out.println("----------------------------------------------");
					System.out.println("Command  : "+s_line[0]);
					boolean durum1=true;
					for(int i=0;i<UserCollection.userList.size();i++){
						if((UserCollection.userList).get(i).signedin){
							UserCollection.userList.get(i).LISTFRIENDS();
							durum1=false;
						}
					} if(durum1) System.out.println("Error: Please sign in and try again");
				}
				else if(s_line[0].equals("BLOCK")){
					System.out.println("----------------------------------------------");
					System.out.println("Command  : "+s_line[0]+"\t"+s_line[1]);
					boolean durum1=true;
					for(int i=0;i<UserCollection.userList.size();i++){
						if((UserCollection.userList).get(i).signedin){	
							UserCollection.userList.get(i).BLOCK(s_line[1]);
							durum1=false;
						}
					} if(durum1) System.out.println("Error: Please sign in and try again");
				}
				else if(s_line[0].equals("UNBLOCK")){
					System.out.println("----------------------------------------------");
					System.out.println("Command  : "+s_line[0]+"\t"+s_line[1]);
					boolean durum1=true;
					for(int i=0;i<UserCollection.userList.size();i++){
						if((UserCollection.userList).get(i).signedin){
							UserCollection.userList.get(i).UNBLOCK(s_line[1]);
							durum1=false;
						}
					} if(durum1) System.out.println("Error: Please sign in and try again");
				}
				else if(s_line[0].equals("SHOWBLOCKEDUSERS")){
					System.out.println("----------------------------------------------");
					System.out.println("Command  : "+s_line[0]);
					boolean durum1=true;
					for(int i=0;i<UserCollection.userList.size();i++){
						if((UserCollection.userList).get(i).signedin){
							UserCollection.userList.get(i).SHOWBLOCKEDUSERS();
							durum1=false;
						}
					} if(durum1) System.out.println("Error: Please sign in and try again");
				}
				else if(s_line[0].equals("SHOWBLOCKEDFRIENDS")){
					System.out.println("----------------------------------------------");
					System.out.println("Command  : "+s_line[0]);
					boolean durum1=true;
					for(int i=0;i<UserCollection.userList.size();i++){
						if((UserCollection.userList).get(i).signedin){
							UserCollection.userList.get(i).SHOWBLOCKEDFRIENDS();
							durum1=false;
						}
					} if(durum1) System.out.println("Error: Please sign in and try again");
				}
				else if(s_line[0].equals("SIGNOUT")){
					System.out.println("----------------------------------------------");
					System.out.println("Command  : "+s_line[0]);
					boolean durum1=true;
					for(int i=0;i<UserCollection.userList.size();i++){
						if((UserCollection.userList).get(i).signedin){
							UserCollection.SIGNOUT();
							durum1=false;
						}
					} if(durum1) System.out.println("Error: Please sign in and try again");
				}
				else if (s_line[0].equals("ADDPOST-TEXT")){
					System.out.println("----------------------------------------------");
					System.out.println("Command  : "+s_line[0]);
					String[] array = s_line[4].split(":");
					boolean durum1=true;
					for(int i=0;i<UserCollection.userList.size();i++){
						if((UserCollection.userList).get(i).signedin){
							UserCollection.userList.get(i).ADDPOST_TEXT(s_line[1],tarih.format(now),Double.parseDouble(s_line[2]), Double.parseDouble(s_line[3]),array);
							durum1=false;
						}
					} if(durum1) System.out.println("Error: Please sign in and try again");
				}
				else if (s_line[0].equals("SHOWPOSTS")){
					System.out.println("----------------------------------------------");
					System.out.println("Command  : "+s_line[0]);
					System.out.println("***********************************");
					System.out.println(s_line[1]+"'s Posts");
					System.out.println("***********************************");
					UserCollection.showPosts(s_line[1]);
				}
				else if (s_line[0].equals("ADDPOST-IMAGE")){
					System.out.println("----------------------------------------------");
					System.out.println("Command  : "+s_line[0]);
					String[] array = s_line[4].split(":");
					boolean durum1=true;
					for(int i=0;i<UserCollection.userList.size();i++){
						if((UserCollection.userList).get(i).signedin){
							UserCollection.userList.get(i).ADDPOST_IMAGE(s_line[1],tarih.format(now),Double.parseDouble(s_line[2]), Double.parseDouble(s_line[3]),array,s_line[5],s_line[6]);
							durum1=false;
						}
					} if(durum1) System.out.println("Error: Please sign in and try again");
				}
				else if (s_line[0].equals("ADDPOST-VIDEO")){
					System.out.println("----------------------------------------------");
					System.out.println("Command  : "+s_line[0]);
					String[] array = s_line[4].split(":");
					boolean durum1=true;
					for(int i=0;i<UserCollection.userList.size();i++){
						if((UserCollection.userList).get(i).signedin){
							UserCollection.userList.get(i).ADDPOST_VIDEO(s_line[1],tarih.format(now),Double.parseDouble(s_line[2]), Double.parseDouble(s_line[3]),array,s_line[5],s_line[6]);
							durum1=false;
						}
					} if(durum1) System.out.println("Error: Please sign in and try again");
				}
				else if (s_line[0].equals("REMOVELASTPOST")){
					System.out.println("----------------------------------------------");
					System.out.println("Command  : "+s_line[0]);
					boolean durum1=true;
					for(int i=0;i<UserCollection.userList.size();i++){
						if((UserCollection.userList).get(i).signedin){
							UserCollection.userList.get(i).REMOVELASTPOST();
							durum1=false;
						}
					} if(durum1) System.out.println("Error: Please sign in and try again");
				}
				}scanner.close();
		}catch(Exception e){
		System.out.println("hata : "+e.getMessage());
		}
	}	
				
/**
 * Static main method.			
 * @param args
 */
public static void main(String[] args){
		String[] arguman={args[0],args[1]};
		usersreading(arguman[0]);
		commandsreading(arguman[1]);
	}
}
