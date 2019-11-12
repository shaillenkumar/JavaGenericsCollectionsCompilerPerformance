Compile time bugs -> easy to detect and fix.
Runntime bugs -> diificult to catch and surface late


Chapter1 - Generics Types
Generics add stability to program.
Generics enables types for classes and interfaces to be parameters when defining Classes and Interfaces.
We can Reuse the Store for String , Double , Integer or Custom Type Objects
    1. Store.java
    2. StoreWithMultiParam.java
    3. GenericMethods.java
    4. BoundedTypeParam.java  - There are times when you want to restrict the types that can be
                                 accepted as an arg in Parameterized type.
                                 public static <T extends Comparable<T>> T calculate(T t1, T t2)
                                 -  Will accept any type T which extends Comparable Interface.
                                    Basically Integer, Double String all these classes extends Comparable.
    5. TypeInference.java - We will take a look at the compilers ability to look at each method invocation and the
                            corresponding declaration to determine the type argument/arguments and the
                            result that is being assigned or returned.
    6. WildCards -
            In Generics the <?> is called the wildcard represents an unknown type.It is used as a Parameter, Field or local variable.
            Never used as a type of argument for generic method invocation.
            An important fact in generics is
                Collection<String> c1 = new ArrayList<>();
                Collection<Object> c2 = c1; // is not valid, will result in compile time error.
                // Because Collection<String> is not a Collection<Object>
                // So a List<Employee> is not same as List<Person> Even if Employee extends Person.
                So we cannot print a List<Double> or List<Integer> since Collection<Object> is supertype of all type.
                    print(Collection<Object> c){
                        for(i in c){
                            print i
                        }
                    }
                We will treat the <?> wildcard as supertype of all kind of collection
                print(Collection<?> c){
                    for(i in c){
                        print i
                    }
                }
               add(new Object())  // this will cause compile time exception

               /// Lets consider another example

                public interface Shape{
                    public void draw();

                }
                class Circle extends Shape{
                    public void draw()  print Circle;
                }
                class Rectangle extends Shape{
                      public void draw()  print Rectangle;
                }

                drawCommon(List<Shape> l){
                    for(i in l){
                        draw i
                    }
                }// drawCommon() will not work That is why we have bounded wildcards

    8. UpperBoundedWildCardEx2.java & UpperBoundedWildCardEx1.java

     You can use an upper bounded wildcard to relax the restrictions on a variable.
     For example, say you want to write a method that works on List<Integer>, List<Double>, and List<Number>;
     you can achieve this by using an upper bounded wildcard.
     To declare an upper-bounded wildcard, use the wildcard character ('?'),
     followed by the extends keyword, followed by its upper bound.

     Upper Bounded Wildcards "? extends T"

        draw(List<? extends Shape) will accept List of any subclass of Shape so we can use it for
            List<Rectangle> or List<Circle>
        List<? extends Number> l = new ArrayList<Integer>();
        List<? extends Number> l = new ArrayList<Double>();
        List<? extends Number> l = new ArrayList<Number>();
        // All subclasses are valid above.

        add(new Number())  // this will cause compile time exception

    9.  LowerBoundedWildCard.java  - EX1 and EX2

            Lower Bound Wildcards "? super  T"
        add(new Number())  // this will not cause compile time exception


Collections:
===========

Collections extends java.lang.Iterable interface.
List, Queue, Set and Map extends Collection.
1. ArrayListDemo.java
    Random Access, Fast Read, Disadv with read, Adv over Arrays wrt Remove and allocation of capacity int[] arr = new int[10]
2. LinkedList.java
     Java implements doubly linked list -- which has references to previous and the next element
        3 <-> 4 <-> 6 <->1
        Remove is efficient - because only the refernces has to be removed
3. VectorDemo.java
    Vector is simialr to ArrayList but is synchronized. Multiple threads can manipulate the vector without inconsistency.
    new Vector(capacity, incrementalCapacity) - capacity is the initial capacity. the vector's storage increases by the incremental Capacity when the vector becomes full.
4. StackDemo.java
        Operates on LIFO structure. stack has the push(), pop() and the peek() method.
        pop() returns object from top of the stack and removes the object.
        peek() return object from top of the the stack but does not delete.
        push() method pushes object into the stack.
5. QueuedLinkedList.java
        Queues operates on the FIFO structure.
6. PriorityQueue.java
    We assign priority to each element. High Priority is served first. null is returned when queue is empty.
    peek() -> retrieves head of the queue but does not remove.
    poll() ->  retrieves and removes the head of the queue.
7. ArrayDeque is implementation of Deque interface. "deque" -> doubly ended queue. It is not ThreadSafe.
   We can insert and remove from both sides of the queue.
   Deque can be used both as Stack and Queue. When used as Stack it is faster than stack and when used as Queue it is
   faster than LinkedList
8. HashMapDemo.java -> Map cannot contain duplicate keys.
    TreeMap -> is sorted
    Hashtable -> is slow and synchronized, Will allow only one null key and many values.
    HashMap -> is not Synchronized
9. TreeMap.java - >  is a implementation of Map interface
                     COncrete implementation of red-black Tree.
                     Map is ordered according to natural ordering of its key or we can use Comparable for custom object.

10. HashsetDemo.java , LinkedHashSet.java -> implements HashSet and Set interface
        Iteration is unaffected by the capacity. It is not Synchronized.

