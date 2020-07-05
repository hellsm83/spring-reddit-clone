package it.hellsm.demo.subreddit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.hellsm.demo.subreddit.model.Post;
import it.hellsm.demo.subreddit.model.Subreddit;
import it.hellsm.demo.subreddit.model.User;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}
