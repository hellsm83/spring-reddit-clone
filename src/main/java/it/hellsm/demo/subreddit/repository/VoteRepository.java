package it.hellsm.demo.subreddit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.hellsm.demo.subreddit.model.Post;
import it.hellsm.demo.subreddit.model.User;
import it.hellsm.demo.subreddit.model.Vote;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
