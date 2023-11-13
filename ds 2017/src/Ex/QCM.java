package Ex;

import java.util.Scanner;

public class QCM {
    
    private String themeQCM;
    private QuestionRepUnique[] tabQuestions = new QuestionRepUnique[30];
    private int nbQuestions;
    Scanner sc = new Scanner(System.in);
    
    public QCM(String themeQCM) {
        this.themeQCM = themeQCM;
    }

    public void ajouterQuestion(QuestionRepUnique q) {
        if(this.nbQuestions < 30) {
            this.tabQuestions[this.nbQuestions] = q;
            this.nbQuestions++;
        }else {
            System.out.println("Le QCM est plein");
        }
    }

    public int repondreQCM() {
        int score = 0;
        for (QuestionRepUnique q : this.tabQuestions) {
            if (q == null) return score;
            System.out.println(q.toString());
            System.out.println("Votre réponse : ");
            if(q.numRepCorrecte() == sc.nextInt()-1) {
                score++;
            }
        }
        return score;
    }
}
