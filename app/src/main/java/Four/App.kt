package Four

fun main() {

    // Creating the objects:
    val post1: RedditPost = RedditPost("Harry", "Wingardium Leviosa");
    val post2: RedditPost = RedditPost("Ron", "Expecto Patronum");
    val post3: RedditPost = RedditPost("Hermione", "Ocsulus Reparo");
    val post4: RedditPost = RedditPost("Draco", "Avada Kedavra");

    // Setting the votes using the method getAndSetVotes:
    post1.getAndSetVotes(689, 465);

    post2.getAndSetVotes(785, 43);

    post3.getAndSetVotes(1762, 67);

    post4.getAndSetVotes(18, 5677);

    // Inserting all the objects into a list using the class RedditPost to implement it:
    val listOfPosts: List<RedditPost> = listOf(post1, post2, post3, post4);

    // now I'll sort the list in a descending order to see what post has most upVote/downVote balance:
    val sortingListOfPost = listOfPosts.sortedDescending()

    // then I print the list to one object at a time in a descending order based on the upVote/downVote balance:
    sortingListOfPost.forEach { println(it) }


    // 4.5

    // first I'll initialize the class RedditFrontPage:
    val listThePosts = RedditFrontPage()

    // Using the add post method I'll add the new posts using the RedditPost constructor:
    listThePosts.addRedditPost(RedditPost("Harry", "Wingardium Leviosa"))
    listThePosts.addRedditPost(RedditPost("Ron", "Expecto Patronum"))

    //using the method to delete a post on index 0
    listThePosts.deleteARedditPost(0);

    // then i use the viewAllPosts method to vies all the posts not in the front page:
    listThePosts.viewAllPosts()


}