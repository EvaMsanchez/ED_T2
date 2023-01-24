package es.studium.ejemploInterfaces;

public class Acumulador implements IModificacion, INumerico, IConstantes
{

	private int valor;
	
	public Acumulador (int i)
	{
		valor = i;
	}
	
	public int getValor()
	{
		return valor;
	}

	public void setValor(int valor)
	{
		this.valor = valor;
	}

	
	
	@Override
	public void incremento(int a)
	{
		valor = valor + a; //valor += a; --> es lo mismo
		
	}
	
	

	@Override
	public void setPrecision(int p)
	{
		valor = p;
		
	}
	
	

	@Override
	public void setMaximo(int m)
	{
		valor = m;
		
	}
	
}
