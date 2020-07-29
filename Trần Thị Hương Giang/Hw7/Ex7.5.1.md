(a)
The four values for elements are [ null, null ], [ obj, null ], [ null, obj ] and [ obj, obj ]

[ obj, null ] and [ null, obj ] are different at the representation level

(b)
The number of states = Element * size * front * back = 4*3*2*2 = 48 (total states).

(c) Of the 48 states, only 6 are reachable.

(d)
The exceptions (enqueue() on full queues and dequeue() on empty queues) as well as observer method. 
Result in "loop transitions from a state back to itself.

(e)
These are not shown on the diagram for clarity and from a grading perspective, aren't relevant. 
Labels on nodes show the values of the representation state variables : Elements, size, front and back.

(f)
Small test :

Queue q = new Queue();

Object obj = new Object();

q.enqueue(obj);

q.enqueue(obj);

q.dequeue();

q.enqueue(obj);

q.dequeue();

q.dequeue();

q.enqueue(obj);

q.dequeue();

