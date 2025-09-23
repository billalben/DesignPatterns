package me.billal.chainOfResponsibility;

import java.util.Objects;

public class Authenticator extends Handler {
    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Authentication");
        return !((Objects.equals(request.username(), "admin")) && (Objects.equals(request.password(), "1234")));
    }
}
