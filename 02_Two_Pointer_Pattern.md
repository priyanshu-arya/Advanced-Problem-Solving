# Two Pointers Technique – Complete Deep Dive (Lecture Notes)

## 1. Why Two Pointers Matter (Big Picture)

The **Two Pointers Technique** is not just an optimization trick — it is a *thinking pattern*.

Whenever you see:

* Arrays or strings
* Especially **sorted arrays**
* Problems involving **pairs, subarrays, comparisons, or partitions**

👉 Two pointers should immediately come to mind.

### Core Idea (One Line)

> Use **two indices** to traverse a data structure in a coordinated way instead of using nested loops.

This often reduces:

* Time complexity from **O(n²) → O(n)**
* Space complexity to **O(1)**

---

## 2. Mental Models of Two Pointers (VERY IMPORTANT)

There are **4 major patterns** you must recognize.

### Pattern 1: Opposite Direction Pointers

```
L →        ← R
```

Used when:

* Array is sorted
* Looking for **pairs**, **conditions**, **comparisons**

Examples:

* Two Sum (sorted)
* Pair with given difference
* Container With Most Water

---

### Pattern 2: Same Direction (Fast & Slow)

```
S → → →
F → → → → →
```

Used when:

* Removing elements
* Modifying array in-place
* Detecting cycles

Examples:

* Remove duplicates
* Remove element
* Linked List cycle detection

---

### Pattern 3: Partitioning Pointers

```
< pivot | unknown | > pivot
```

Used when:

* Rearranging elements
* Categorization

Examples:

* Move zeros
* Dutch National Flag
* QuickSort partition

---

### Pattern 4: Sliding Window (Special Case)

```
[L ... R]
```

Used when:

* Subarrays
* Continuous segments

(This will be covered separately but conceptually related.)

---

## 3. Pattern 1: Pair Problems (Opposite Direction)

### Classic Problem: Pair with Given Sum (Sorted Array)

**Problem:**
Given a sorted array, find if there exists a pair with sum = X.

#### Brute Force

* Check all pairs
* Time: O(n²)

#### Two Pointer Insight

* Small + large comparison
* Adjust pointers logically

#### Algorithm

1. `left = 0`, `right = n-1`
2. Compute `sum = arr[left] + arr[right]`
3. If sum == X → success
4. If sum < X → move left
5. If sum > X → move right

#### Why It Works

* Sorted order gives **directional certainty**

---

### Interview Variations

* Pair with difference K
* Count number of valid pairs
* Closest pair to target
* 3Sum (extension of 2 pointers)

---

## 4. Pattern 2: Remove Duplicates (Fast & Slow)

### Problem: Remove Duplicates from Sorted Array

**Key Constraint:**

* Must be done **in-place**

### Insight

* Unique elements should be placed at the front
* Slow pointer tracks last unique element

### Pointer Roles

* `slow`: position of last unique
* `fast`: scanning the array

### Algorithm (Conceptual)

1. Initialize `slow = 0`
2. Traverse `fast` from index 1
3. If `arr[fast] != arr[slow]`

   * `slow++`
   * `arr[slow] = arr[fast]`

### Result

* First `slow + 1` elements are unique

---

### Common Mistake

* Thinking slow and fast must always move together

They move **conditionally**, not equally.

---

## 5. Pattern 3: Array Partitioning

### Core Idea

Rearrange array so that elements satisfy a condition relative to a pivot or rule.

---

### Example 1: Move All Zeros to End

**Goal:**

```
[0,1,0,3,12] → [1,3,12,0,0]
```

### Two Pointer Logic

* `slow`: position to place next non-zero
* `fast`: scans array

### Invariant

```
[non-zero | unprocessed | zeros]
```

---

### Example 2: Dutch National Flag Problem

Sort array of 0s, 1s, 2s.

Pointers:

* `low` → boundary of 0s
* `mid` → current
* `high` → boundary of 2s

This is **multi-pointer partitioning**.

---

## 6. Hands-On: Sorted Array Problems

### Problem Set (Must Practice)

#### Easy

* Two Sum II
* Remove Duplicates from Sorted Array
* Squares of a Sorted Array

#### Medium

* 3Sum
* Container With Most Water
* Partition Array According to Pivot

#### Hard

* Trapping Rain Water
* Minimum Window Substring (advanced extension)

---

## 7. Pattern Recognition Checklist (EXAM GOLD)

Ask yourself:

1. Is the array sorted?
2. Do I need pairs or comparisons?
3. Can I shrink search space using logic?
4. Can I do this in-place?

If YES → Two Pointers.

---

## 8. Most Asked Interview Questions (Topic-wise)

### Pair Problems

* Two Sum II
* Pair with Given Difference
* 3Sum / 4Sum

### Remove / Modify

* Remove Duplicates
* Remove Element
* Move Zeros

### Partitioning

* Sort Colors
* Segregate Even and Odd
* Partition Labels

### Advanced

* Container With Most Water
* Trapping Rain Water

---

## 9. Common Interview Traps

* Forgetting array is sorted
* Moving both pointers blindly
* Breaking invariants
* Using extra space unnecessarily

---

## 10. Final Takeaway

Two pointers is not about code.

It is about:

* **Maintaining invariants**
* **Directional decision making**
* **Replacing brute force with logic**

Master this, and **half of array problems disappear**.
