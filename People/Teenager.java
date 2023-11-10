package People;

public class Teenager extends Human {
    protected int schoolNumber;
    protected int rating;  // средний балл

    public Teenager()
    {
        super();
        schoolNumber = 70;
        rating = 9;
    }

    public Teenager(int s, int r)
    {
        super();
        schoolNumber = s;
        rating = r;
    }

    public Teenager(int s,int r,  String f,boolean g, int a)
    {
        super(f, g, a);
        schoolNumber = s;
        rating = r;
    }

    public String Name(){return "Оля";}

    public int getRating() {
        return rating;
    }

    public int getSchoolNumber() {
        return schoolNumber;
    }

    public void print()
    {
        System.out.println("Данные о ребенке:");
        System.out.println("ФИО: "+fio);
        System.out.println("Пол:"+gender);
        System.out.println("Возраст"+age);
        System.out.println("Номер номер школы:"+schoolNumber);
        System.out.println("Успеваемость:"+rating);
    }
}
