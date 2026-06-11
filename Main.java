/**
 * Fill in DACA information.
 * @author Rafael Castro
 */
public class Main
{
	public static void main(String[] args)
	{
		//DECLARATION + INITIALIZATION SECTION
		String Surname = "SPECIMAN";
		String GivenName = "TEST V";
		String USCIS = "000-000-725";
		String Category = "C09";
		String Card = "SRC0000000725";
		String CountryofBirth = "Ethiopia";
		String TermsandConditions = "None";
		String DateofBirth = "01JAN1920";
		String Sex = "M";
		String ValidFrom = "01/01/80";
		String CardExpires = "05/10/11";

		//INPUT SECTION
		// N/A
		
		//CALCULATION SECTION
		
		//OUTPUT SECTION
		System.out.println("╔══════════════════════════════════════════════════════════════════════");
		System.out.println("║         UNITED STATES OF AMERICA");
		System.out.println("║                                  EMPLOYMENT AUTHORIZATION CARD");
		System.out.println("║                       Surname");
		System.out.println("║                       "+ Surname);
		System.out.println("║  .----.    .----.     Given Name");
		System.out.println("║ (   ^  \\  /  ^   )    "+ GivenName);
		System.out.println("║        |  |           USCIS#         Category   Card#");
		System.out.println("║       _/  \\_          "+ USCIS+"     " + Category+"       "  + Card);
		System.out.println("║      (_    _)         Country of Birth");
		System.out.println("║   ,    `--`    ,      "+ CountryofBirth);
		System.out.println("║   \\'-.______.-'/      Terms and Conditions");
		System.out.println("║    \\          /       "+ TermsandConditions);
		System.out.println("║     '.--..--.'        Date of Birth   Sex");
		System.out.println("║       `\"\"\"\"\"`         "+ DateofBirth+"       " + Sex);
		System.out.println("║                       Valid From:     "+ ValidFrom);
		System.out.println("║                       Card Expires:   "+ CardExpires);
		System.out.println("║ ascii art by: jgs     NOT VALID FOR REENTRY TO U.S.");
		System.out.println("╚══════════════════════════════════════════════════════════════════════");
		//ascii art credit: http://www.oocities.org/spunk1111/bodypart.htm
	}
}