import animals.Kotik;

import java.util.HashSet;

public class Application {
    public static void main(String[] args) {
        Kotik kotic1 = new Kotik("Garry", "Meow", 6, 4);
        Kotik kotic2 = new Kotik();
        kotic2.setName("Torry");
        kotic2.setVoice("Meow");
        kotic2.setSatiety(2);
        kotic2.setWeight(3);
        kotic2.eat(kotic2.getSatiety());

        kotic2.liveAnotherDay();
        //HashSet<String> liveAnotherDay = new HashSet<String>();
       // kotic2.liveAnotherDay();
      //  for (String a: liveAnotherDay) {
      //      System.out.println(a+"");
      //  }
        System.out.println(kotic1.getVoice());
        System.out.println(kotic2.getVoice());
        compareVoice(kotic1, kotic2);

        System.out.println("Второго котика зовут "+ kotic2.getName()+" его вес " + kotic2.getWeight());
        System.out.println("Количество котиков " + Kotik.getCount());
    }
    private static boolean compareVoice(Kotik kot1, Kotik kot2) {
        int kkk = kot1.getVoice().compareTo(kot2.getVoice());
        kot1.setVoice(kot1.getVoice());
        kot2.setVoice(kot2.getVoice());
        if (kkk<0) {
            System.out.println("голос первого кота "+kot1.getVoice() + " голос второго кота "+ kot2.getVoice() +"голоса тиков разные");
            return false;
        }else {
            System.out.println("голоса котиков одинаковые " + "голос первого кота "+kot1.getVoice() + " голос второго кота "+ kot2.getVoice());
            return true;
        } }


    }

