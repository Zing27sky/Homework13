public class Main {
    public static void main(String[] args) {
        Author lTolstoy = new Author("Lev", "Tolstoy");
        Book posleBala = new Book(lTolstoy, "Posle bala", 1911);
        System.out.println(posleBala);
        System.out.println(posleBala.getName());
        System.out.println(posleBala.getAuthor());
        System.out.println(posleBala.getPublicationYear());
        posleBala.setPublicationYear(1999);
        System.out.println(posleBala.getPublicationYear());

        Author aPushkin = new Author("Alexandr", "Pushkin");
        Book prorok = new Book(aPushkin, "Prorok", 1828);
        System.out.println(prorok);
        System.out.println(prorok.getName());
        System.out.println(prorok.getAuthor());
        System.out.println(prorok.getPublicationYear());
        prorok.setPublicationYear(1888);
        System.out.println(prorok.getPublicationYear());

    }
}