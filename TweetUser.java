import java.io.*;
//import java.lang.String.*;
import java.util.Arrays;
import java.util.*;
class TweetUser
{
public String Acc_name=null;

public ArrayList<String> tweets;
public int TweetCount=1;
public String[] ReactEmotions=null;


public ArrayList<TweetUser> following_me;
private static int acount=0;
public ArrayList<TweetUser> following;
private static int bcount=0;

Scanner sn =new Scanner(System.in);
public TweetEngine TweetE;



	
	public TweetUser(String Uname,TweetEngine Tweet)
	{
	following_me=new ArrayList<TweetUser>();
	following=new ArrayList<TweetUser>();
	tweets=new ArrayList<String>();
	
	System.out.println("hey hi "+Uname+", your Responce Emotion???");
	System.out.println("Happy,Sad,Good,Bad,Crazy");
	String ReactEmotion=sn.next();
	ReactEmotions=ReactEmotion.split(",");
	Acc_name="@"+Uname;
	TweetE=Tweet; 
	  
	}
	
	public void Tweet(){
	
	System.out.println("Select Emotion");
	System.out.println("Happy,Sad,Good,Bad,Crazy");
	String emotion=sn.next();
	System.out.println("tweet the feelings");
	String tweet=sn.next();
	
	
	
	tweet=Acc_name+"-"+tweet+" #"+emotion;
	tweets.add(tweet);
	
	System.out.println(" ");
	System.out.println("Tweet :"+tweet);
	
	Notify(tweet,emotion);
	
	
		
		
	}
	
	
	
	public void add_following(TweetUser a)
	{
	
	following.add(a);
	a.following_me.add(this);
	bcount++;
	
	}
	
	public void Update(String Tweet,String Emotion,int[]a)
	{
	System.out.println(Acc_name+" : "+Tweet);
	for(int i=0;i<ReactEmotions.length;i++){
	if(Emotion.equals(this.ReactEmotions[i]))
	{
	
	a[0]++;
	TweetE.ReactedEmotion(Emotion);
	System.out.println(Acc_name+" Reacted");
	}
	}
	
	}
 
 		private void Notify(String tweet,String emotion) {
      	 int []react=new int[1];
 			System.out.println("Tweet_Notifications");
			for(int i=0;i<following_me.size();i++)
			{
			 following_me.get(i).Update(tweet,emotion,react);   
			}
			TweetE.add_tweet(tweet,react[0]);
		    System.out.println("");
 		}
 
}
