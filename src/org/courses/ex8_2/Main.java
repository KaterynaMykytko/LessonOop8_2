package org.courses.ex8_2;

public class Main {
    public static void main(String[] args) {

        Device device = new Device("Samsung", 120, "AB1234567CD");
        Device monitor = new Monitor("Samsung", 120,"AB1234567CD",1280,
                1024);
        Device ethernetAdapter = new EthernetAdapter("Linksys", 100,
                "47E10GH4800001",100,"0:98:9D:1C:93:F6");

        System.out.println(monitor.toString());
        System.out.println(monitor.hashCode());
        System.out.println(ethernetAdapter.toString());
        System.out.println(ethernetAdapter.hashCode());
        System.out.println(device.equals(monitor));
        System.out.println(monitor.equals(ethernetAdapter));
    }
}
