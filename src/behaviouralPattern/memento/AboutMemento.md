Problem
Implementing state management features such as redo/undo or state restoration often requires access to an object’s internal details. Directly exposing these internals can break encapsulation and compromise functionality, making the system harder to maintain and more error‑prone.
Solution
Apply the Memento Pattern. This pattern allows capturing and storing snapshots of an object’s state in a memento. The key advantage is that the internal representation of the object remains hidden—state can be saved and restored without exposing or violating encapsulation.

