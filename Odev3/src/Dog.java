import java.util.Scanner;

public class Dog extends Animal{

    String breed;
    int humanYears;

    public Dog(String name, int age,String breed) {
        super(name, age);
        this.breed=breed;
    }

    @Override
    int getAgeInHumanYears(int a) {
        int b;
        if (a<=2)
        {
           b= a+11;
        }
        else
        {
           b=(22+((a-2)*5));

        }
        humanYears=b;
        return b;
    }

    @Override
    public void toStringg() {
        System.out.print("Name:"+getName()+"\n");
        System.out.print("Breed:"+breed+"\n");
        System.out.print("Age in calendar years:"+getAge()+"\n");
        getAgeInHumanYears(getAge());
        System.out.print("Age in human years:"+(humanYears)+"\n");
    }

    public boolean equals(String name,int age,String breed){
        if ((getName().equals(name) && (getAge()==age) && (this.breed.equals(breed))))
        {
            System.out.println("true");
            return true;
        }
        else
        {
            System.out.println("false");
            return  false;
        }

    }
}

