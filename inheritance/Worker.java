package inheritance;

interface Worker {
    void performDuties();
}

class Person {
    String name;
    int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class Chef extends Person implements Worker {
    public Chef(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println(name + " is preparing dishes.");
    }
}

class Waiter extends Person implements Worker {
    public Waiter(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println(name + " is serving tables.");
    }
}
