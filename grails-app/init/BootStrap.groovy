import java.time.*;

class BootStrap {

    def init = { servletContext ->
       LocalDateTime.metaClass.constructor = { LocalDateTime.now() }
    }
    def destroy = {
    }
}
