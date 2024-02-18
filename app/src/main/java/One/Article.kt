package One

class Article(val author: String, val title: String) {

    // using the override .toString method to print the articles in the following order:
    override fun toString(): String {
        return "Author: $author, Title: $title";
    }
}