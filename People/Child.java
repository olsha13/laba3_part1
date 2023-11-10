package People;

public class Child extends Human{
    protected int gardenNumber;

    public Child()
    {
        super();
        gardenNumber = 34;
    }

    public Child(int g)
    {
        super();
        gardenNumber = g;
    }

    public Child(int g, String f,boolean gg, int a)
    {
        super(f, gg, a);
        gardenNumber = g;
    }

    public String Name(){return "Ольчик";}


    public int getGardenNumber() {
        return gardenNumber;
    }

    public void print()
    {
        System.out.println("Данные о ребенке:");
        System.out.println("ФИО: "+fio);
        System.out.println("Пол:"+gender);
        System.out.println("Возраст"+age);
        System.out.println("Номер детского сада:"+gardenNumber);
    }

    
}
