import java.util.Scanner;

public class sassocartaforbice 
{

	/*Scrivere un programma che chieda agli utenti due stringhe in ingresso, le stringhe possono
	valere solo: “carta”, “forbice” o “sasso”. Il programma dovrà quindi effettuare i dovuti controlli e 
	dichiarare il vincitore secondo le note regole della “morra cinese” (forbice vince su carta, carta vince 
			su sasso, sasso vince su forbice). */
			
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int numCasuale = (int) (Math.random() * 3);
		
		String scelta1 = "";
		
		if (numCasuale == 0)
			scelta1 = "sasso";
		else if (numCasuale == 1)
			scelta1 = "carta";
		else if (numCasuale == 2)
			scelta1 = "forbici";			
		
		String scelta2 = null;
		String sasso = "sasso";
		String carta = "carta";
		String forbici = "forbici";
		
		do {
			System.out.print("Fai la tua scelta! -> ");
			scelta2 = sc.nextLine().toLowerCase();
						
			if (!scelta2.equals(sasso) && !scelta2.equals(carta) && !scelta2.equals(forbici))
				System.out.println("Devi scegliere un'opzione tra sasso, carta, o forbici" );
			
		}
		while (!scelta2.equals(sasso) && !scelta2.equals(carta) && !scelta2.equals(forbici));
		
		if (scelta1.equalsIgnoreCase(scelta2))
			System.out.println("Avete scelto entrambi " + scelta1 + ", avete pareggiato");
		
		else if (scelta2.equals(sasso) && scelta1.equals(forbici) || 
			scelta2.equals(carta) && scelta1.equals(sasso) ||
			scelta2.equals(forbici) && scelta1.equals(carta))
			
			System.out.println("Hai scelto " + scelta2 + " mentre il tuo avversario ha scelto " + scelta1 + ", hai VINTO!");
		else
			System.out.println("Hai scelto " + scelta2 + " mentre il tuo avversario ha scelto " + scelta1 + ", hai PERSO!");
			    
	 }		
}
