package One

fun main() {

    // creating 5 articles
    val article1: Article = Article("Jane Austen", "Pride and Prejudice");
    val article2: Article = Article("Leo Tolstoy", "War and Peace");
    val article3: Article = Article("George Orwell", "1984");
    val article4: Article = Article("J.R.R. Tolkien", "The Lord of the Rings");
    val article5: Article = Article("J.K Rowling", "Harry Potter");

    // Creating an ArrayList and adding all the articles to it
    val articleList: ArrayList<Article> = arrayListOf(article1, article2, article3, article4, article5);
    println(articleList)

    // using a for loop to print every article in the ArrayList
    for (article in articleList) {
        println(article)
    }
}