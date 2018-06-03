/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.constantes;

/**
 * @author OCE-WCD JUAN MANUEL HERNANDEZ
 *
 */
public enum CatalogoErrorType {
	
	VALOR_NULO(1),
    VALOR_NO_ENCONTRADO(2);

    private int value;

    private CatalogoErrorType(int val){
        value = val;
    }

    public int getValue(){
        return value;
    }

}
