package com.example.za

class Validator {
    fun email_all(email: String): Boolean {
        var resultemail = false
        if (email.length >= 6 && (email.contains("@"))) {
            resultemail = true
        }
        return resultemail
    }
    fun enterPassword_regestration(password: String): Boolean {
        var resultpassword = false
        if (password.length >= 7) {
            resultpassword = true
        }
        return resultpassword
    }
}
