package it.hellsm.demo.subreddit.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import it.hellsm.demo.subreddit.dto.CommentsDto;
import it.hellsm.demo.subreddit.model.Comment;
import it.hellsm.demo.subreddit.model.Post;
import it.hellsm.demo.subreddit.model.User;

@Mapper(componentModel = "spring")
public interface CommentMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "text", source = "commentsDto.text")
    @Mapping(target = "createdDate", expression = "java(java.time.Instant.now())")
    @Mapping(target = "post", source = "post")
    @Mapping(target = "user", source = "user")
    Comment map(CommentsDto commentsDto, Post post, User user);

    @Mapping(target = "postId", expression = "java(comment.getPost().getPostId())")
    @Mapping(target = "userName", expression = "java(comment.getUser().getUsername())")
    CommentsDto mapToDto(Comment comment);
}