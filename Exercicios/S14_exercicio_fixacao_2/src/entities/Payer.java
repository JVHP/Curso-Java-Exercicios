package entities;

public abstract class Payer {

    protected String name;
    protected Double anualIncome;

    public Payer() {
    }

    public Payer(String name, Double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnualIncome() {
        return anualIncome;
    }

    public void setAnual_income(Double anualIncome) {
        this.anualIncome = anualIncome;
    }

    public abstract Double taxes();

    public String toString() {
        return name + ": " + String.format("$ %.2f", taxes());
    }
}
