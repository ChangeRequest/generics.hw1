package school.lemon.changerequest.java.generics.numberGenerators;

/**
 * Created by User on 02.01.2017.
 */
public class DubleGenerator extends NumberGenerator {


    @Override
   public Number[] NumberGenerator() {
        Double[] doublerGenerator=new Double[10];
        for(int i=0;i<doublerGenerator.length;i++){doublerGenerator[i]=(Double)(Math.random()*100);}

        return doublerGenerator;
    }



    public int size(NumberGenerator e){ return 10;}
    public  Double get(NumberGenerator e, int index){
        return (Double) (e.NumberGenerator()[index]);
}
}
