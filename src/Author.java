public class Author {
    private String name;
    private String email;
    private char gender;  // char of either 'm' or 'f'

    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }
    @Override
    public String toString(){
        return "Author[name=" + this.name + ",email=" + this.email +
        ",gender=" + this.gender + "]";
    }
}
