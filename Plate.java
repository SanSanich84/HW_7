package HomeWork_7;

public class Plate {
    private int food;
    private int param;

    public int getParam() {
        return param;
    }

    public void plateAddFood(int foodCount){
        this.food = foodCount;
}

    public int getFood() {
        return food;
    }

    public int omNomNom(int apiece){
        this.param = 0;
        this.param = this.food -= apiece;

       if (this.param < 0) {
        apiece += this.param;
       this.food = 0;
       this.param = apiece;
       }
       System.out.printf("Содержимое тарелки уменьшилось на %d. Осталось %d.\n", apiece, this.food);
        return this.param;
    }

}
