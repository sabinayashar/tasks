package ada.wm2;

public class User {
    private String fullName;
    private String user;
    private String password;
    private boolean userLogged;
    private int totalScore;
    private String startDate;
    private String endDate;


    public User(String fN, String us, String pass, boolean uLog) {
        fullName = fN;
        user = us;
        password = pass;
        userLogged = uLog;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public boolean isUserLogged() {
        return userLogged;
    }

    public void setUserLogged(boolean userLogged) {
        this.userLogged = userLogged;
    }

    public String getFullName() {return fullName;}
    public String getUser() {return user;}
    public String getPassword() {return password;}
    public int getTotalScore() {return totalScore;}

    public void setFullName(String fN) {fullName = fN;}
    public void setUser(String us) {user = us;}
    public void setPassword(String pass) {password = pass;}
    public void setTotalScore(int totalScore) {this.totalScore = totalScore;}
}
