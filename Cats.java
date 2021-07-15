package HomeWork_7;

public class Cats {
    private String name;
    private int satiety;
    private int appetite;
    private  int sat;

    public Cats(String name, int satiety, int appetite) {
        this.name = name;
        this.satiety = satiety;
        this.appetite = appetite;
    }


    public void eat(Plate plate){
        plate.omNomNom(appetite);

        if (plate.getFood()>0){
            sat+=appetite;
        System.out.printf("Кот %s поел на %d\n", this.name, this.appetite);}
        else {
            sat+= plate.getParam();
            System.out.printf("Кот %s поел на %d\n", this.name, plate.getParam());
        }
if (sat>=satiety){
    System.out.printf("Кот %s СЫТ\n", this.name);
} else {
    System.out.printf("Кот %s НЕ СЫТ\n", this.name);
}


    }
}
