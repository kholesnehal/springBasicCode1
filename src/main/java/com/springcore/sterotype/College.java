package com.springcore.sterotype;

import java.security.Principal;

public class College {

    private Principal principal;

    public College(Principal principal) {
        this.principal = principal;
    }

    public Principal getPrincipal() {
        return principal;
    }

    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }
    public College()
    {}
    public void demo()
    {
        System.out.println("inside demo method");
    }
}
