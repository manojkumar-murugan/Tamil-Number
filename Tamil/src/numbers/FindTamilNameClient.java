/**
 * 22 Jul 2020
 */
package numbers;

import java.util.Scanner;

/**
 * @author Manojkumar Murugan
 *
 * 14:45:0522 Jul 2020
 */
public class FindTamilNameClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FindTamilName findTamilName=new FindTamilName();
		Scanner scanner=new Scanner(System.in);
		String s="";
		boolean stopFlag=true;
		while(stopFlag) {
			try {
				s=scanner.next();
				if(s.equals("n")) {
					System.out.println(" பயன்  படுத்தியமைக்கு நன்றி");
					stopFlag=false;
					System.exit(0);
				}
				long val=Long.parseLong(s);
				System.out.println(findTamilName.findTamilName(val));
			}
			catch (NumberFormatException e) {
				System.out.println("தரவு எண்ணில் பிழையுள்ளது. தயவு கூர்ந்து சரிபார்க்கவும்");
				continue;
			}
		}
		scanner.close();
	}

}
