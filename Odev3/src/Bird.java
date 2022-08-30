public class Bird extends Animal{
    String breed;
    int humanYears;
    public Bird(String name, int age, String breed) {
        super(name, age);
        this.breed=breed;
    }

    @Override
    int getAgeInHumanYears(int a) {
        int b;
        if (a<=2)
        {
            b= a+15;
        }
        else
        {
            b=(22+((a-2)*3));
        }
        humanYears=b;
        return b;
    }

    @Override
    public void toStringg() {
        System.out.print("Name:"+getName()+"\n");
        System.out.print("Breed:"+breed+"\n");
        System.out.print("Age in calendar years:"+getAge()+"\n");
        System.out.print("Age in human years:"+getAgeInHumanYears(getAge())+"\n");
    }


}
