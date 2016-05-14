
public class Most_Reacted_Emotion implements Command
{
	private TweetEngine MostRE=null;
	public Most_Reacted_Emotion(TweetEngine x){
	MostRE=x;
	}
	
	public void Execute()
	{
	MostRE.most_reacted_emotion();
	}
}
