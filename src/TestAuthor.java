public class TestAuthor {
    public static void main(String[] args) {
        Author kBela = new Author("Kis Béla","bela.kis@gmal.com",'m');
        System.out.println("name is: " + kBela.getName());
        System.out.println("email is: " + kBela.getEmail());
        System.out.println("gender is: " + kBela.getGender());
    }
}
