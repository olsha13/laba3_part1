package People;

public class Human {
    protected String fio;
    protected boolean gender; // true жен
    protected int age;

    public Human()
    {
        fio = "Раскоша Ольга Сергеевна";
        gender  = true;
        age = 20;
    }
    public Human(String f,boolean g)
    {
        fio = f;
        gender = g;
        age = 20;
    }
    public Human(String f,boolean g, int a)
    {
        fio = f;
        gender = g;
        age = a;
    }

    public String Name(){return "Ольга";}

    public int getAge() {
        return age;
    }

    public boolean getGender() {
        return gender;
    }

    public String getFio() {
        return fio;
    }

    public void print()
    {
        System.out.println("Данные о человеке:");
        System.out.println("ФИО: "+fio);
        System.out.println("Пол:"+gender);
        System.out.println("Возраст"+age);
    }
}
