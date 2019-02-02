// Lab12avst.java     This is the student starting version.
// This assignment pertains to some of the "Magpie" AP Lab Materials
//***************************************************************************
// The "Magpie" AP Lab is created for the College Board APCS
// curriculum by Laurie White.
// Leon Schram has altered some of the "Magpie" files to focus on 
// specific CS topics as the "Magpie" Lab is integrated into the curriculum.

 
import java.util.Scanner;
import java.util.ArrayList;
public class Lab12avst
{
	public static void main(String[] args)
	{
		MagpieLab12a maggie = new MagpieLab12a();

		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();

		while (!statement.equals("Bye"))
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}
	}
}


class MagpieLab12a
{
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}

	public String getResponse(String statement)
	{
		String response = "";
		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = getFamilyResponse();
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	private String getRandomResponse()
	{
		String[] ans = new String[10];
		ans[0] = "Interesting, tell me more.";
		ans[1] = "Do you really think so?";
		ans[2] = "You don't say.";
		ans[3] = "oh wow.";
		ans[4] = "go on";
		ans[5] = "keep going";
		ans[6] = "wow fascinating ";
		ans[7] = "nice";
		ans[8] = "very nice";
		ans[9] = " didn't know that could happen.";
		final  int NUMBER_OF_RESPONSES = ans.length;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		return ans[whichResponse];
	}
	
	private String getFamilyResponse()
	{
		ArrayList<String> ans = new ArrayList<String>();
	    ans.add("Tell me more about your family");
	    ans.add("whos in your family?");
	    ans.add("How is your dad?");
	    ans.add("Do you have any siblings?");
	    ans.add("How is your mom?");
	    ans.add("How many uncles do you have?");
	    ans.add("How many aunts do you have?");
	    ans.add("How many people are in your family?");
	    ans.add("Do you have any cousins?");
	    ans.add("How is you grandparents? ");
	    
		final  int NUMBER_OF_RESPONSES = ans.size();
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		return ans.get(whichResponse);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}