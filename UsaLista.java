//CaixaDp.java
//+----+-------+------+
//| esq| VALOR | dir |
//+----+-------+------+

public class UsaLista {
	public static void main (String[] args){
	
	Lista LDL;
	
	LDL = new Lista(55,45,25,35);
	LDL.LigaTudo();
	LDL.Mostraif();
	LDL.Mostrafi();
		
	int x = LDL.removefim();
	int y = LDL.removeinicio();
	
	System.out.println("Removeu a caixa: " + x);
	System.out.println("Removeu a caixa: " + y);	
	}
}
