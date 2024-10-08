class Tasksheet113 {
    public static void main(String[] args) {

        char a1 = 'H';
        char a2 = 'w';
        char a3 = 'r';
        char a4 = 'd';
        short s = 3;
        int i = 1;
        byte b = 0;
        float f = 2.0f;
        boolean bool = true;

        String output = String.valueOf(a1) + s + i + i + b + " " +
                        String.valueOf(a2) + b + String.valueOf(a3) + i + String.valueOf(a4) + " " +
                        f + " " + 
                        bool;

        System.out.println(output);
    }
}
