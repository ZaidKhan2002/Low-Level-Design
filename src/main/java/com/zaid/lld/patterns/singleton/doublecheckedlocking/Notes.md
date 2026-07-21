# Double-Checked Locking Singleton

## Definition

> A thread-safe Lazy Singleton that synchronizes only during the first object creation.

Double-Checked Locking reduces synchronization overhead by locking only when the Singleton instance has not yet been created.

---

## Implementation

```java
public class DatabaseConnection {

    private static volatile DatabaseConnection instance;

    private DatabaseConnection() {}

    public static DatabaseConnection getInstance() {

        if(instance == null) {

            synchronized(DatabaseConnection.class) {

                if(instance == null) {
                    instance = new DatabaseConnection();
                }

            }

        }

        return instance;

    }

}
```

---

## Why Two Checks?

First check:

Determines whether synchronization is required.

Second check:

Ensures another thread did not already create the object while the current thread was waiting for the lock.

---

## Why `volatile`?

`volatile` prevents instruction reordering and ensures visibility of updates across threads.

Without it, another thread could observe a reference to a partially initialized object.

---

## Advantages

- Lazy initialization
- Thread-safe
- Better performance than synchronized Singleton
- Synchronization only during first creation

---

## Disadvantages

- More difficult to understand
- Requires `volatile`
- More code than simpler implementations

---

## Interview Questions

### 1. Why are there two null checks?

The first avoids unnecessary synchronization.

The second prevents multiple object creation after acquiring the lock.

---

### 2. Why is `volatile` required?

To prevent instruction reordering and guarantee visibility of the initialized instance to other threads.

---

### 3. Is Double-Checked Locking thread-safe?

Yes, when implemented correctly with `volatile`.

---

### 4. Why is it faster than synchronized Singleton?

Synchronization is used only during the first object creation. Later calls return immediately.

---

## Common Mistakes

### Mistake 1

Removing the second null check.

This can allow multiple objects to be created.

---

### Mistake 2

Forgetting `volatile`.

This may expose a partially initialized object to other threads.

---

## Key Takeaway

> Double-Checked Locking combines Lazy Initialization with thread safety while minimizing synchronization overhead by locking only during the first initialization.