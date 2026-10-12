package br.com.oracle_certificatons.ocp.javaee7.ejb;

import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Singleton
@Startup
public class HeartbeatTimer {

    /** persistent = false: o timer não sobrevive a um restart do servidor. */
    @Schedule(hour = "*", minute = "*/5", persistent = false)
    public void beat() {
        System.out.println("[HeartbeatTimer] tick");
    }
}
