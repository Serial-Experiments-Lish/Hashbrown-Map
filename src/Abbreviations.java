import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> brev;
    static Abbreviations abbrev = new Abbreviations();
    private String explanation;

    public static void main(String[] args) throws Exception {
        abbrev.addAbbreviation("ttyl", "talk to you later");
        abbrev.addAbbreviation("ngl", "not gonna lie");
        abbrev.addAbbreviation("isdj", "i strongly dislike java");
        abbrev.addAbbreviation("itidi", "i think i did it");
    }

    public Abbreviations() {
        this.brev = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        brev.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        if(this.brev.containsKey(abbreviation)) {
            System.out.println("Already got it, boss!");
            return true;
        } else {
            return false;
        }
    }

    public String findExplanationFor(String abbreviation) {
        if(abbrev.hasAbbreviation(abbreviation)) {
            explanation = abbrev.findExplanationFor(abbreviation);
        }
        System.out.println(explanation);

        return explanation;
    }

    public String getExplanation() {
        return this.explanation;
    }
}