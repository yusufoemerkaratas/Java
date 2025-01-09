package Lektion16.Ubung2;

import java.util.Arrays;

public class myCalculator  implements  ChangeCalculator{
    @Override
    public int[] getChange(int euros, int cent){
        int beitrag =euros*100+cent;
        int wechsel[] = new int[Coin.values().length];

        for(int i=0;i<Coin.values().length;i++){
            Coin coin =Coin.values()[i];
            wechsel[i]=beitrag/coin.getValue();
            beitrag%= coin.getValue();
        }
    return wechsel;
    }
}
