package az.edu.turing.Bank;

import java.math.BigDecimal;

public class CurrencyConverter {

    public void convert(BigDecimal amount,String fromCurrency,String toCurrency){

            for (Valyuta value : Valyuta.values()) {
                if((value==Valyuta.AZN || value==Valyuta.USD||value==Valyuta.EUR)){
                    throw new UnsupportedCurrencyException("UnsupportedCurrencyException");
                }
            }
    }
}
