package People;

public class Parent extends Human {
    protected int countChildren;
    protected String workPlace;

    public Parent()
    {
        super();
        countChildren = 2;
        workPlace = "бгуир";
    }

    public Parent(int c, String w)
    {
        super();
        countChildren = c;
        workPlace = w;
    }

    public Parent(int c,String w,  String f,boolean g, int a)
    {
        super(f, g, a);
        countChildren = c;
        workPlace = w;
    }

    public String Name(){
        return "Ольга";
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public int getCountChildren() {
        return countChildren;
    }

    public void print()
    {
        System.out.println("Данные о ребенке:");
        System.out.println("ФИО: "+fio);
        System.out.println("Пол:"+gender);
        System.out.println("Возраст"+age);
        System.out.println("Место работы:"+workPlace);
        System.out.println("Количество детей:"+countChildren);
    }
    
}
