package top.juusok.hci2;

public class User {
    private int id,coins,stars,sex;
    private String name;
    private int[] day = new int[43];

    public User(){}

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