package classdefs;

public class VIPStudent extends Student {
    private long moneySpent;
    public VIPStudent(String name, double gpa, long money) {
        super(name, gpa);
        this.moneySpent = money;
    }

    @Override
    public String toString() {
        return "VIPStudent("+ super.toString() + "){" + "moneySpent=" + moneySpent + '}';
    }
}
