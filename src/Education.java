public class Education {


    private String [] schools = {"Harvard",
            "Maryland",
            "Penn State",
            "Clemson",
            "UMBC",
            "Duke",
            "Kentucky",
            "Standford",
            "Princeton",
            "Georgia Tech"};

    // constructor
    public Education (){}

    // instance methods
    public String[] getSchools() {
        return schools;
    }

    @Override
    public String toString (){
        StringBuffer out = new StringBuffer();
        for (String school: schools)
            out.append(school + "\n");
        return out.toString();
    }
}