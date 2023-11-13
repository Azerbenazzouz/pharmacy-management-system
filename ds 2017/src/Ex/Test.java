package Ex;

public class Test {
    public static void main(String[] args) {
        QCM qcm = new QCM("POO");
        QuestionRepUnique Q1 = new QuestionRepUnique("Java est un langage","POO");
        Q1.setTabRepProposees(new String[]{"compilé","interprété","compilé et interprété"});
        Q1.setRepCorrecte("compilé et interprété");
        QuestionRepUnique Q2 = new QuestionRepUnique("L'interprétation du langage JAVA est effectuée par","POO");
        Q2.setTabRepProposees(new String[]{"API","JDK","JVM"});
        Q2.setRepCorrecte("JVM");
        qcm.ajouterQuestion(Q1);
        qcm.ajouterQuestion(Q2);
        System.out.println("Score : " + qcm.repondreQCM());
    }
}
