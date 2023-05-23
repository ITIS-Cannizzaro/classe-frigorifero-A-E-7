
public class Frigorifero {
	int capienza;
	 String classe;
	 double prezzo;

	public Frigorifero(int capienza, String classe) {
		this.capienza=capienza;
		this.classe=classe;
	}
	public int GetCapienza() {
		return capienza;
	}
	public String GetClasse() {
		return classe;
	}
	public void GetPrezzo() {
		if(classe.equalsIgnoreCase("A")){
			prezzo=5;
			System.out.println("il frigo vale: "+ prezzo);
			System.out.println("il frigo che fa parte della classe A vale : "+ prezzo);
		prezzo*=capienza*5;
		System.out.println("ma questo frigo vale 5 volte il prodotto di capienza e moltiplicatore: "+ prezzo);
		}
			else if(classe.equalsIgnoreCase("A+")) {
				prezzo=1.5;
				
				System.out.println("il frigo che fa parte della classe A+ vale: "+ prezzo);
				}
			else if(classe.equalsIgnoreCase("A++")) {
				prezzo=2;
				System.out.println("il frigo che fa parte della classe A++ vale : "+ prezzo);
				
				}
			
			
		
			
		}
	}

