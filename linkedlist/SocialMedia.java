import java.util.*;

class User {
    int id;
    String name;
    int age;
    List<Integer> friends;
    User next;

    User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.friends = new ArrayList<>();
    }
}

class SocialNetwork {
    User head = null;

    void addUser(int id, String name, int age) {
        User u = new User(id, name, age);
        u.next = head;
        head = u;
    }

    User findUser(int id) {
        User temp = head;
        while (temp != null) {
            if (temp.id == id) return temp;
            temp = temp.next;
        }
        return null;
    }

    void addFriendConnection(int id1, int id2) {
        User u1 = findUser(id1);
        User u2 = findUser(id2);
        if (u1 != null && u2 != null && id1 != id2) {
            if (!u1.friends.contains(id2)) u1.friends.add(id2);
            if (!u2.friends.contains(id1)) u2.friends.add(id1);
        }
    }

    void removeFriendConnection(int id1, int id2) {
        User u1 = findUser(id1);
        User u2 = findUser(id2);
        if (u1 != null && u2 != null) {
            u1.friends.remove((Integer) id2);
            u2.friends.remove((Integer) id1);
        }
    }

    void displayFriends(int userId) {
        User u = findUser(userId);
        if (u != null) {
            System.out.print("Friends of " + u.name + ": ");
            for (int fid : u.friends) System.out.print(fid + " ");
            System.out.println();
        }
    }

    void searchByName(String name) {
        User temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                System.out.println(temp.id + " " + temp.name + " " + temp.age);
            }
            temp = temp.next;
        }
    }

    void searchById(int id) {
        User u = findUser(id);
        if (u != null) System.out.println(u.id + " " + u.name + " " + u.age);
    }

    void countFriendsForEachUser() {
        User temp = head;
        while (temp != null) {
            System.out.println(temp.name + " has " + temp.friends.size() + " friend(s)");
            temp = temp.next;
        }
    }

    void findMutualFriends(int id1, int id2) {
        User u1 = findUser(id1);
        User u2 = findUser(id2);
        if (u1 != null && u2 != null) {
            Set<Integer> mutual = new HashSet<>(u1.friends);
            mutual.retainAll(u2.friends);
            System.out.print("Mutual friends of " + u1.name + " and " + u2.name + ": ");
            for (int fid : mutual) System.out.print(fid + " ");
            System.out.println();
        }
    }

    void displayAllUsers() {
        User temp = head;
        while (temp != null) {
            System.out.println(temp.id + " " + temp.name + " " + temp.age);
            temp = temp.next;
        }
    }
}

class Main {
    public static void main(String[] args) {
        SocialNetwork net = new SocialNetwork();
        net.addUser(1, "Alice", 22);
        net.addUser(2, "Bob", 24);
        net.addUser(3, "Charlie", 21);
        net.addUser(4, "David", 23);

        net.addFriendConnection(1, 2);
        net.addFriendConnection(1, 3);
        net.addFriendConnection(2, 3);
        net.addFriendConnection(3, 4);

        net.displayAllUsers();
        net.displayFriends(1);
        net.displayFriends(2);
        net.displayFriends(3);

        net.findMutualFriends(1, 2);
        net.findMutualFriends(1, 3);
        net.findMutualFriends(2, 3);

        net.countFriendsForEachUser();

        System.out.println("Search by Name:");
        net.searchByName("Charlie");

        System.out.println("Search by ID:");
        net.searchById(4);

        System.out.println("Removing friend connection between 1 and 3");
        net.removeFriendConnection(1, 3);
        net.displayFriends(1);
        net.displayFriends(3);
    }
}
