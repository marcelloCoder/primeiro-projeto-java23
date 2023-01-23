/**
 * 
 */
package br.com.ebac.primeiro.classes;

/**
 * @author marce
 *
 */
public class Variaveis {
	
	private int cod; // Primitivo
	
	private Integer codigo; //Wrappers
	
	private Long codMaior;
	
	private Double valorDecimal;
	
	private boolean status;
	
	protected String string = new String();
	
	//boxing
	protected String boxing = "aa";
	
	//unboxing
	float unboxing = Float.valueOf(0.6f);
	
	//Casting
	byte b = 0;
	short s = b;
	
	
	public Double getVariaveisComplexas() {
		
		double doubleone = 0.7; //tipo primitiva 
		
		Double doubletwo = (doubleone + 0.333); //tipo wrapper  
		
		return doubletwo;
		
	}
	
	
	public Short getVariaveisComplexas2() {
		int inteiro = 21;
		byte byteone = (byte) inteiro;
		short s1 = (short) inteiro;
		
		 
		return s1;
	}
	
	

}
