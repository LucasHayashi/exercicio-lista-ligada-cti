//CaixaDp.java
//+----+-------+------+
//| esq| VALOR | dir |
//+----+-------+------+

class Lista
{
	private CaixaDupla c1, c2, c3, c4, raiz, aux;
	
	public Lista()
	{
		raiz= new CaixaDupla();
		c1 = new CaixaDupla();
		c2 = new CaixaDupla();
		c3 = new CaixaDupla();
		c4 = new CaixaDupla();
	}
	
	public Lista(int v1, int v2, int v3, int v4)
	{
		this();
		raiz.setValor(4);
		c1.setValor(v3);
		c2.setValor(v4);
		c3.setValor(v2);
		c4.setValor(v1);
	}
	
	public void LigaTudo()
	{
		raiz.setEsq(c1);
		raiz.setDir(c4);
		c1.setDir(c2);
		c2.setEsq(c1);
		c2.setDir(c3);
		c3.setEsq(c2);
		c3.setDir(c4);
		c4.setEsq(c3);
	}
	
	public void Mostraif(){
		aux = raiz.getEsq();
		
		while (aux!= null){
			
		System.out.println("\n aux="+aux+" esq="+aux.getEsq()+" valor="+aux.getValor()+" direita="+aux.getDir()); 
		
		aux=aux.getDir();
		}
	}
	
	public void Mostrafi(){
		aux = raiz.getDir();
		
		while (aux!= null){
			
		System.out.println("\n aux="+aux+" dir="+aux.getDir()+" valor="+aux.getValor()+" esquerda="+aux.getEsq()); 
		
		aux=aux.getEsq();
		}
	}
	
	public int removefim(){
		int y = 0;
		
		if(raiz.getValor()==0)
		{
		   return 0;	
		}
		
		aux=raiz.getDir();//vai na cx4
		y=aux.getValor();//pega valor
		raiz.setValor(raiz.getValor() - 1);//tira um raiz
        aux = aux.getEsq(); //vai pra cx3
        raiz.setDir(aux);// aponta para 3
		
        if(aux==null)
        {
			raiz.setEsq(null);
			
		}
		else
		{
          aux.setDir(null);// dir cx3=null
		}
		return y;			
	}
	
	public int removeinicio(){
		int y = 0;
		
		if(raiz.getValor()==0)
		{
		   return 0;	
		}
		
		aux=raiz.getEsq();//vai na cx1
		y=aux.getValor();//pega valor
		raiz.setValor(raiz.getValor() - 1);//tira um raiz
        aux = aux.getDir(); //vai pra cx2
        raiz.setDir(aux);// aponta para 2
		
        if(aux==null)
        {
			raiz.setEsq(null);
		}
		else
		{
          aux.setDir(null);// dir cx2=null
		}
		return y;			
	}
}
