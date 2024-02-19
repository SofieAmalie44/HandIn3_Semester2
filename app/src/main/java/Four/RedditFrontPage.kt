package Four

// Created the class RedditFrontPage
class RedditFrontPage() {

    // Made a variable containing an empty mutable list:
    val listOfPosts: MutableList<RedditPost> = mutableListOf()

    // method to be able to add a new post to the list:
        fun addRedditPost(post: RedditPost) {
            listOfPosts.add(post);
        }

    // method to delete a post based on what index the element is placed on:
        fun deleteARedditPost(index: Int) {
            if (index in 0 until listOfPosts.size) {
                listOfPosts.removeAt(index);
                println("Post with index: $index has been deleted");
            }
        }

    // method to show all the posts added to the list of posts:
    fun viewAllPosts() {
            println("The front page posts is: ");
            listOfPosts.forEachIndexed { index, post ->
                println("$index: Author: ${post.author}, Title: ${post.title}");
            }

        }
    }


