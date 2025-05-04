package io.github.naveenb2004.fixes.reviews;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public final class Review {
    private String user;
    private LocalDateTime time;
    private int rating;
    private String comment;

    @Override
    public String toString() {
        return "User: " + user + ", Time: " + time + ", Rating: " + rating + ", Comment: " + comment;
    }
}
