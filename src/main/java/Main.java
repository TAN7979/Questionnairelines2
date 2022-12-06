public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.patronymic = "Иванович";
        post.surname = "Иванов";
        post.passport = "4444" + " № " + "444444";
        post.phone = "+7(999)-999-99-99";
        post.subscription = true;
        post.birthday = new FromDate();
        post.birthday.day = 1;
        post.birthday.month = 1;
        post.birthday.year = 2000;

    }
}
