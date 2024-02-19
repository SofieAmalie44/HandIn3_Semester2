package Four

import java.text.SimpleDateFormat
import java.util.Date

// Creating the class: RedditPost and giving it two parameters in the contractor
class RedditPost( val author: String, val title: String): Comparable<RedditPost> {
    // also found that the kotlin interface Comparable can be used to compare the instances of RedditPost objects.

    // Making sure to make all the attributes are private:
    private var upVotes: Int = 1;
    private var downVotes: Int = 1;

    private var date: String = "";
    init {
        val sdf = SimpleDateFormat("dd-MM-yyyy HH-MM-SS");
        date = sdf.format(Date());

    }

    // now I can use getters and setters to access the private attributes:
    fun getAndSetVotes(upVotesNum: Int, downVotesNum: Int): Int {
        upVotes = upVotesNum;
        downVotes = downVotesNum;
        return upVotes and downVotes
    }

    // using the compareTo method to I can compare same type objects initialized by RedditPost:
    override fun compareTo(other: RedditPost): Int {
        val firstPost = this.upVotes - this.downVotes;
       println(firstPost)
        val secondPost = other.upVotes - other.downVotes;
       println(secondPost)
        val comparedPost = secondPost - firstPost;
        println(comparedPost)
        return comparedPost
    }

    // then I make sure to make the override .toString in order to print out the objects in the following way:
    override fun toString(): String {
        return "Author: $author, Title: $title, Timestamp: $date, Up-votes: $upVotes, Down-votes: $downVotes";
    }
}

