package lab4;

//some parts taken from the lab4.solution.
public class Company {

    private HrPerson hr;

    public Company() {
        hr = new HrPerson();
    }

    public void hireEmployee(String firstName, String lastName, String ssn) {
        hr.hireEmployee(firstName, lastName, ssn);
        hr.outputReport(ssn);
    }

    public HrPerson getHr() {
        return hr;
    }

    public void setHr(HrPerson hr) {
        this.hr = hr;
    }

}
