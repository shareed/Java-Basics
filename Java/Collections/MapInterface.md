## Map Interface
- Collection Framework implements the map interface
- not actually an Iterable, because it is not apart of the Collection Interface
- Unique Key/Value pairs
- Keys can’t be null
- Keys must refer to a value
- NOT iterable like the others
- NOT part of the collections framework
- Lookup/Delete is super fast
- But, loop through can be slow.

Methods
.put (key k, value v) -> add elements
.remove (key k, value v) -> remove element
.clear() -> remove all elements
.containsKey
.containsValue
.keyset() -> returns a set of the keys

Implementations
HashTable - no order to keys, no nulls
HashMap - no order to keys, one null key, any null values
TreeMap - has ordered keys (sorted)