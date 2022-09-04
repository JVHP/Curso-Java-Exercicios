package entities;

public class IndividualPayer extends Payer {

    private Double healthExpenditures;

    public IndividualPayer() {
        super();
    }

    public IndividualPayer(String name, Double anual_income, Double healthExpenditures) {
        super(name, anual_income);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double taxes() {
        if (anualIncome < 20000.00) {
            return (anualIncome * 0.15) - taxeHealthExpenditures();
        } else {
            return (anualIncome * 0.25) - taxeHealthExpenditures();
        }
    }

    public Double taxeHealthExpenditures() {
        if (healthExpenditures > 0.0) {
            return healthExpenditures * 0.50;
        }
        return 0.0;
    }

}
