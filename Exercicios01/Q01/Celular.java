/**
*Program that simulates a cellphone
*/

public class Celular{
    	// The amount of money entered by a customer so far.
    	private int saldo;

    	public Celular(){
 		saldo = 1000;
    	}

    	public Celular(int valor){
		if(valor < 0){
			System.out.println("You tried to insert a negative amount: " + valor + ". Use a positive amount.");
			saldo = 0;	
		} else {
        		saldo = valor;
		}
    	}

    	/**
     	* Return The amount of money already inserted.
     	*/
    	public int getSaldo(){
        	return saldo;
    	}

	/**
	* Insert the amount of money in cents desired by the costumer for credit.
	*/
    	public void setSaldo(int valor){
  		saldo = valor;
    	}

    	/**
     	* Add an amount of money in cents.
     	* Check that the amount is sensible.
     	*/
    	public void topUp(int valor){
        	if(valor > 0) {
            		saldo = saldo + valor;
        	} else {
            		System.out.println("You tried to insert a negative amount: " + valor + ". Use a positive amount.");
        	}
    	}

	/**
	* Remove an amount of money.
	* Check that the amount is within the range of credit present in the cellphone
	*/
   	public void consumir(int valor){
		if(saldo >= valor){
			saldo = saldo - valor;
		} else {
			System.out.println("You do not have enough credit·");
		}
    	}  
}
