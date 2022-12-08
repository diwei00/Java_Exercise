package enumDemo;
//默认继承Enum类
//枚举不能被反射
public enum Colour {
    RED("aa", 10),BLACK("w", 20),GREEN("yy",50),WHITE("kk", 6);
    private String name;
    private int age;

    public static void main(String[] args) {
        Colour[] colours = Colour.values();
        for(int i = 0; i < colours.length; i++) {
            System.out.println(colours[i]);
        }
    }

    //枚举是一个类，通过类名就可以访问其中的枚举对象
    //构造方法必须是私有的
    //枚举对象在构造时，必须在后面调用构造方法，来调用
    private Colour(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
enum Color2 {
    //0 1 2 3
    RED,BLACK,GREEN,WHITE;

    public static void main(String[] args) {
        //将字符串转为枚举对象，需原来就包含此对象
        System.out.println(Color2.valueOf("WHITE"));
        //得到枚举实例
        Color2 color1 = Color2.RED;
        Color2 color2 = Color2.GREEN;
        System.out.println(color1.compareTo(color2));
        System.out.println(RED.compareTo(WHITE));
        System.out.println(WHITE.compareTo(BLACK));
        //用于switch case语句
        switch (RED) {
            case RED:
                System.out.println("aaaa");
                break;
            case BLACK:
                break;
            case GREEN:
                break;
            case WHITE:
                break;
        }
        Color2[] tmp = Color2.values();
        //获取枚举成员的索引位置
        System.out.println(tmp[2].ordinal());
    }
}
