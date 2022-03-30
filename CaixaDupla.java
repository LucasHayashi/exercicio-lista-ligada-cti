//CaixaDp.java
//+----+-------+------+
//| esq| VALOR | dir |
//+----+-------+------+
//struct caixa
//{
//   caixa *esq; SETA -> ENDEREÇO anterior  
//   int valor;
//   caixa *dir; SETA -> ENDEREÇO proximo
//DE MEMORIA
//};

class CaixaDupla
{
	private CaixaDupla esq;
	private int valor;
	private CaixaDupla dir;
	//construtor
	CaixaDupla()
	{
		setDir(null);
		setValor(0);
		setEsq(null);
	}
	
	CaixaDupla(int v)
	{
		setDir(null);
		setValor(v);
		setEsq(null);
	}
	public void setDir(CaixaDupla p)
	{   this.dir=p; }
	
	public void setValor(int v)
	{   this.valor=v; }
	
	public void setEsq(CaixaDupla p)
	{   this.esq=p; }
	
	public int getValor()
	{ return this.valor; }
	
	public CaixaDupla getDir()
	{ return dir; }
	
	public CaixaDupla getEsq()
	{ return esq; }
	
}
