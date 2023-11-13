package Ex;

public class QuestionRepUnique extends Question{

    private String repCorrecte;

    public QuestionRepUnique(String EQ, String TQ) {
        super(EQ, TQ, 0);
    }

    public void setRepCorrecte(String RC) {
        this.repCorrecte = RC;
    }

    public int numRepCorrecte() {
        for(int i = 0;i< this.tabRepProposees.length;i++){
            if(this.tabRepProposees[i].equals(this.repCorrecte)){
                return i;
            }
        }
        return -1;
    }
}
