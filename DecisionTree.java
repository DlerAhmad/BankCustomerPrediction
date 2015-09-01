/**
 * A class to represent the decision tree used in Bank 
 * Term-deposit plan prediction
 * 
 * @author Dler Ahmad , Atir Petkar
 * @version May 17, 2015
 *
 */
public class DecisionTree {

	/**
	 * predicts term-deposit subscription for the given client
	 * 
	 * @param client
	 * @return YES/NO 
	 */
	public static String Predict(Node client)
	{
		if (client.duration<522)
		{
			if (!client.poutcome.equalsIgnoreCase("failure") ||
					!client.poutcome.equalsIgnoreCase("nonexistent") ||
					!client.poutcome.equalsIgnoreCase("success"))
					{
						if (client.duration>162)
						{
							return "YES";
						}
					}
			
		}else
		{
			if(client.duration>=828)
			{
				return "YES";
			}else if(!client.poutcome.equalsIgnoreCase("failure") ||
					!client.poutcome.equalsIgnoreCase("nonexistent") ||
					!client.poutcome.equalsIgnoreCase("success"))
			{
				return "YES";
			}
		}
		return "NO";
	}
}
