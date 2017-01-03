package school.lemon.changerequest.java.generics.numberGenerators;

/**
 * Created by User on 02.01.2017.
 */
public class IntegerGenerator extends NumberGenerator {
    @Override
   public Number[] NumberGenerator() {
        Integer[] integerGenerator=new Integer[10];
        for(int i=0;i<integerGenerator.length;i++){integerGenerator[i]=(int)(Math.random()*100);}
        return integerGenerator;
    }
 public int size(NumberGenerator e){ return 10;}
public  Integer get(NumberGenerator e, int index){
  return (Integer)(e.NumberGenerator()[index]);
}}
