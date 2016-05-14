public class Most_Reacted_Tweet implements Command
{
	private TweetEngine MostRT=null;
	public Most_Reacted_Tweet(TweetEngine x){
	MostRT=x;
	}
	
	public void Execute()
	{
	MostRT.most_reacted_tweet();
	}

}
