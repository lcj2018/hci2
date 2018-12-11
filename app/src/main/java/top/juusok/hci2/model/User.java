package top.juusok.hci2.model;

public class User {
    private static User instance = new User();

    private static int id,coins,stars,sex;
    private static String name;
    private static int[] day = new int[43];

    private User(){modify(2,"girl",3,9,2);}

    public static User getInstance()
    {
        return instance;
    }

    public void setInstance(int id)
    {
        if(id==1) {
            modify(1, "boy", 10, 12, 1);
            setDay(1, 3);
            setDay(2, 4);
            setDay(3, 4);
            setDay(4, 3);
        } else {
            modify(2,"girl",3,9,2);
            setDay(1,2);
            setDay(2,3);
            setDay(3,3);
            setDay(4,2);
        }
    }

    public void modify(int id, String name, int coins, int stars, int sex)
    {
        this.id = id;
        this.coins = coins;
        this.stars = stars;
        this.sex = sex;
        this.name = name;
    }

    public void setDay(int th, int cnt)
    {
        day[th] = cnt;
    }

    public int getId()
    {
        return id;
    }

    public int getCoins()
    {
        return coins;
    }

    public int getStars()
    {
        return stars;
    }

    public int getSex()
    {
        return sex;
    }

    public int getDay(int t)
    {
        return day[t];
    }
}