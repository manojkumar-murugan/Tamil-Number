/**
 * 28 Jun 2020
 */
package numbers;

import java.util.Scanner;

/**
 * @author Manojkumar Murugan
 *
 * 14:31:1228 Jun 2020
 */
public class FindTamilName {

	/**
	 * @param args
	 */
	long number; 
	
	FindTamilName(){ }

	FindTamilName(long num){
		this.number=num;
	}
	
	//Root handler
	public String findTamilName(long number) {
			if(number>=0 && number<=20)
				return findTamilNameLessThanTwenty(number);
			else if(number>=21 && number<=99)
				return fetchTamilNameTwoDigits(number);
			else if(number>=100 && number<=999)
				return fetchTamilNameThreeDigits(number);
			else if(number>=1000 && number<=9999)
				return fetchTamilNameFourDigits(number);
			else if(number>=10000 && number<=99999)
				return fetchTamilNameFiveDigits(number);
			else if(number>=100000 && number<=9999999)
				return fetchTamilNameSixDigits(number);		
			else if(number>=10000000 && number<=99999999)
				return fetchTamilNameSevenDigits(number);
			else
				return "";
	}
	private String fetchTamilNameSevenDigits(long number) {
//		if(number%10000000==0)
			return findMultiplesOfCrores(number);
//		return findTamilNameForSevenDigits(number);
	}
	
//	private String findTamilNameForSevenDigits(long number) {
//		findCroresForSevenDigits(number)
//	}
	
//	private String findCroresForSevenDigits(number){
//		return number%10000000+""
//	}
	private String findMultiplesOfCrores(long number) {
		return fetchTamilNameTwoDigits(number/10000000)+" "+"கோடி";
	}
	
	private String fetchTamilNameSixDigits(long number) {
		if(number%100000==0)
			return findMultiplesOfLakhs(number);
		return findTamilNameForSixDigit(number);
	}
	
	private String findTamilNameForSixDigit(long number){
		return findLakhsDigitsforSixDigit(number)+" "+fetchTamilNameFiveDigits(number%100000);
	}
	
	private String findLakhsDigitsforSixDigit(long number){
		return fetchTamilNameTwoDigits(number/100000)+" "+"லட்சத்து"
	;
	}
	
	private String findMultiplesOfLakhs(long number) {
		return fetchTamilNameTwoDigits(number/10000)+" "+"லட்சம்";
	}
	
	private String fetchTamilNameFiveDigits(long number) {
		if(number%1000==0)
			return fetchMultipleOfThousandForFiveDigit(number);
		else
			return fetchThousandDigitForFiveDigit(number);
	}
	
	private String fetchMultipleOfThousandForFiveDigit(long number) {
		return fetchTamilNameTwoDigits(number/1000)+" "+"ஆயிரம்";
	}
	
	private String fetchThousandDigitForFiveDigit(long number) {
		return fetchTamilNameTwoDigits(number/1000)+" "+"ஆயிரத்து"+" "+fetchTamilNameThreeDigits(number%1000);
	}
	
	private String fetchTamilNameFourDigits(long number) {
		if(number%1000==0)
			return fetchMultiplesOfThousand(number);
		else
			return fetchThousandsDigitsForFourDigit(number/1000)+" "+fetchTamilNameThreeDigits(number%1000);
	}
	
	private String fetchThousandsDigitsForFourDigit(long number) {
		if(number==1) return "ஆயிரத்து";
		else if(number==2) return "இரண்டாயிரத்து";
		else if(number==3) return "மூவாயிரத்து";
		else if(number==4) return "நான்காயிரத்து";
		else if(number==5) return "ஐயாயிரத்து";
		else if(number==6) return "ஆராயிரத்து";
		else if(number==7) return "ஏழாயிரத்து";
		else if(number==8) return "எட்டாயிரத்து";
		else  return "ஒன்பதாயிரத்து";
	}
	
	private String fetchMultiplesOfThousand(long number) {
		if(number==1000) return "ஆயிரம்";
		else if(number==2000) return "இரண்டாயிரம்";
		else if(number==3000) return "மூவாயிரம்";
		else if(number==4000) return "நான்காயிரம்";
		else if(number==5000) return "ஐயாயிரம்";
		else if(number==6000) return "ஆறாயிரம்";
		else if(number==7000) return "ஏழாயிரம்";
		else if(number==8000) return "எட்டாயிரம்";
		else  return "ஒன்பதாயிரம்";
	}
	
	private String fetchTamilNameThreeDigits(long number) {
		if(number%100==0)
			return fetchMultiplesOfHundred(number);
		else
			return fetchHundredsDigitsForThreeDigit(number/100)+" "+fetchTamilNameTwoDigits(number%100);
	}

	private String fetchMultiplesOfHundred(long number) {
		if(number==100) return "நூறு";
		else if(number==200) return "இருநூறு";
		else if(number==300) return "முன்னூறு";
		else if(number==400) return "நானூறு";
		else if(number==500) return "இந்நூறு";
		else if(number==600) return "அறுநூறு";
		else if(number==700) return "எழுநூறு";
		else if(number==800) return "எண்ணூறு";
		else  return "தொள்ளாயிரம்";
	}

	private String fetchHundredsDigitsForThreeDigit(long number) {
		if(number==1) return "நூற்றி";
		else if(number==2) return "இருநூற்று";
		else if(number==3) return "முன்னூற்று";
		else if(number==4) return "நானூற்று";
		else if(number==5) return "ஐநூற்று";
		else if(number==6) return "அறுநூற்று";
		else if(number==7) return "எழுநூற்று";
		else if(number==8) return "எண்ணூற்று";
		else  return "தொள்ளாயிரத்து";
	}
	
	private	String fetchTamilNameTwoDigits(long number) {
		if(number%10==0) {
			return fetchMultiplesOfTen(number);
		}
		if(number>=1 && number<=20)
			return findTamilNameLessThanTwenty(number);
		return fetchTensDigitForTwodigit(number/10)+" "+findTamilNameOneDigit(number%10);
	}
	
	private String fetchTensDigitForTwodigit(long number) {
		if(number==2) return "இருபத்தி";
		else if(number==3) return "முப்பத்தி";
		else if(number==4) return "நாற்பத்து";
		else if(number==5) return "ஐம்பத்து";
		else if(number==6) return "அறுபத்து";
		else if(number==7) return "எழுபத்து";
		else if(number==8) return "எண்பத்து";
		else  return "தொண்ணூற்று";
	}
	
	private String fetchMultiplesOfTen(long number) {
		if(number==10) return "பத்து";
		else if(number==20) return "இருபது";
		else if(number==30) return "முப்பது";
		else if(number==40) return "நாற்பது";
		else if(number==50) return "ஐம்பது";
		else if(number==60) return "ஆறுபது";
		else if(number==70) return "ஏழுபது";
		else if(number==80) return "எண்பது";
		else  return "தொண்ணூறு";
	}

	private String findTamilNameOneDigit(long number) {
		if(number==0) return "சுழியம்";
		else if(number==1) return "ஒன்று";
		else if(number==2) return "இரண்டு";
		else if(number==3) return "மூன்று";
		else if(number==4) return "நான்கு";
		else if(number==5) return "ஐந்து";
		else if(number==6) return "ஆறு";
		else if(number==7) return "ஏழு";
		else if(number==8) return "எட்டு";
		else  return "ஒன்பது";
	}
	
	private String findTamilNameLessThanTwenty(long number) {
		if(number>=0 && number <=20)
			return findTamilNameOneDigit(number);
		if(number==11) return "பதினொன்று";
		else if(number==12) return "பன்னிரண்டு";
		else if(number==13) return "பதிமூன்று";
		else if(number==14) return "பதினான்கு";
		else if(number==15) return "பதினைந்து";
		else if(number==16) return "பதினாறு";
		else if(number==17) return "பதினேழு";
		else if(number==18) return "பதினெட்டு";
		else  return "பத்தொன்பது";
	}
	
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
