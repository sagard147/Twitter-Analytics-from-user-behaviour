import java.io.*;
//import java.lang.String.*;
import java.util.Arrays;
import java.util.*;
public class TestTweet
{
	public static void main(String[]args)
	{
	
	TweetEngine Sam=new TweetEngine();
	Most_Reacted_Tweet RT=new Most_Reacted_Tweet(Sam);
	Most_Reacted_Emotion RE=new Most_Reacted_Emotion(Sam);
	
	
	TweetUser sagar=new TweetUser("SAg",Sam);
	TweetUser sachin=new TweetUser("sachin",Sam);
	TweetUser virat=new TweetUser("vir@t",Sam);
	TweetUser Dravid=new TweetUser("Drav",Sam);
	TweetUser sudeep=new TweetUser("Kichha",Sam);
	Scanner sn =new Scanner(System.in);
	
	sagar.add_following(virat);
	sagar.add_following(Dravid);
	
	sachin.add_following(virat);
	sachin.add_following(Dravid);
	sachin.add_following(sagar);
	
	Dravid.add_following(virat);
	Dravid.add_following(sagar);
	
	
	
	
  
   String s="hip";
   int wish=1;
	while(wish<8)
		{
		
		System.out.println("Enter your Tweet Acc Choice");
		System.out.println("1:SAg");
		System.out.println("2:Sachin");
		System.out.println("3:Virat");
		System.out.println("4:Dravid");
		System.out.println("5:Kichha");
		System.out.println("6:Most_reacted_Tweet");
		System.out.println("7:Most_reacted_Emotion");
		System.out.println("8:Exit");
		
		wish=sn.nextInt();
		System.out.println("");
		
			switch(wish){
			case 1:sagar.Tweet();break;
			case 2:sachin.Tweet();break;
			case 3:virat.Tweet();break;
			case 4:Dravid.Tweet();break;
			case 5:sudeep.Tweet();break;
			case 6:RT.Execute();break;
			case 7:RE.Execute();break;
			
			default:System.out.println("THANK YOU");
			}
		}
	
	
	} 

}
