package com.maheshbasapur.hello_world;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class ServerIPController {

    @GetMapping("/server-ip")
    public String getServerIp() {
        try {
            InetAddress ip = InetAddress.getLocalHost();
            return "Server IP Address: " + ip.getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return "Unable to determine IP address.";
        }
    }
}
