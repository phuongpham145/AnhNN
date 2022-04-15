public class StudentManageData {
    public boolean isEmail(String st){
        String pattern = "\\w+@\\w+\\.\\w+";
        return st.matches(pattern);
    }
    public boolean isPhoneNumber(String st){
        String pattern = "0\\d{9}";
        return st.matches(pattern);
    }
    public boolean isCCDD(String st){
        String pattern = "\\d{9}";
        return st.matches(pattern);
    }
}
