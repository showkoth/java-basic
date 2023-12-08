
Collection Framework (Interface) ---> Set, List, Queue (Interface) --->
    List <> ArrayList, Vector, LinkedList, Stack (Implementation)
    Set <> HashSet, LinkedHashSet, TreeSet (Implementation)
Q   Queue <> PriorityQueue, LinkedList (Implementation)

Collection Framework (Interface) Methods
    int size()
    boolean isEmpty()
    boolean add(T o) // T = Generic Java class
    boolean addAll(Collection<?> c)
    boolean remove(T o)
    boolean removeAll(Collection<?> c)
    boolean contains(T o)
    boolean containsAll(Collection<?> c)
    Object[] toArray()
    Iterator<E> iterator()


List (Interface) Methods
    All Collection Framework method
    void add(int index, E element)
    E remove(int index)
    E get(int index)
    E set(int index, E element)
    int indexOf(Element e)
    int lastIndexOf(Element e)

List -> ArrayList, Vector, LinkedList, Stack (Implementation)
ArrayList -> Not thread safe, Faster (In 99% cases, we use arraylist)
Vector -> Same as ArrayList (Vector is thread safe), Slower
    CopyOnWriteArrayList - thread safe, better than vector
    

Stack (Data Structure)
    LIFO = Last In First Out 

Stack Functions
    E push(E item)
    E pop()
    E peek()
    boolean empty()
