class Main {
    public static void main(String[] args) {
        User user1 = new User();
        user1.doSomething();

        User user2 = new User("Jude", 2003, 6, 29);
        user2.doSomething();

        Admin admin = new Admin("Nicolas", 1978, 9, 3);
        admin.doSomething();
    }
}
