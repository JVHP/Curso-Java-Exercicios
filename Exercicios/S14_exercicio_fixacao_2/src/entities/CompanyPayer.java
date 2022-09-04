package entities;

public class CompanyPayer extends Payer {

    private Integer numberOfEmployees;

    public CompanyPayer() {
        super();
    }

    public CompanyPayer(String name, Double anualIncome, Integer numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double taxes() {
        if (numberOfEmployees > 10) {
            return (anualIncome * 0.14);
        } else {
            return (anualIncome * 0.16);
        }
    }
}
