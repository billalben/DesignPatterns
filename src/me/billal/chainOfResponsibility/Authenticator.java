package me.billal.chainOfResponsibility;

import java.util.Objects;

public class Authenticator extends Handler {
    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Authentication");
        return !((Objects.equals(request.getUsername(), "admin")) && (Objects.equals(request.getPassword(), "1234")));
    }
}
