package ariabd.login.utsmobdev.models

data class LoginResponse(val error: Boolean, val message:String, val user: User)