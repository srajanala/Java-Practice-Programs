package Collection;

public class Snippet {
	As already told capacity is simply the number of buckets where and Initial Capacity is the capacity of HashMap instance when it is created. The Load Factor is a measure that when rehashing should be done. Rehashing is a process of increasing the capacity. In HashMap capacity is multiplied by 2. Load Factor is also a measure that what fraction of the HashMap is allowed to fill before rehashing. When the number of entries in HashMap increases the product of current capacity and load factor the capacity is increased that is rehashing is done. If we keep the initial capacity higher then rehashing will never be done. But by keeping it higher it increases the time complexity of iteration. So it should be choosed very cleverly to increase the performance. The expected number of values should be taken into account to set initial capacity. Most generally preffered load factor value is 0.75 which provides a good deal between time and space costs. Load factor’s value varies between 0 and 1.
}

