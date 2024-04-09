package Animals;

public class Bowl {
    private int foodAmount;
    public Bowl(int foodAmount) {
        this.foodAmount = foodAmount;
    }
    public void addFood(int amount) {
        foodAmount += amount;
        System.out.println("Добавлено " + amount + " еды в миску.");
    }
    public int getFoodAmount() {
        return foodAmount;
    }
    public void empty(int amount) {
        foodAmount = foodAmount - amount;
    }
}