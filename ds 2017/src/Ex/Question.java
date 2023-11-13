package Ex;

public class Question {
    private String enonceQuestion;
    private final String themeQuestion;
    protected String[] tabRepProposees = new String[3];
    private int nbRepCorrectes;

    public Question(String EQ, String TQ , int NBC) {
        this.enonceQuestion = EQ;
        this.themeQuestion = TQ;
        this.nbRepCorrectes = NBC;
    }

    public void setTabRepProposees(String[] TRP) {
        this.tabRepProposees = TRP;
    }

    @Override
    public String toString() {
        String s = this.enonceQuestion + " (" + this.nbRepCorrectes + ")\n";
        for (int i = 0; i < this.tabRepProposees.length; i++) {
            s += (i + 1) + "- " + this.tabRepProposees[i] + "\n";
        }
        return s;
    }

    public boolean estIdentique(Question Q) {
        return this.enonceQuestion.equals(Q.enonceQuestion) && this.themeQuestion.equals(Q.themeQuestion);
    }

    public static boolean estIdentique(Question Q1, Question Q2) {
        return Q1.estIdentique(Q2);
    }

    public String getTheme() {
        return this.themeQuestion;
    }
}
