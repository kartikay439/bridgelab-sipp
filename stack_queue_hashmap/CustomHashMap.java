class MyHashMap<K, V> {
    private static final int SIZE = 16;
    private Entry<K, V>[] table = new Entry[SIZE];

    static class Entry<K, V> {
        K key; V value; Entry<K, V> next;
        Entry(K k, V v) { key = k; value = v; }
    }

    public void put(K key, V value) {
        int hash = key.hashCode() % SIZE;
        Entry<K, V> e = table[hash];
        if (e == null) {
            table[hash] = new Entry<>(key, value);
        } else {
            while (e.next != null) {
                if (e.key.equals(key)) {
                    e.value = value;
                    return;
                }
                e = e.next;
            }
            if (e.key.equals(key)) {
                e.value = value;
            } else {
                e.next = new Entry<>(key, value);
            }
        }
    }

    public V get(K key) {
        int hash = key.hashCode() % SIZE;
        Entry<K, V> e = table[hash];
        while (e != null) {
            if (e.key.equals(key)) return e.value;
            e = e.next;
        }
        return null;
    }
}

public class CustomHashMap {
    public static void main(String[] args) {
        MyHashMap<String, Integer> map = new MyHashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        System.out.println(map.get("a")); // 1
    }
}