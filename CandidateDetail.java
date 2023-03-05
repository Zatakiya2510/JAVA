import java.util.*;

public class CandidateDetail {
    public static void main(String[] args) {
        Candidate c1 = new Candidate();
        c1.getCandidateDetails(101, "Abhishek", 19, 80.5f, 5.9f);
        c1.displayCandidateDetails();
        Candidate c2 = new Candidate();
        c2.getCandidateDetails(0, null, 0, 0, 0);
        c2.displayCandidateDetails();
    }
}

class Candidate {
    int id;
    String name;
    int age;
    float weight;
    float height;

    Candidate() {
        id = 0;
        name = "Undefined";
        age = 0;
        weight = 0.0f;
        height = 0.0f;

    }

    public void getCandidateDetails(int id, String name, int age, float weight, float height) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;

    }

    public void displayCandidateDetails() {
        System.out.println("Candidate_Id:" + id + "\nCandidate_Name:" + name + "\nCandidate_Age:" + age
                + "\nCandidate_Weight:" + weight +
                "\nCandidate_Height:" + height);

    }
}
