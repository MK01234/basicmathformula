package sg.edu.rp.c346.basicmathformula;

/**
 * Created by 17045740 on 17/7/2018.
 */

public class FormulaList {
    private String type;
    private String math;
    private String formula;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public FormulaList(String math, String formula, String type) {
        this.math = math;
        this.formula = formula;
        this.type = type;

    }

    public String getMath() {
        return math;
    }

    public void setMath(String math) {
        this.math = math;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    @Override
    public String toString() {
        return "MovieItem{" +
                "name='" + math + '\'' +
                ", date='" + formula + '\'' +
                "type" + type +
                '}';
    }
}

