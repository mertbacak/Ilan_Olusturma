public class Cat extends Animal {

    String breed;
    int humanYears;
    public Cat(String name, int age, String breed) {
        super(name, age);
        this.breed=breed;
    }

    @Override
    public void toStringg() {
        System.out.print("Name:"+getName()+"\n");
        System.out.print("Breed:"+breed+"\n");
        System.out.print("Age in calendar years:"+getAge()+"\n");
        getAgeInHumanYears(getAge());
        System.out.print("Age in human years:"+humanYears+"\n");
    }

    @Override
    int getAgeInHumanYears(int a) {
        int b;
        if (a<=2)
        {
            b= a+20;
        }
        else
        {
            b=(15+((a-1)*2));
        }
        humanYears=b;
        return b;
    }


}
