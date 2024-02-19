package Five

fun main() {

    val words = listOf("apple", "banana", "apple", "orange", "banana", "apple", "orange", "banana", "apple","banana", "apple", "orange", "banana","banana", "apple", "orange", "apple", "orange", "banana")

    val mapWords: MutableMap<String, Int> = mutableMapOf();

    for (word in words) {
        val wordCount = mapWords.getOrDefault(word, 0);
        mapWords[word] = wordCount + 1;
    }
    for ((word, count) in mapWords) {
        println("Word: $word, Count: $count");
    }
}