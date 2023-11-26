package innerClasses;

public class localInner {
    public static void main(String[] args) {
        outerO o = new outerO();
        System.out.println(o.x);

        o.display();
    }
}

class outerO {
    int x = 10;

    public void display() {
        class inner {
            int y = 20;

            public void show() {
                System.out.println(x);
                System.out.println(y);
            }
        }
        inner i = new inner();
        i.show();
    }
}