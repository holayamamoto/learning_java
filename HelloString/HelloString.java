class HelloString {
    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            if (! args[i].isEmpty()) {
                System.out.println(args[i] + " ");
            }
        }
    }
}
