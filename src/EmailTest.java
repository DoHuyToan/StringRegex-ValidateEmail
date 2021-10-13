public class EmailTest {
    private static Email email;
    //tạo lớp email hợp lệ
    public static final String[] validEmail = new String[]{"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    //tạo lớp email ko hợp lệ
    public static final String[] invaliEmail = new String[]{"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

    public static void main(String[] args) {
        email = new Email();
        for (String e: validEmail) {
            boolean isvalid = email.validate(e);
            System.out.println("Email is " + email +" is valid: "+ isvalid);
        }
        for (String e: invaliEmail) {
            boolean isvalid = email.validate(e);
            System.out.println("Email is " + email +" is valid: "+ isvalid);
        }
    }
}
