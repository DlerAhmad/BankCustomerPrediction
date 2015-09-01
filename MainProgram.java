import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * A main program to predict whether a client subscribes to offered
 * Term-deposit plan.
 * 
 * @author Dler Ahmad , Atir Petkar
 * @version May 17, 2015
 *
 */
public class MainProgram {
	
	
	/**
	 * Displays the program menu
	 */
	public static void showMenu(){	
		System.out.println(" *** WELCOME TO BANK TERM-DEPOSIT PLAN PREDICTION SYSTEM ***");
		System.out.println(" Please enter path to the input file containing clients information"
				+ " or enter \"exit\" to exit the program:" );
	}
	
	/**
	 * Main program
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		String input;
		String header=null;
		String delimiter; 
		String outFileName =null;
		int clientCount=0;
		int fileCount=0;
		ArrayList<Node> clients = new ArrayList<Node>();
		Scanner scanner =new Scanner( System.in);
		BufferedReader br;
		
		while(true)
		{
			//taking user input
			showMenu();
			input=scanner.next();
			
			if(input.equalsIgnoreCase("exit"))
			{
				scanner.close();
				System.exit(0);
			}
			try{
				
				//taking delimiter character from user
				System.out.println(" Please enter the delimiter character:");
				delimiter=scanner.next();
				
				//reading clients info from file
				br =new BufferedReader(new FileReader(input));
				String line;
			    while ((line = br.readLine()) != null) {
			    	if (clientCount==0)
			    	{
			    		header=line;
			    	}else
			    	{
			    		String[] cl= line.split(delimiter);
				    	
			    		//adding the client to the list
				    	clients.add(new Node(Integer.parseInt(cl[0]),cl[1],cl[2],cl[3],cl[4],Double.parseDouble(cl[5]),
				    			cl[6],cl[7],cl[8],Integer.parseInt(cl[9]),cl[10],Integer.parseInt(cl[11]),
				    			Integer.parseInt(cl[12]),Integer.parseInt(cl[13]),Integer.parseInt(cl[14]),cl[15]));
			    	}
			    	
			    	clientCount++;
			    }
			    br.close();
			    String outClient;
			    
			    //make predictions and write to output file
			    outFileName="output" +(fileCount++)+".csv";
			    FileWriter fw = new FileWriter(outFileName);
			    fw.write(header+"\n");
			    for (Node client : clients)
			    {
			    	outClient=client+";"+DecisionTree.Predict(client)+"\n";
			    	fw.write(outClient);
			    }
			
			}catch(FileNotFoundException ex)
			{
				System.err.println("invalid file path. please try again.");
				break;
			}catch(Exception ex)
			{
				scanner.close();
				ex.printStackTrace();
			}
			
			System.err.println("DONE! The prediction results are stored in the file "+ outFileName+"\n");
			clientCount=0;
		}
		
		
	}

}
