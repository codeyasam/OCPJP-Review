/* Obtaining Synchronized Collections 
*
* Besides the concurrent collection classes that we have covered, the Concurrency API also includes methods for obtaining synchronized versions of existing non0-concurrent collection objects. 

* Synchronized Collections methods
* Method nmae:
* synchronizedCollection(Collection<T> c)
* synchronizedList(List<T> list)
* synchronizedMap(Map<K, V> m)
* synchronizedNavigableMap(Navigable<K, V> m)
* synchronizedNavigableSet(NavigableSet<T> s)
* synchronizedSet(Set<T> s)
* synchronizedSortedMap(SortedMap<K, V> m)
* synchronizedSortedSet(SortedSet<T> s)

// above collection methods synchronize access to the data elements, such as the get() and set() methods, they do not synchronize access on any iterations that you may create from the synchronized collection. Therefore it is imperative to use synchronization block if needed to iterate over the returned collections 

List<Integer> list = Collections.synchronizedList(new ArrayList<>(Arrays.asList(4, 3, 52)));
synchronized(list) {
    for (int data: list) {
        System.out.println(data);
    }
}

// unlike the concurrent collections, the synchronized collections also throw an exception if they are modified within an iterator by a single thread. For example

Map<String, Object> foodData = new HashMap<>();
foodData.put("penguin", 1);
foodData.put("flamingo", 2);
Map<String, Object> synchronizedFoodData = Collections.synchronizedMap(foodData);
for (String key: synchronizedFoodData.keySet()) {
    synchronizedFoodData.remove(key); // throws a ConcurrentModificationException
}


*/