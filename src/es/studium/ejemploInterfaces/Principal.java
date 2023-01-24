package es.studium.ejemploInterfaces;

public class Principal
{

	public static void main(String[] args)
	{
		Acumulador acumulador1 = new Acumulador (10);  //instanciando o construyendo el objeto
		acumulador1	.incremento(15);  //damos valor al incremento llamando a la clase acumulador.
		System.out.println(acumulador1.getValor());  //nos devuelve el nuevo valor.
		
		acumulador1.setPrecision(12);
		acumulador1.setMaximo(50);
		acumulador1.setValor(INumerico.NUMERO_E);
		acumulador1.setValor(IConstantes.VALOR_MAXIMO);
		acumulador1.setValor(IConstantes.VALOR_MINIMO);
		
		IModificacion acumulador2 = new Acumulador (12);
		acumulador2.incremento(24);
		
		INumerico acumulador3 = new Acumulador (24);
		acumulador3.setPrecision(10);
		acumulador3.setMaximo(100);
		
		IConstantes acumulador4 = new Acumulador (10);
		
	}

}
