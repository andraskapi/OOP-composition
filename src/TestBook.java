public class TestBook {
    public static void main(String[] args) {
        Author aPal = new Author("Alap Pal","palalap@mail.com",'m');
        Book bookOne = new Book("First Book",aPal,0,0);
        Book bookTwo = new Book("More book",new Author("Kal Man","mankal@mail.com",'m'),3000,15);


        bookOne.setPrice(2145);
        bookOne.setQty(17);

        System.out.println("name is: " + bookOne.getName());
        System.out.println("price is: " + bookOne.getPrice());
        System.out.println("qty is: " + bookOne.getQty());
        System.out.println("Authoris: " + bookOne.getAuthor() );
        System.out.println("Author's name: " + bookOne.getAuthor().getName());
        System.out.println("Author's email: " + bookOne.getAuthor().getEmail());
        System.out.println(bookTwo);
        System.out.println(bookTwo.getAuthorName());
        System.out.println(bookTwo.getAuthorEmail());
        System.out.println(bookTwo.getAuthorGender());


    }
}
