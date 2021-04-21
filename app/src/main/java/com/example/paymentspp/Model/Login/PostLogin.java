package com.example.paymentspp.Model.Login;

import com.google.gson.annotations.SerializedName;

public class PostLogin {
    @SerializedName("status")
    String status;
    @SerializedName("result")
    String result;
    @SerializedName("message")
    String message;
    Login mLogin;

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Login getLogin() {
        return mLogin;
    }

    public void setLogin(Login mLogin) {
        this.mLogin = mLogin;
    }
}
