import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Pokers {
    private static final String[] colors = {"♥","♠","♦","♣"};
    //买牌
    public static List<Poker> buyPokers() {
        ArrayList<Poker> pokerList = new ArrayList<>();
        for(int i = 0; i < 4; i++) {
            for(int j = 1; j <= 13; j++) {
                pokerList.add(new Poker(colors[i], j));
            }
        }
        return pokerList;
    }
    private static void swap(List<Poker> pokerList, int a, int b) {
        Poker tmp = pokerList.get(a);
        pokerList.set(a,pokerList.get(b));
        pokerList.set(b,tmp);
    }
    //洗牌
    private static void shufflePokers(List<Poker> pokerList) {
        Random random = new Random();
        for(int i = pokerList.size() - 1; i > 0; i--) {
            int tmp = random.nextInt(i);
            swap(pokerList, i, tmp);
        }

    }
    //揭牌 3个人，每个人揭5张牌
    private static List<ArrayList<Poker>> unveilPokers(ArrayList<Poker> p1,ArrayList<Poker> p2,
                                                       ArrayList<Poker> p3, List<Poker> ret) {

        //将三个人存入集合当中，遍历集合
        List<ArrayList<Poker>> person = new ArrayList<>();
        person.add(p1);
        person.add(p2);
        person.add(p3);
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 3; j++){
                ArrayList<Poker> tmp = person.get(j);
                tmp.add(ret.remove(0));
                //多态发生，调用ArrayList中remove
            }
        }
        return person;
    }


    public static void main(String[] args) {
        //买牌
        List<Poker> ret = buyPokers();
        //洗牌
        shufflePokers(ret);
        System.out.println(ret);

        ArrayList<Poker> person1 = new ArrayList<>();
        ArrayList<Poker> person2 = new ArrayList<>();
        ArrayList<Poker> person3 = new ArrayList<>();
        //三个人揭牌
        List<ArrayList<Poker>> person = unveilPokers(person1, person2, person3, ret);


        for(int i = 0; i < person.size(); i++) {
            System.out.println(person.get(i));
        }

        System.out.println(ret);


    }

}
