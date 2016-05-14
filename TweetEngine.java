import java.io.*;
//import java.lang.String.*;
import java.util.Arrays;
import java.util.*;
public class  TweetEngine
{
public int tweetno=0;
int reaction=0;
public ArrayList<String> TWEETS=new ArrayList<String>();

int[] TWEETS_Reaction_Count= new int[200];
int[] MOTIONS_Reaction_Count=new int[5];

	
	
	public void ReactedEmotion(String emo)
	{
		if(emo.equals("Happy"))
		{
		MOTIONS_Reaction_Count[0]++;
		}
	
		if(emo.equals("Sad"))
		{
		MOTIONS_Reaction_Count[1]++;
		}
	
		if(emo.equals("Good"))
		{
		MOTIONS_Reaction_Count[2]++;
		}
	
		if(emo.equals("Bad"))
		{
		MOTIONS_Reaction_Count[3]++;
		}
	
		if(emo.equals("Crazy"))
		{
		MOTIONS_Reaction_Count[4]++;
		}
	
	}
	
	public void most_reacted_tweet()
	{
	int pos=0;
		for(int j=1;j< TWEETS_Reaction_Count.length;j++)
		{
		if(TWEETS_Reaction_Count[pos]<TWEETS_Reaction_Count[j])
			{pos=j;}
		}
		System.out.println((TWEETS.get(pos))+":No of ppl Reacted ->"+ TWEETS_Reaction_Count[pos]);
	
	}
	
	public void most_reacted_emotion()
	{
	
	int pos=0;
	    for(int j=1;j< MOTIONS_Reaction_Count.length;j++)
		{
		if(MOTIONS_Reaction_Count[pos]<MOTIONS_Reaction_Count[j])
			{pos=j;}
		}
		int value=MOTIONS_Reaction_Count[pos];
		if(value==MOTIONS_Reaction_Count[0])
			{System.out.println("HAPPY:No of ppl Reacted ->"+ MOTIONS_Reaction_Count[pos]);}
		
		
		if(value==MOTIONS_Reaction_Count[1])
			{System.out.println("SAD:No of ppl Reacted ->"+ MOTIONS_Reaction_Count[pos]);}
		
		
		if(value==MOTIONS_Reaction_Count[2])
			{System.out.println("GOOD:No of ppl Reacted ->"+ MOTIONS_Reaction_Count[pos]);}
		
		
		if(value==MOTIONS_Reaction_Count[3])
			{System.out.println("BAD:No of ppl Reacted ->"+ MOTIONS_Reaction_Count[pos]);}
		
		
		if(value==MOTIONS_Reaction_Count[4])
			{System.out.println("CRAZY:No of ppl Reacted ->"+ MOTIONS_Reaction_Count[pos]);}
	
	}
	
	public void add_tweet(String tweet,int reacted_usera)
	{
	String s=tweet;
	TWEETS.add(s);
	TWEETS_Reaction_Count[tweetno]=reacted_usera;
	
	tweetno++;
	}
	


}
