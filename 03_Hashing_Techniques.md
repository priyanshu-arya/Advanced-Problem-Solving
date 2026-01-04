# Advanced Strings & Hashing

## 1. Why Strings + Hashing Are Interview Favorites

Strings look simple but hide **complex patterns**.
Hashing turns brute-force string logic into **linear-time solutions**.

Interviewers love these topics because they test:

* Pattern recognition
* Data structure choice
* Time–space trade-offs
* Edge-case handling

> Most FAANG-level string problems are **hashing problems in disguise**.

---

## 2. Core Mental Model (VERY IMPORTANT)

Every advanced string problem can be reduced to:

```
Characters → Frequency / Mapping → Pattern Check
```

If you can answer:

1. *What am I counting?*
2. *How do I compare two states efficiently?*

You are 70% done.

---

## 3. Hashing Fundamentals for Strings

### What is Hashing (Practically)?

Hashing = storing information in a way that gives **O(1)** average access.

For strings, hashing is usually:

* `dict / map<char, int>` → frequency
* `dict / map<string, int>` → pattern tracking
* Encoded keys (tuples, strings)

---

### When to Use Hashing in Strings

Use hashing when:

* Order does **not** matter
* Frequency matters
* You need fast lookup or comparison

Avoid hashing when:

* Order matters strictly (use two pointers / DP)

---

## 4. Pattern 1: Character Frequency Counting

### Classic Problems

* Valid Anagram
* First Unique Character
* Majority Element (string version)

### Core Pattern

```
for char in string:
    freq[char] += 1
```

### Key Insight

Frequency maps **compress information** about strings.

Two strings are anagrams **iff** their frequency maps are equal.

---

### Interview Trap

* Forgetting lowercase vs uppercase
* Ignoring Unicode / ASCII assumptions

---

## 5. Pattern 2: Frequency Comparison Between Windows

### Problem Type

* Permutation in String
* Find All Anagrams in a String

### Mental Model

```
Target Frequency == Window Frequency ?
```

This combines:

* Sliding window
* Hashing

### Invariant

At every step:

```
window_size == target_size
```

And we compare frequency states.

---

### Optimization Insight

Instead of comparing full maps:

* Track **match count**
* Or track **difference counter**

This converts O(26) checks into O(1).

---

## 6. Pattern 3: Pattern Mapping (Isomorphic Strings)

### Problem

Determine if two strings follow the same pattern.

Example:

```
egg → add (valid)
foo → bar (invalid)
```

### Key Idea

Mapping must be:

* One-to-one
* Consistent

### Technique

Use **two hash maps**:

* s → t
* t → s

Why two?
Because mapping must be **bijective**.

---

### Interview Trap

Using only one map leads to false positives.

---

## 7. Pattern 4: Encoding Patterns (Group Anagrams)

### Problem

Group words that are anagrams.

### Two Encoding Strategies

#### Method 1: Sorted String Key

```
"eat" → "aet"
```

Time: O(n·k log k)

#### Method 2: Frequency Signature

```
[1,0,0,0,1,0,...]
```

Time: O(n·k)

This is **interview gold**.

---

### Why Encoding Works

Different strings with the **same structure** map to the same key.

---

## 8. Pattern 5: Hashing for Substrings

### Problems

* Longest Substring Without Repeating Characters
* Longest Repeating Character Replacement

### Mental Model

```
Expand → detect violation → shrink
```

Hashing tracks:

* Last seen index
* Frequency inside window

---

### Key Insight

Hash map allows you to **jump pointers**, not move step-by-step.

---

## 9. Pattern 6: Prefix Hashing (Advanced)

Used in:

* Rolling hash
* String matching

Idea:
Precompute hash values so substring hash is computed in O(1).

This is more common in **competitive programming**, but knowing the idea helps.

---

## 10. Most Asked Interview Questions (Topic-wise)

### Frequency Based

* Valid Anagram
* First Unique Character
* Sort Characters by Frequency

### Window + Hashing

* Permutation in String
* Find All Anagrams
* Minimum Window Substring

### Pattern Mapping

* Isomorphic Strings
* Word Pattern

### Encoding / Grouping

* Group Anagrams
* Encode and Decode Strings

### Substring Hashing

* Longest Substring Without Repeating Characters
* Longest Repeating Character Replacement

---

## 11. Pattern Recognition Checklist

Ask yourself:

1. Do characters repeat?
2. Does order matter?
3. Do I need frequency or position?
4. Can I encode this pattern?

If frequency or mapping appears → **Hashing**.

---

## 12. Common Interview Mistakes

* Comparing maps directly in loops
* Forgetting to remove characters when window shrinks
* Using unnecessary sorting
* Overusing extra space

---

## 14. Final Takeaway

Advanced string problems are not about strings.

They are about:

* **State representation**
* **Efficient comparison**
* **Maintaining invariants**

Once you see the pattern, the solution becomes obvious.
